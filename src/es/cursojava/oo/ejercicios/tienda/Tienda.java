package es.cursojava.oo.ejercicios.tienda;

public class Tienda {

	public static void main(String[] args) {
		new Producto();
		Producto producto1 = new Producto("Prod1", 6.5, 20);
		Producto producto2 = new Producto("Prod2", 10.5, 2);
		Producto producto3 = new Producto("Prod3", 9.5, 70);

		Producto[] productos = {producto1,producto2,producto3};
		
		for (Producto producto : productos) {
			producto.mostrarInfo();
		}
		
		double total = UtilidadesTienda.calcularValorInventario(productos);
		System.out.println("Valor total "+ total);
	}

}
