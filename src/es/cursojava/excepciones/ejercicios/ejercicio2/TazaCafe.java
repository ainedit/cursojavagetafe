package es.cursojava.excepciones.ejercicios.ejercicio2;

public class TazaCafe {
	private double temperatura;
	private String tipo;
	
	public TazaCafe(String tipo) {
		super();
		this.temperatura = Math.random()*100;
		this.tipo = tipo;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}
