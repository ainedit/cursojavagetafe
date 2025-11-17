package es.cursojava.enums;

public class Escuela {

	public static void main(String[] args) {
		
		System.out.println(AlumnoEnum.ALUMNO6.getNombre());

		for(AlumnoEnum alumno : AlumnoEnum.values()) {
			
			System.out.println(alumno.name());
			System.out.println(alumno.ordinal());
			
		}
		
		System.out.println(AlumnoEnum.valueOf("ALUMNO1").getNombre());
		
	}

}
