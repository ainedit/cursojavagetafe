package es.cursojava.oo.ejercicios.biblioteca;

public class Direccion {
	private String calle;
	private String ciudad;
	private int codPostal;
	public Direccion(String calle, String ciudad, int codPostal) {
		super();
		this.calle = calle;
		this.ciudad = ciudad;
		this.codPostal = codPostal;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	
	public void mostrarDireccion() {
		System.out.println("Direccion [calle=" + calle + ", ciudad=" + ciudad + ", codPostal=" + codPostal + "]");
	}
	
	
	
}
