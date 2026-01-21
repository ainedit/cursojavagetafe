package es.cursojava.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Usuario {

	@Value("Juan Perez")
	private String nombre;
	@Value("ADMIN")
	private String rol;
	
	public Usuario() {
		System.out.println("Usuario creado");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
}
