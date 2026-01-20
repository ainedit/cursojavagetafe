package es.cursojava.spring.beans.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Pointcut: todos los métodos del paquete service
    @Pointcut("execution(* es.cursojava.spring.beans.service..*(..))")
    public void serviceLayer() {}

    @Before("serviceLayer()")
    public void before(JoinPoint jp) {
        System.out.println("[BEFORE] -> " + jp.getSignature() + " args=" + java.util.Arrays.toString(jp.getArgs()));
    }

    @After("serviceLayer()")
    public void after(JoinPoint jp) {
        System.out.println("[AFTER]  -> " + jp.getSignature() + " (siempre, haya o no excepción)");
    }

    @AfterReturning(pointcut = "serviceLayer()", returning = "result")
    public void afterReturning(JoinPoint jp, Object result) {
        System.out.println("[AFTER_RETURNING] -> " + jp.getSignature() + " result=" + result);
    }

    @AfterThrowing(pointcut = "serviceLayer()", throwing = "ex")
    public void afterThrowing(JoinPoint jp, Throwable ex) {
        System.out.println("[AFTER_THROWING] -> " + jp.getSignature() + " ex=" + ex.getClass().getSimpleName() + " msg=" + ex.getMessage());
    }

    @Around("serviceLayer()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        long t0 = System.currentTimeMillis();
        try {
            System.out.println("[AROUND - BEFORE] -> " + pjp.getSignature());
            Object res = pjp.proceed(); // ejecuta el método real
            System.out.println("[AROUND - AFTER RETURN] -> " + pjp.getSignature());
            return res;
        } catch (Throwable ex) {
            System.out.println("[AROUND - AFTER THROW] -> " + pjp.getSignature());
            throw ex;
        } finally {
            long t1 = System.currentTimeMillis();
            System.out.println("[AROUND - FINALLY] -> " + pjp.getSignature() + " timeMs=" + (t1 - t0));
        }
    }
}
