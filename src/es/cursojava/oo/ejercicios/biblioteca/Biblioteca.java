package es.cursojava.oo.ejercicios.biblioteca;

public class Biblioteca {
	private String nombre;
	private Direccion direccion;
	private Libro[] libros;
	private int contadorLibros;
	
	public Biblioteca(String nombre, Direccion direccion, int  numLibros) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.libros = new Libro[numLibros];
	}
	
	public void agregarLibro(Libro libro) {
		if (contadorLibros<libros.length) {
			libros[contadorLibros]=libro;
			contadorLibros++;
			
		}else {
			System.out.println("La biblioteca está llena");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Libro[] getLibros() {
		return libros;
	}

	public void setLibros(Libro[] libros) {
		this.libros = libros;
	}
	
	public void mostrarLibros() {
		for (Libro libro : libros) {
			if (libro!=null) {
				libro.mostrarInfo();
			}
		}
	}
	
	public void mostrarInfoBiblioteca() {
		this.direccion.mostrarDireccion();
		mostrarLibros();
	}
	
	
}









