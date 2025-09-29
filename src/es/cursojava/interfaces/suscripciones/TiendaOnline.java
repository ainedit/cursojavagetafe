package es.cursojava.interfaces.suscripciones;

import java.util.ArrayList;
import java.util.List;

public class TiendaOnline {
	private String url;
	
	public static void main(String[] args) {
		//Cliente c = new Cliente("cliente1");
		
		SuscripcionGratuita gratis = new ClienteBasico("cliente3", "Notas3");
		
		List<String> listados = new ArrayList<String>();
		
		
		ClienteBasico cb = new ClienteBasico("cliente2", "Notas2");
		leerInformes(cb);
		crearInformes(cb);
		//enviarInformes(cb);
		
		Piloto p1 = new Piloto("Piloto1",1200);
		
		leerInformes(p1);
	
		ClienteVip vip = new ClienteVip("VIP1", "Mensual");
		leerInformes(vip);
		crearInformes(vip);
		enviarInformes(vip);
	}
	
	
	private static void leerInformes(SuscripcionGratuita cliente) {
		cliente.leerInformes();
	}
	
	private static void crearInformes(SubscripcionBasica clienteBasico ) {
		clienteBasico.crearInformes();
	}
	
	private static void enviarInformes(SuscripcionPremium clientePremium) {
		clientePremium.enviarInformes();;
	}
	
}
