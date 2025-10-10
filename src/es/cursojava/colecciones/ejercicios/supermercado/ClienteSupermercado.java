package es.cursojava.colecciones.ejercicios.supermercado;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.productos.Alimentos;

public class ClienteSupermercado {
	private String nombre;
	private List<Alimentos> carritoCompra;
	
	public ClienteSupermercado(String nombre) {
		super();
		this.nombre = nombre;
		this.carritoCompra = new ArrayList<Alimentos>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Alimentos> getCarritoCompra() {
		return carritoCompra;
	}
	public void setCarritoCompra(List<Alimentos> carritoCompra) {
		this.carritoCompra = carritoCompra;
	}
	
	public void addAlimento (Alimentos alimento) {
		this.carritoCompra.add(alimento);
	}
	
	@Override
	public String toString() {
		return "ClienteSupermercado [nombre=" + nombre + ", carritoCompra=" + carritoCompra + "]";
	} 
	
	
}
