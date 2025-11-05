package es.cursojava.excepciones;

public class TestException {

	public static void main(String[] args) {
		
		int [] numeros = {1,2,3}; 
		String ruta = null;
		try {
			int result = 7/1;
			System.out.println("Empieza");
			ruta = ruta==null?"":ruta.substring(4);
			System.out.println(numeros[2]);
			System.out.println("Termina try");
		}
		catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Error fuera de rango del array" + aiobe.getMessage());
		}catch (NullPointerException npe) {
			System.out.println("Error objeto es null "+ npe.getMessage());
		}catch (Exception e) {
			System.out.println("Error general "+ e.getMessage());
		}finally {
			System.out.println("Siempre");
		}
		
		
		System.out.println("Fin");

	}

}
