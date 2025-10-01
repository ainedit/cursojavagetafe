package es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.productos;

public class Movil extends ProductosElectronicos {
	private String tipoCobertura;
	
	public Movil(int id, String nombre, int precio, String fechaFabricacion, String tipoCobertura) {
		super(id, nombre, precio, fechaFabricacion);
		this.tipoCobertura = tipoCobertura;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub

	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void select() {
		// TODO Auto-generated method stub

	}

}
