package es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.productos;

public class Platano extends Alimentos {
	private String variedad;
	
	public Platano(int id, String nombre, int precio, String fechaCaducidad) {
		super(id, nombre, precio, fechaCaducidad);
		// TODO Auto-generated constructor stub
	}

	public Platano(int id, String nombre, int precio, String fechaCaducidad, String variedad) {
		super(id, nombre, precio, fechaCaducidad);
		this.variedad = variedad;
	}
	
	
	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub

	}

	@Override
	public void select() {
		// TODO Auto-generated method stub

	}

}
