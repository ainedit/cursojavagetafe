package es.cursojava.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

import es.cursojava.bbdd.Producto;

//nombre_yyyymmdd.txt
public class ArchivoServicio {
	private static final String SEPARADOR_DEFAULT= "|";
	
	public static void crearArchivoProductos(String nombreFichero, List<Producto> productos, String separador) {
		String separadorFichero = separador==null?SEPARADOR_DEFAULT:separador;
//		if (separador==null) {
//			separadorFichero=SEPARADOR_DEFAULT;
//		}else {
//			separadorFichero=separador;
//		}
		
		File archivo = new File(nombreFichero);
		
		try (PrintWriter buffer = new PrintWriter(archivo)) {
			// try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo))){
			
			for (Producto producto : productos) {
				StringBuilder lineaProducto = new StringBuilder();
				lineaProducto.append(producto.getId()).append(separadorFichero);
				lineaProducto.append(producto.getNombre()).append(separadorFichero);
				lineaProducto.append(producto.getCategoria()).append(separadorFichero);
				lineaProducto.append(producto.getPrecio()).append(separadorFichero);
				lineaProducto.append(producto.getStock()).append(separadorFichero);
				lineaProducto.append(producto.getFecha_alta()).append(separadorFichero);
				lineaProducto.append(producto.getEstado()).append(separadorFichero);
				lineaProducto.append(producto.getCreado_por()).append(separadorFichero);
				lineaProducto.append(producto.getCodigo_sku()).append(separadorFichero);
				lineaProducto.append(producto.getIva()).append(separadorFichero);
				
				buffer.println(lineaProducto.toString());
			}
			
			
			// buffer.close();
			System.out.println("El archivo se ha creado con éxito!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void crearArchivo(String nombre) {
		File archivo = new File(nombre);
		System.out.println("crearArchivo nombre:"+nombre);
//		if (!archivo.exists()) {
//			try {
//				archivo.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		try (
			FileWriter fw = new FileWriter(archivo);
			BufferedWriter buffer = new BufferedWriter(fw);
			) {

		 		buffer.append("Hola que tal amigos3!\n")
		 			.append("Todo bien? yo escribiendo en un archivo3...\n")
		 			.append("Hasta luego Lucas3!\n");
		 	// buffer.close();
		 	System.out.println("El archivo se ha creado con éxito!");
		 } catch (IOException e) {
		 	e.printStackTrace();
		}

		
		//try with resources
		// try (Alumno a = new Alumno("N1",44,9)){
		// 	System.out.println("Pasa" +a .getNombre());
		// 	System.out.println("Termina");
		// }catch (Exception e){
		// 	e.printStackTrace();
		// }

		// BufferedWriter buffer = null;
		// try      {
		// 	FileWriter fw = new FileWriter(archivo, false);
		// 	buffer = new BufferedWriter(fw);
		// 	buffer.append("Hola que tal amigos!\n")
		// 		.append("Todo bien? yo escribiendo en un archivo...\n")
		// 		.append("Hasta luego Lucas!\n");

			
		// }catch (IOException e){
		// 	e.printStackTrace();
		// }finally{
		// 	try {
		// 		buffer.close();
		// 	} catch (IOException e) {
		// 		// TODO Auto-generated catch block
		// 		e.printStackTrace();
		// 	}	
		// }


	}

	public void crearArchivo2(String nombre) {
		File archivo = new File(nombre);
		
		try (PrintWriter buffer = new PrintWriter(archivo)) {
			// try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo))){

			buffer.println("Hola que tal amigos!");
			buffer.println("Todo bien? yo acá escribiendo un archivo...");
			buffer.printf("Hasta luego %s! %s", "JoseLuis", "Cadena");
			// buffer.close();
			System.out.println("El archivo se ha creado con éxito!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void crearArchivo3(String nombreFichero){
		Path ruta = Paths.get(nombreFichero);
		String contenido = "Hola, mundo2!\nEste es un ejemplo usando java.nio.2";
        try {
            Files.write(ruta, 
            			contenido.getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.CREATE, 
                        StandardOpenOption.WRITE);
            System.out.println("Escritura completada.");
        } catch (IOException e) {
            e.printStackTrace();
        }
   
	}

	

	public String leerArchivo(String nombre) throws IOException {
		StringBuilder sb = new StringBuilder();
		File archivo = new File(nombre);
		// FileReader fileReader = new FileReader(archivo);
		// BufferedReader reader = new BufferedReader(fileReader);

		// String linea;
		// while ((linea = reader.readLine()) != null) {
		// 	sb.append(linea).append("\n");
		// }

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){

            String linea;
            while ( (linea = reader.readLine()) != null){
                sb.append(linea).append("\n");
            }
        } catch (IOException e) {
			e.printStackTrace();
			throw e;
        }
		return sb.toString();
	}

	public String leerArchivo2(String nombre) {
		StringBuilder sb = new StringBuilder();
		File archivo = new File(nombre);
		try (Scanner s = new Scanner(archivo)) {

			s.useDelimiter("\n");
			while (s.hasNext()) {
				String linea = s.next();
				sb.append(linea).append("\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public String leerArchivo3(String nombre) throws IOException{
		Path path = Paths.get(nombre);
		StringBuilder sb = new StringBuilder();

		List<String> lines = Files.readAllLines(path);
		for (String linea : lines) {
			sb.append(linea+"\n");
		}

		return sb.toString();
	}

	public void mostrarContenidoDirectorio(String directorio) {
		File dir = new File(directorio);
		File file1 = new File(directorio, "fichero1.txt");
		File file2 = new File(dir, "fichero1.txt");

		if (dir.isDirectory()) {
			String[] ficheros = dir.list();
			for (String nombreFichero : ficheros) {
				// System.out.print(nombreFichero + " ");
				String nuevoFichero = directorio + nombreFichero;
				System.out.println(nuevoFichero);
				File file = new File(nuevoFichero);
				if (file.isDirectory()) {
					// System.out.println("Es un directorio");
				} else {
					if (file.getName().endsWith(".txt")) {
						System.out.println("Se puede leer:" + file.canRead());
						System.out.println("TAmaño " + file.length());
						System.out.println("Es un fichero");
					}
				}

			}
		} else {
			System.err.println("No es un directorio");
		}
	}
}
