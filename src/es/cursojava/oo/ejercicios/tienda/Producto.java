package es.cursojava.oo.ejercicios.tienda;

public class Producto {
	private String nombre;
	private double precio;
	private int cantidad;
	
	public Producto(String nombre, double precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void mostrarInfo() {
		System.out.println("Producto: " + this.nombre + " precio: " 
				+this.precio + " cantidad:"+ this.cantidad);
	}
	
	public double calcularValorTotal () {
		return this.precio * this.cantidad;
	}
	
	
}
