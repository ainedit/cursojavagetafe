package es.cursojava.interfaces.suscripciones;

public class Piloto implements SuscripcionGratuita{
	private String nombre;
	private int horasVuelo;

	public Piloto(String nombre, int horasVuelo) {
		super();
		this.nombre = nombre;
		this.horasVuelo = horasVuelo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHorasVuelo() {
		return horasVuelo;
	}

	public void setHorasVuelo(int horasVuelo) {
		this.horasVuelo = horasVuelo;
	}

	@Override
	public String toString() {
		return "Piloto [nombre=" + nombre + ", horasVuelo=" + horasVuelo + "]";
	}

	@Override
	public void leerInformes() {
		System.out.println("Piloto "+nombre +" leyendo informes");
		
	}

}
