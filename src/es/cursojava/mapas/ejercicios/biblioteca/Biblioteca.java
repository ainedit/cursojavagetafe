package es.cursojava.mapas.ejercicios.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.cursojava.utils.Utilidades;

public class Biblioteca {

	public static void main(String[] args) {
		Map<Autor, List<Libro> > biblioteca = creaBiblioteca();
		//mostrarNacionalidades(biblioteca);
		Collection<List<Libro>> listasLibros = biblioteca.values();
		mostrarLibrosMasDiezAnios(listasLibros);
		mostrarTitulosAutoresLibros(biblioteca);
		pedirDatos (biblioteca);
	}
	
	private static void mostrarTitulosAutoresLibros(Map<Autor, List<Libro> > biblioteca) {
		
		Set<Entry <Autor, List<Libro>> > entryBibliotecas = biblioteca.entrySet();
		
		for (Entry<Autor, List<Libro>> entry : entryBibliotecas) {
			Autor a = entry.getKey();
			System.out.println("El autor "+a.getNombre() );
			List<Libro> libros = entry.getValue();
			if(libros.size()>2) {
				System.out.println("Tiene los siguientes libros");
				for (Libro libro: libros) {
					System.out.println("\n"+libro.getTitulo());
				}
			}
		}
		
		
		
	}
	
	private static void mostrarLibrosMasDiezAnios(Collection<List<Libro>> listasLibros) {
		
		for (List<Libro> libros : listasLibros) {
			for (Libro libro : libros) {
				if(libro.getAnioPublicacion()>2010) {
					System.out.println(libro.getTitulo());
				}
			}
		}
		
	}
	
	private static void mostrarNacionalidades (Map<Autor, List<Libro> > biblioteca) {
		Set<Autor> autores =  biblioteca.keySet();
		
		for (Autor autor : autores) {
			System.out.println("Autor"+autor.getNombre());
			try {
 				System.out.println(autor.getNacionalidad().substring(0,3));
 				String [] colores = new String[2];
				colores[2]="Azul";
			}catch(NullPointerException | ArrayIndexOutOfBoundsException npe) {
				System.err.println("Error");
				System.out.println("Mensaje" +npe.getMessage());
				npe.getStackTrace();
				npe.printStackTrace();
			}catch(StringIndexOutOfBoundsException siobe) {
				System.err.println("Error nacionalidad muy corta");
			}catch(Exception e) {
				System.err.println("Error general");
			}finally {
				System.out.println("Siempre");
			}
			System.out.println("Termina");
		}
	}
	
	private static Map<Autor, List<Libro> > creaBiblioteca () {
		Autor autor1 = new Autor("A1","N112312");
		Autor autor2 = new Autor("A2","Ba");
		Autor autor3 = new Autor("A3",null);
		Autor autor4 = new Autor("A4","N4");

		Libro libro1 = new Libro("Titulo1","ISBN1",2005);
		Libro libro2 = new Libro("Titulo2","ISBN2",2006);
		Libro libro3 = new Libro("Titulo3","ISBN3",2007);
		Libro libro4 = new Libro("Titulo4","ISBN4",2008);
		Libro libro5 = new Libro("Titulo5","ISBN5",2009);
		Libro libro6 = new Libro("Titulo6","ISBN6",2010);
		Libro libro7 = new Libro("Titulo7","ISBN7",2011);
		Libro libro8 = new Libro("Titulo8","ISBN8",2012);
		
		Map<Autor, List<Libro> > biblioteca = new HashMap();
		
		List<Libro> librosAutor1 = new ArrayList();
		librosAutor1.add(libro1);
		librosAutor1.add(libro2);
		biblioteca.put(autor1, librosAutor1);
		biblioteca.get(autor1).add(libro8);
		
		biblioteca.put(autor2, Arrays.asList(libro3,libro4));
		biblioteca.put(autor3, Arrays.asList(libro5,libro6));
		biblioteca.put(autor4, Arrays.asList(libro7,libro8));
		
		return biblioteca;
	}

	
	private static void pedirDatos (Map<Autor, List<Libro> > biblioteca) {
		String nombreAutor = Utilidades.pideDatoCadena("Nombre autor");
		String titulLibro = Utilidades.pideDatoCadena("Titulo");
		String isbn = Utilidades.pideDatoCadena("ISBN");
		int anio = Utilidades.pideDatoNumerico("Año");
		
		Set<Autor> autores = biblioteca.keySet();
		boolean autorEncontrado = false;
		for (Autor autor : autores) {
			if (autor.getNombre().equals(nombreAutor)) {
				Libro libro = new Libro(titulLibro,isbn,anio);
				biblioteca.get(autor).add(libro);
				autorEncontrado = true;
				break;
			}
		}
		if(!autorEncontrado) {
			String nacionalidad = Utilidades.pideDatoCadena("nacionalidad");
			Autor autorCreado = new Autor(nombreAutor, nacionalidad);
			Libro libro = new Libro(titulLibro,isbn,anio);
			
			biblioteca.put(autorCreado, Arrays.asList(libro));
		}
		
	}
	
	private static void borrarPorISBN (Map<Autor, List<Libro> > biblioteca) {
		String isbnABorrar = Utilidades.pideDatoCadena("ISBN");
		
		Collection<List<Libro>> listasLibros = biblioteca.values();
		for (List<Libro> listaLibros : listasLibros) {
			Iterator<Libro> libros = listaLibros.iterator();
			while(libros.hasNext()) {
				Libro libro = libros.next();
				if (libro.getIsbn().equals(isbnABorrar)) {
					libros.remove();
				}
			}
		}
			
	}
}








