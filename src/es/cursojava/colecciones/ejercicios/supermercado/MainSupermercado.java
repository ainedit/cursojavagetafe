package es.cursojava.colecciones.ejercicios.supermercado;

import java.util.List;
import java.util.Set;

import es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.productos.Alimentos;
import es.cursojava.utils.Utilidades;

public class MainSupermercado {

	public static void main(String[] args) {
		
		MainSupermercado main = new MainSupermercado();
		Supermercado supermercado = main.abrirSupermercado();
		main.iniciarCompras(supermercado);
		main.pagar(supermercado.getClientes());
	}
	
	private void pagar (Set<ClienteSupermercado> clientes) {
		System.out.println("=========== Pagando =================");
		for (ClienteSupermercado clienteSupermercado : clientes) {
			List<Alimentos> productos = clienteSupermercado.getCarritoCompra();
			double total = 0.0;
			System.out.println("Cliente "+clienteSupermercado.getNombre());
			System.out.println("Lista de la compra: ");
			
			for (Alimentos alimento : productos) {
				System.out.println("\t"+ alimento.getNombre() + "-" + alimento.getPrecio());
				total += alimento.getPrecio();
			}
			System.out.println("\tTotal compra:" +total);
		}
		
	}
	
	private Supermercado abrirSupermercado () {
		//Creamos clientes
		ClienteSupermercado cliente1 = new ClienteSupermercado("Cliente1");
		ClienteSupermercado cliente2 = new ClienteSupermercado("Cliente2");
		
		
		//List<List<Alimentos>> stock = importarProductos();
		Supermercado supermercado = new Supermercado("Super1");
		supermercado.importarProductos();
		
		supermercado.addCliente(cliente2);
		supermercado.addCliente(cliente1);
		
		return supermercado;
	}
	
	private void iniciarCompras (Supermercado supermercado) {
		
		Set<ClienteSupermercado> clientes =  supermercado.getClientes();
		
		for (ClienteSupermercado clienteSupermercado : clientes) {
			System.out.println("\nBienvenido "+clienteSupermercado.getNombre());
			System.out.println("Tienes los siguientes productos");
			
			
			
			String respuesta = "";
			do {
				List<List<Alimentos>> alimentos = supermercado.getStockAlimentos();
				
				for (List<Alimentos> listaAlimentos : alimentos) {
					int numProductos = listaAlimentos.size();
					if (numProductos>0) {
						System.out.println(listaAlimentos.getFirst().getClass().getSimpleName() 
							+ "-"+ numProductos);
					}
				}
				
				String producto = Utilidades.pideDatoCadena("Qué producto deseas?");
				int cantidad = Utilidades.pideDatoNumerico("Cuantas unidades?");
				
				for (List<Alimentos> listaAlimentos : alimentos) {
					if (listaAlimentos.size()>0) {
						String productoRecorrido = listaAlimentos.getFirst().getClass().getSimpleName();
						if (producto.equalsIgnoreCase(productoRecorrido)) {
							
							for (int i = 0; i < cantidad; i++) {
								System.out.println("Eliminando "+producto);
								Alimentos alimento = listaAlimentos.getLast();
								clienteSupermercado.addAlimento(alimento);
								listaAlimentos.removeLast();
							}
							
						}
					}
				}
				
				respuesta = Utilidades.pideDatoCadena("Deseas algo más");
			}while (respuesta.equalsIgnoreCase("si"));
		}
		
	}

}
