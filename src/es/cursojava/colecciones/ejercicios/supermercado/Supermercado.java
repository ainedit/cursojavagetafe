package es.cursojava.colecciones.ejercicios.supermercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.productos.Aguacate;
import es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.productos.Alimentos;
import es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.productos.Platano;
import es.cursojava.interfaces.ejercicios.produtovehiculos.pojos.productos.Tarta;

public class Supermercado {
	private String nombre;
	List<List<Alimentos>> stockAlimentos; 
	Set<ClienteSupermercado> clientes;
	
	public Supermercado(String nombre) {
		super();
		this.nombre = nombre;
		this.clientes = new HashSet();
	}
	
	public Supermercado(String nombre, List<List<Alimentos>> stockAlimentos) {
		super();
		this.nombre = nombre;
		this.stockAlimentos = stockAlimentos;
		this.clientes = new HashSet();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<List<Alimentos>> getStockAlimentos() {
		return stockAlimentos;
	}

	public void setStockAlimentos(List<List<Alimentos>> stockAlimentos) {
		this.stockAlimentos = stockAlimentos;
	}

	public Set<ClienteSupermercado> getClientes() {
		return clientes;
	}

	public void setClientes(Set<ClienteSupermercado> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Supermercado [nombre=" + nombre + ", stockAlimentos=" + stockAlimentos + ", clientes=" + clientes + "]";
	}
	
	public void addCliente (ClienteSupermercado cliente) {
		this.clientes.add(cliente);
	}
	
	public void importarProductos () {
		List<List<Alimentos>> alimentos = new ArrayList<List<Alimentos>>();
		
		Tarta tarta = new Tarta(1,"Tarta Manzana",12,"","");
		Tarta tarta1 = new Tarta(2,"Tarta Velvet",12,"","");
		Tarta tarta2 = new Tarta(3,"Tarta1",12,"","");
		Tarta tarta3 = new Tarta(4,"Tarta1",12,"","");
		Tarta tarta4 = new Tarta(5,"Tarta1",12,"","");
		Tarta tarta5 = new Tarta(6,"Tarta1",12,"","");
		
		//List<Alimentos> tartas = Arrays.asList(new Alimentos[] {tarta,tarta1,tarta2,tarta3,tarta4,tarta5});
		List<Alimentos> tartas = new CopyOnWriteArrayList<>();
		tartas.add(tarta1);
		tartas.add(tarta2);
		tartas.add(tarta3);
		tartas.add(tarta4);
		tartas.add(tarta5);
		
		Aguacate aguacate1 = new Aguacate(1, "Aguacate", 3, null, null);
		Aguacate aguacate2 = new Aguacate(2, "Aguacate", 2, null, null);
		Aguacate aguacate3 = new Aguacate(3, "Aguacate", 4, null, null);
		Aguacate aguacate4 = new Aguacate(4, "Aguacate", 5, null, null);
		
		List<Alimentos> aguacates = new CopyOnWriteArrayList<>();
		aguacates.add(aguacate1);
		aguacates.add(aguacate2);
		aguacates.add(aguacate3);
		aguacates.add(aguacate4);
		
		Platano platano = new Platano(1, "Platano", 2, null);
		Platano platano2 = new Platano(2, "Platano", 3, null);
		Platano platano3 = new Platano(3, "Platano", 2, null);
		Platano platano4 = new Platano(4, "Platano", 1, null);
		//List<Alimentos> platanos = Arrays.asList(new Alimentos[] {platano2,platano,platano3,platano4});
		List<Alimentos> platanos = new CopyOnWriteArrayList<>();
		platanos.add(platano);
		platanos.add(platano2);
		platanos.add(platano3);
		platanos.add(platano4);
		
		alimentos.add(tartas);
		alimentos.add(aguacates);
		alimentos.add(platanos);
		
		this.stockAlimentos = alimentos;
		//return alimentos;
	}
	
	
}
