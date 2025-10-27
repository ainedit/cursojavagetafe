package es.cursojava.mapas.ejercicios.biblioteca;

public class Libro {
	private String titulo;
	private String isbn;
	private int anioPublicacion;
	public Libro(String titulo, String isbn, int anioPublicacion) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.anioPublicacion = anioPublicacion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", isbn=" + isbn + ", anioPublicacion=" + anioPublicacion + "]";
	}
	
	
}

