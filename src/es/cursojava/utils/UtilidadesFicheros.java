package es.cursojava.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UtilidadesFicheros {
    private static final Logger logger = LoggerFactory.getLogger(UtilidadesFicheros.class);
    public static final String SEPARADOR_PIPE = "|";

    public static void crearDirectorios (File dirFicheros, String [] directorios){
        crearDirectorios(dirFicheros, Arrays.asList(directorios));
    }

    public static void crearDirectorios (File dirFicheros, Collection<String> directorios){
        for (String directorio : directorios) {
            File documentos = new File (dirFicheros, directorio);
            if (documentos.mkdir()) {
                logger.info("El directorio "+ documentos.getAbsolutePath() + " se ha creado");
            }else{
                logger.warn("El directorio "+ documentos.getAbsolutePath() + " no se ha creado");
            }
        }
    }
    
    public static List<String> leerFichero(String ruta) throws IOException{
    	Path path = Paths.get(ruta);
    	List<String> lines = Files.readAllLines(path);
     	
    	return lines;
    }
    
    
}
