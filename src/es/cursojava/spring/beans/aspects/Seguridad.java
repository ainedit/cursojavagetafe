package es.cursojava.spring.beans.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import es.cursojava.enums.Rol;
import es.cursojava.spring.aop.SecurityException;
import es.cursojava.spring.beans.calculadora.services.CalculadoraService;

@Aspect
@Component
public class Seguridad {
	//@Pointcut("execution(* es.cursojava.spring.beans.calculadora.services.CalculadoraService.calcular(..)) 
	// || execution(* es.cursojava.spring.beans.calculadora.services.OtraService.calcular(..))")
	//@Pointcut("execution(* es.cursojava.spring.beans.calculadora.services.CalculadoraService.calcular(..))")
	@Pointcut("execution(* es.cursojava.spring.beans.calculadora.services..*.calcular(..))")
	private void seguridadCalcular(){};
	
	//@Around("!execution(* es.cursojava.spring.beans.calculadora.services.CalculadoraService.calcular(..))")
	//@Around("@annotation(es.cursojava.anotaciones.SoloAdmin)")
	@Around("seguridadCalcular()")
	public Object alrededorDeEjecutar(ProceedingJoinPoint point) throws Throwable {
		System.out.println("Point Around lanzado: "+point.toString());
		CalculadoraService serv = (CalculadoraService)point.getTarget();
		System.out.println(serv.getUsuario().getNombre());
		System.out.println(serv.getUsuario().getRol());
		
		serv.getUsuario().setRol(Rol.USER.toString());
		
		//point.getArgs, array con los argumentos que se le pasan al m�todo, si no se le llama con argumentos el array estara vacio
		//System.out.println("tamaño de argumentos: "+point.getArgs().length);
		System.out.println("Condición" +serv.getUsuario().getRol().equals(Rol.ADMIN.toString()));
		
		if (!serv.getUsuario().getRol().equals(Rol.ADMIN.toString())) {
	        throw new SecurityException("Usuario sin permisos");
	    }

	    try {
	        return point.proceed();
	    } catch (Throwable ex) {
	        System.out.println("Excepción REAL: " + ex.getClass().getName());
	        throw ex; // IMPORTANTÍSIMO: re-lanzar
	    }
		
	}
	
	@Before("seguridadCalcular()")
	public void antesDeEjecutar() {
		System.out.println("Antes de ejecutar el método calcular");
	}
	
}
