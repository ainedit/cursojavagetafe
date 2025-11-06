package es.cursojava.excepciones;

public class TestExcepcionesPropias {

	public static void main(String[] args) {
		
		try {
			metodoTest();
		} catch (GetafeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Termina");
	}

	public static void metodoTest() throws GetafeException{
		if (Math.random()>0.2) {
			GetafeException npe = new GetafeException("Excepción lanzada en Getafe");
			throw npe;
			
		}else {
			System.out.println("Todo bien");
		}
	}
}
