package es.cursojava.interfaces.ejercicios.limpieza;

public class MainMueblesYVerduras {

	public static void main(String[] args) {

		Mesa mesa1 = new Mesa("Marrón", "Rectangular");
		Silla silla1 = new Silla("Negra", 4);
		Lechuga lechuga1 = new Lechuga("España", "Romana");
		JudiasVerdes judiasVerdes1 = new JudiasVerdes("Méjico", true);

		desinfectar(lechuga1);
		desinfectar(judiasVerdes1);
		
		Limpiable[] limpios = {mesa1,silla1,lechuga1,judiasVerdes1};
		limpiar(limpios);
	}
	
	private static void desinfectar(Desinfectable d) {
		d.limpiar();
		d.desinfectar();
	}
	
	private static void limpiar(Limpiable[] limpios) {
		for (Limpiable limpiable : limpios) {
			limpiar(limpiable);
		}
	}
	
	private static void limpiar(Limpiable limpio) {
		limpio.limpiar();
	}
	
	
	
	
	
}
