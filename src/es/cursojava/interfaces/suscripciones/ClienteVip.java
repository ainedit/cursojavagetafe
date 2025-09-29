package es.cursojava.interfaces.suscripciones;

public class ClienteVip extends Cliente implements SuscripcionPremium{
	String tipoFacturacion;//Mensual o anual

	public ClienteVip(String nombre, String tipoFacturacion) {
		super(nombre);
		this.tipoFacturacion = tipoFacturacion;
	}

	public String getTipoFacturacion() {
		return tipoFacturacion;
	}

	public void setTipoFacturacion(String tipoFacturacion) {
		this.tipoFacturacion = tipoFacturacion;
	}

	@Override
	public void crearInformes() {
		System.out.println("Cliente "+ getNombre() +" creando informes");
		
	}

	@Override
	public void leerInformes() {
		System.out.println("Cliente "+ getNombre() +" leyendo informes");
		
	}

	@Override
	public void enviarInformes() {
		System.out.println("Cliente "+ getNombre() +" enviando informes");
		
	}
	
	
	
}
