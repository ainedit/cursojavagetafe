package es.cursojava.oo.ejercicios.biblioteca;

public class Main {

	public static void main(String[] args) {
		Direccion dir1 = new Direccion("Calle1","Ciudad1",12321);
		Biblioteca biblioteca1 = new Biblioteca("Biblioteca1", dir1, 3);
		
		Libro libro1 = new Libro("Titulo","Autor","12312312-123");
		biblioteca1.agregarLibro(libro1);

		
		Libro[] librosBiblioteca =  biblioteca1.getLibros();
	}

}
