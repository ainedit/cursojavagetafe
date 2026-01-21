package es.cursojava.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import es.cursojava.enums.Rol;
import es.cursojava.spring.beans.calculadora.services.CalculadoraService;

@Aspect
public class Seguridad {
	//@Pointcut("execution(* es.cursojava.spring.beans.calculadora.services.calcular(..)) || execution(* spring.aop.aop4.*.*Asegurado(..))")
	@Pointcut("execution(* es.cursojava.spring.beans.calculadora.services.calcular(..))")
	private void seguridadCalcular(){};
	
	//@Around("!execution(* es.cursojava.spring.beans.calculadora.services.calcular(..))")
	//@Around("@annotation(es.cursojava.anotaciones.SoloAdmin)")
	@Around("seguridadCalcular()")
	public Object alrededorDeEjecutar(ProceedingJoinPoint point) throws SecurityException{
		System.out.println("Point Around lanzado: "+point.toString());
		CalculadoraService serv = (CalculadoraService)point.getTarget();
		System.out.println(serv.getUsuario().getNombre());
		
		//serv.getUsuario().setRol("USER");
		
		//point.getArgs, array con los argumentos que se le pasan al m�todo, si no se le llama con argumentos el array estara vacio
		//System.out.println("tamaño de argumentos: "+point.getArgs().length);
		
		if (serv.getUsuario().getRol().equals(Rol.ADMIN.toString())) {
			Object objetoDevuelto=null;
			try {
				objetoDevuelto = point.proceed();
			} catch (Throwable e) {
				e.printStackTrace();
			}
			return objetoDevuelto;
		}else{
			throw new SecurityException("Usuario sin permisos");
		}
		
	}
}
