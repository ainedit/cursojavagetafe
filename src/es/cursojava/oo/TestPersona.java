package es.cursojava.oo;

public class TestPersona {

	public static void main(String[] args) {
		Persona persona0 = new Persona();//Instanciar
		System.out.println(persona0.edad);
		persona0.nombre="Raúl";
		persona0.apellidos="Pérez";
		persona0.edad = 26;
		persona0.dni = "111A";
		System.out.println(persona0.edad);
		System.out.println(persona0.nombre);
		System.out.println(persona0.dni);
		
		Persona persona1 = new Persona();
		persona1.nombre = "Marta";
		persona1.edad = 80;
		
		Persona persona2 = persona1;
		
		persona2.nombre= "Loli";
		System.out.println(persona1.getNombre());
		
		persona0.correr();
		persona2.correr();		
	}

}

