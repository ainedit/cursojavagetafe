package es.cursojava.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.cursojava.spring.beans.AlumnoSpring;
import es.cursojava.spring.beans.AulaService;
import es.cursojava.spring.beans.AulaService2;

public class Main {
	public static void main(String[] args) {
		try (var ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			System.out.println("Empezamos la aplicacion Spring");
			var a1 = ctx.getBean(es.cursojava.spring.beans.SingletonBean.class);
			var a2 = ctx.getBean(es.cursojava.spring.beans.SingletonBean.class);
			System.out.println("Singleton mismo objeto? " + (a1 == a2));

//			System.out.println("Probano PrototypeBean:");
//			var p1 = ctx.getBean(es.cursojava.spring.beans.PrototypeBean.class);
//			var p2 = ctx.getBean(es.cursojava.spring.beans.PrototypeBean.class);
//			System.out.println("Prototype mismo objeto? " + (p1 == p2));

//			System.out.println("Contexto arrancado.");
//			System.out.println("Pido LazyBean...");
//			ctx.getBean(es.cursojava.spring.beans.LazyBean.class);

			// Probando AutoWiring
//			var ts = ctx.getBean(es.cursojava.spring.beans.TicketService.class);
//			System.out.println(ts.newTicketId());
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(ts.newTicketId());

			// Probando configuración por JavaConfig
			// En AppConfig tenemos definido un bean AlumnoSpring con id "alumnoSpring"
			// y otro con id "alumnoSpringOtro"
//			AlumnoSpring a1 = (AlumnoSpring) ctx.getBean("alumnoSpring");
//			AlumnoSpring a2 = ctx.getBean("alumnoSpringOtro", AlumnoSpring.class);
//
//			System.out.println("a1 = " + a1);
//			System.out.println("a2 = " + a2);
//
//			System.out.println("¿Misma instancia a1? " + (a1 == ctx.getBean("alumnoSpring")));
//			System.out.println("¿a1 y a2 son el mismo? " + (a1 == a2));

			// Descomentar @Service en AulaService
//			AulaService aula = ctx.getBean(AulaService.class);
//			aula.mostrarAlumnos();
//			AulaService2 aula2 = ctx.getBean(AulaService2.class);
//			aula2.mostrarAlumnos();

		}
	}
}