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
		tienda.vestirManiquies(ms);
		tienda.mostrarEscaparate(ms);
		tienda.cerrar(ms);
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
			if (!maniqui.isEstaVestido()) {
			//if (maniqui.getCamisa()==null && maniqui.getVestido()==null) {
				System.out.println("El maniqui "+ maniqui.getId() + " no tiene ropa");
				Vestido vestido = new Vestido("Azul","M",60);
				System.out.println("Le pongo un vestido");
				maniqui.vestir(vestido);
			}
		}
		
	}
	
	
	public void mostrarEscaparate(Maniqui[] maniquies) {
		
		for (Maniqui maniqui : maniquies) {
			System.out.println("Maniqui "+ maniqui.getId());
			double precioRopa = 0;
			if (maniqui.getPantalon()!=null) {
				System.out.println("Pantalon");
				Pantalon pantalon = maniqui.getPantalon();
				System.out.println("color: "+ pantalon.getColor());
				System.out.println("talla: "+ pantalon.getTalla());
				System.out.println("precio: "+pantalon.getPrecio());
				precioRopa += pantalon.getPrecio();
			}
			if (maniqui.getCamisa()!=null) {
				System.out.println("Camisa");
				Camisa camisa = maniqui.getCamisa();
				System.out.println("color: "+ camisa.getColor());
				System.out.println("talla: "+ camisa.getTalla());
				System.out.println("precio: "+camisa.getPrecio());
				
				precioRopa += camisa.getPrecio();
			}
			if (maniqui.getVestido()!=null) {
				System.out.println("Pantalon");
				Vestido vestido = maniqui.getVestido();
				System.out.println("color: "+ vestido.getColor());
				System.out.println("talla: "+ vestido.getTalla());
				System.out.println("precio: "+vestido.getPrecio());
				
				precioRopa += vestido.getPrecio();
			}
			
			System.out.println("El precio de la ropa del maniqui "
					+maniqui.getId() +" es " + precioRopa);
		}
		
	}
	
	public void cerrar (Maniqui[] maniquies) {
		for (Maniqui maniqui : maniquies) {
			maniqui.desvestir();
		}
	}
	
}



