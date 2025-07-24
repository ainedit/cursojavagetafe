package es.cursojava.metodos.ejercicios;

public class MetodosEjercicio2 {

	public static void main(String[] args) {
		
		
		//String[] nombresUsuarios = {"Angel","Antonio","Miguel","Marta"} ;
		
		int nombresContador = numeroDeNombresQueEmpiezanPorAYContienenT(args);
		System.out.println("Hay "+nombresContador +" que empiezan por A y tienen t");
		System.out.println("Termina");
	}

	
	public static int numeroDeNombresQueEmpiezanPorAYContienenT(String [] nombres) {
		int contador = 0;
		
		for ( String nombre :  nombres ) {
			//if ( nombre.startsWith("A") && nombre.contains("t") ) {
			//if ( nombre.charAt(0)=='A' && nombre.contains("t") ) {
			if(nombre.substring(0,1).equalsIgnoreCase("a") && nombre.contains("t") ) {
				contador++;
			}
		}

		return contador;
	}
	
}
