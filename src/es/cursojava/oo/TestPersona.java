package es.cursojava.oo;

public class TestPersona {

	public static void main(String[] args) {
		Persona persona0 = new Persona();//Instanciar
		System.out.println(persona0.getEdad());
		persona0.setNombre("Raúl");
		persona0.setApellidos("Pérez");
		persona0.setEdad(26);
		persona0.setDni("111A");
		System.out.println(persona0.getEdad());
		System.out.println(persona0.getNombre());
		System.out.println(persona0.getDni());
		
		Persona persona1 = new Persona();
		persona1.setNombre("Marta");
		persona1.setEdad(80);
		
		Persona persona2 = persona1;
		
		persona2.setNombre("Loli");
		System.out.println(persona1.getNombre());
		
		persona0.correr();
		persona2.correr();		
	}

}

