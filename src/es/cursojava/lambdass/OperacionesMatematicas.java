package es.cursojava.lambdass;

public class OperacionesMatematicas {

	public static void main(String[] args) {

		Suma suma = new Suma();
		int resultado = suma.operar(5, 3);
		System.out.println("Resultado suma: " + resultado);
		
		//OperacionGetafe sumaLambda = (a, b) -> (int)Math.pow(a, b);
		OperacionGetafe sumaLambda = (a, b) -> a+b;
		int resultado2 = sumaLambda.operar(5, 3);
		System.out.println("Resultado suma lambda: " + resultado2);
		
		OperacionGetafe restaLambda = (a, b) -> a-b;
		ejecutarOperacion(6,2,restaLambda);
	}

	public static int ejecutarOperacion(int a, int b, OperacionGetafe operacion) {
		return operacion.operar(a, b);
	}
	
}
