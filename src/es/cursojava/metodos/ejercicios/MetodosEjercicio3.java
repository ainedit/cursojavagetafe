package es.cursojava.metodos.ejercicios;

public class MetodosEjercicio3 {

	public static void main(String[] args) {
		
		//double[] datos = calculosAritmeticos (7,3);
		//for ( double dato  : datos ) {
		for ( double dato  : calculosAritmeticos (7,3) ) {
			System.out.println(dato);
		}

	}

	public static double[] calculosAritmeticos (double base, double altura) {
		double[] resultados = new double[3];
		
		//Calcular el área del rectángulo. Area=base×altura
		double area = base * altura;
		//Calcular el perímetro del rectángulo. Perímetro=2×(base+altura)
		double perimetro = 2*(base+altura);
		//Calcular la diagonal del rectángulo (utilizando el teorema de Pitágoras). 
		//		Diagonal= (raíz cuadrada)base2+altura2
		//double diagonal = Math.sqrt(base*base+altura*altura);
		double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		//double[] resultados = {area, perimetro, diagonal};
		resultados[0] = area;
		resultados[1] = perimetro;
		resultados[2] = diagonal;
		
		return resultados;
	}
	
}
