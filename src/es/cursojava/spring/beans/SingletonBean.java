package es.cursojava.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
	public SingletonBean() {
		System.out.println("CREADO SingletonBean: " + this);
	}
	
	public void saludo() {
		System.out.println("Hola, soy el SingletonBean: " + this);
	}
}
