package es.cursojava.bbdd;


import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Producto {

	private int id;
	private String nombre;
	private String categoria;
	private double precio;
	private int stock;
	private Date fecha_alta;
	private String estado;
	private String codigo_sku;
	private String creado_por;
	private int iva;
	
	public Producto(int id, String nombre, String categoria, double precio, 
			int stock, Date fecha_alta,
			String estado, String codigo_sku, String creado_por, int iva) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
		this.fecha_alta = fecha_alta;
		this.estado = estado;
		this.codigo_sku = codigo_sku;
		this.creado_por = creado_por;
		this.iva = iva;
	}
	
	
	


}
