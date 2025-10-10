package es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.productos;

public class Aguacate extends Alimentos {
	private String origen;

	public Aguacate(int id, String nombre, int precio, String fechaCaducidad, String origen) {
		super(id, nombre, precio, fechaCaducidad);
		this.origen = origen;
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
