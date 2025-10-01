package es.cursojava.interfaces.ejercicios.produtovehiculos.utils;

import es.cursojava.interfaces.ejercicios.produtovehiculos.interfaces.Consultable;
import es.cursojava.interfaces.ejercicios.produtovehiculos.interfaces.Deletable;
import es.cursojava.interfaces.ejercicios.produtovehiculos.interfaces.Insertable;
import es.cursojava.interfaces.ejercicios.produtovehiculos.interfaces.Updatable;

public class UtilsBBDD {

	public static void insertarObjeto(Insertable obj) {
		obj.insert();
	}
	
	public static void consultarObjeto(Consultable obj) {
		obj.select();
	}
	
	public static void updateObjeto(Updatable obj) {
		obj.update();
	}
	
	public static void consultarObjeto(Deletable obj) {
		obj.delete();
	}
}
