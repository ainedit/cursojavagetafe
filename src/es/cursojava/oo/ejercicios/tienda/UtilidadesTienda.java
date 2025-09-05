package es.cursojava.oo.ejercicios.tienda;

public class UtilidadesTienda {
	public static double calcularValorInventario(Producto[] productos) {
		double valor = 0;
		for (Producto producto : productos) {
			valor += producto.calcularValorTotal();
		}
		
		return valor;
	}
}
