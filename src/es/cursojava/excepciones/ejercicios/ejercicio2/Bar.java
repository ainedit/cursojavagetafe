package es.cursojava.excepciones.ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.excepciones.ejercicios.ejercicio2.exceptions.TooColdTemperatureException;
import es.cursojava.excepciones.ejercicios.ejercicio2.exceptions.TooHotTemperatureException;

public class Bar {
	private String nombre;
	
	public Bar(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		
		Bar bar = new Bar("Casa Pepe");
		System.out.println(bar.nombre);
		bar.abrirBar();
		
	}
	
	private void abrirBar() {
		List<Cliente> clientes = crearClientes ();
		
		for (Cliente cliente : clientes) {
			
			if (cliente instanceof ClienteCafetero) {
				TazaCafe taza = new TazaCafe("Colombia");
				try {
					((ClienteCafetero) cliente).tomarCafe(taza);
				} catch (TooHotTemperatureException | TooColdTemperatureException e) {
					System.out.println("El cliente no está contento le pongo otro café "+e.getMessage());
				}
			}else {
				System.out.println("El cliente "+cliente.getNombre() + " no puede tomar café");
			}
		}
				
	}
	
	private List<Cliente> crearClientes () {
		Comensal comensal = new Comensal("Comensal1",false);
		
		ClienteAsiduo clienteAsiduo = new ClienteAsiduo("Asiduo","Pepillo");
		
		Huesped huesped = new Huesped("Huesped1","123123A");
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(huesped);
		clientes.add(clienteAsiduo);
		clientes.add(comensal);
		
		return clientes;
		
	}
}
