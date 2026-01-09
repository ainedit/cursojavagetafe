package es.cursojava.bbdd;

import java.sql.SQLException;

public class Puerta implements AutoCloseable {
	private String color;

	public Puerta(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	void abrir() {
		System.out.println("Abriendo la puerta");
	}

	@Override
	public void close() throws Exception {
		try {
			System.out.println("Cerrando la puerta");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
