package es.cursojava.lombok;

public class Bar {

	public static void main(String[] args) {
		Botella b = new Botella();
		b.setCapacidad(500);
		
		
		Botella botella = new Botella(1000,"vidrio","botella","cerveza");
		System.out.println(botella);
		
		Botella b2 = Botella.builder().
				capacidad(300).
				contenido("vino").
				build();
		
	}

}
