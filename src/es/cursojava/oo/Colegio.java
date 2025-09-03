package es.cursojava.oo;

public class Colegio {

	
	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Alumno1");
		alumno1.setDni("1111A");
		alumno1.setNotaMedia(7.5);
		String[] asignaturasAlumno = {"Historia","Física", "Química"};
		alumno1.setAsignaturas(asignaturasAlumno);

		Alumno alumno2 = new Alumno();
		alumno2.setNombre("Alumno2");
		alumno2.setDni("2222B");
		alumno2.setNotaMedia(4.5);
		alumno2.setAsignaturas(new String[] {"Lengua","Matemáticas"});
		
		Alumno alumno3 = new Alumno();
		alumno3.setNombre("Alumno3");
		alumno3.setDni("333C");
		alumno3.setNotaMedia(9.5);
		alumno3.setAsignaturas(asignaturasAlumno);
		
//		Alumno alumno4 = alumno1;
//		System.out.println(alumno1);
//		System.out.println(alumno4);
//		System.out.println(alumno2);
		
		alumno1.estudiar();
		alumno2.estudiar();
		alumno3.estudiar();
		
		Alumno[] alumnos = {alumno1,alumno2,alumno3};
		Colegio colegio = new Colegio();
		colegio = new Colegio();
		colegio.estudiarAlumnos(alumnos);
		
		
		Alumno.numero = 3;
		System.out.println(Alumno.numero);//3
		alumno1.numero = 5;
		System.out.println(Alumno.numero);//3 - 5
		System.out.println(alumno1.numero);//5
		System.out.println(alumno2.numero);//5
		alumno3.numero = 10;
		System.out.println(Alumno.numero);
		System.out.println(alumno1.numero);
		System.out.println(alumno3.numero);
		System.out.println(alumno2.numero);
		
	}

	public static void metodo1() {

		
	}
	
	
	public void estudiarAlumnos (Alumno[] alumnos) {

		for (Alumno alumno : alumnos) {
			alumno.estudiar();
		}
		
	}
	
	
}
