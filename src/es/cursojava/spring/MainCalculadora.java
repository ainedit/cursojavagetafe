package es.cursojava.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.cursojava.spring.beans.calculadora.services.CalculadoraService;
import es.cursojava.spring.beans.calculadora.services.CalculadoraService2;

public class MainCalculadora {

	public static void main(String[] args) {
		try(var ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
			CalculadoraService calc = ctx.getBean(CalculadoraService.class);
			System.out.println("Usuario: " + calc.getUsuario().getNombre() + " - Rol: " + calc.getUsuario().getRol());
			
			double a = 10;
			double b = 5;
			
			try {
				System.out.println(calc.calcular(a, b, "suma"));
			} catch (SecurityException e) {
				System.out.println("Excepción SecurityException al realizar la suma: " + e.getMessage());
			}catch (Exception e) {
				System.out.println("Otra excepción al realizar la suma: " + e.getMessage() + "-" + e.getClass().getSimpleName());
			}
//			System.out.println(calc.calcular(a, b, "resta"));
//			System.out.println(calc.calcular(a, b, "multiply"));
//			System.out.println(calc.calcular(a, b, "divide"));
//			
			
			//CalculadoraService2 calc2 = ctx.getBean(CalculadoraService2.class);
			
			//System.out.println(calc2.calcular("^",2.0,3.0));
			
			
			
		}
	}
	
}
