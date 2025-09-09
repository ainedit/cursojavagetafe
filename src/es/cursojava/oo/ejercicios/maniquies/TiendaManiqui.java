package es.cursojava.oo.ejercicios.maniquies;

public class TiendaManiqui {

	private String nombre;
	//private Maniqui[] maniquies;
	
	public TiendaManiqui(String nombre) {
		super();
		//this.maniquies = new Maniqui[3];
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		TiendaManiqui tienda = new TiendaManiqui("Tienda1");
		Maniqui[] ms = tienda.abrirTienda();
		System.out.println(ms[2].getCamisa().getColor());
		tienda.vestirManiquies(ms);
		//System.out.println(ms[2].getCamisa().getColor());
		tienda.mostrarEscaparate(ms);
	}

	public Maniqui[] abrirTienda() {
		Boton b1 = new Boton("Rojo","Redondo","Pequeño");
		Boton b2 = new Boton("Rojo","Redondo","Pequeño");
		Boton b3 = new Boton("Rojo","Redondo","Pequeño");
		Boton[] botones = {b1,b2};
		Vestido vestido = new Vestido("Verde","M",40);
		Pantalon pantalon = new Pantalon("Azul","40",50,b3);
		Camisa camisa = new Camisa("Blanca","L",40,botones);
		
		Maniqui maniqui1 = new Maniqui(1);
		Maniqui maniqui2 = new Maniqui(2,vestido);
		Maniqui maniqui3 = new Maniqui(3,camisa, pantalon);
		
		Maniqui[] maniquies= {maniqui1,maniqui2,maniqui3};
//		maniquies[0] = maniqui1;
//		maniquies[1] = maniqui2;
//		maniquies[2] = maniqui3;
		
		return maniquies;
	}
	
	public void vestirManiquies (Maniqui[] maniquiesVestir) {
		
		//maniquiesVestir[2].getCamisa().setColor("Negro");
		
		for (Maniqui maniqui : maniquiesVestir) {
			
		}
		
	}
	
	
	public void mostrarEscaparate(Maniqui[] maniquies) {
		
		//maniquies[2].getCamisa().getBotones()[1].getForma();
		
		for (Maniqui maniqui : maniquies) {
			
		}
		
	}
	
}



