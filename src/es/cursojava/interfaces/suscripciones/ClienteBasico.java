package es.cursojava.interfaces.suscripciones;

public class ClienteBasico extends Cliente 
		implements SubscripcionBasica {
	private String notas;

	public ClienteBasico(String nombre, String notas) {
		super(nombre);
		this.notas = notas;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	@Override
	public void leerInformes() {
		System.out.println("Cliente "+ getNombre() +" leyendo informes");
		
	}

	@Override
	public void crearInformes() {
		System.out.println("Cliente "+ getNombre() +" creando informes");
		
	}
	
}
