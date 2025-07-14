package es.cursojava.inicio.arrays;

public class ArraysBidimensionales {

	public static void main(String[] args) {
		
		int [][] numeros = new int [2][3]; 
		numeros[1][2]=10;
		System.out.println(numeros[1][1]);
		
		//Número de filas
		System.out.println(numeros.length);
		
		
		int [] fila0 = numeros[0];
		System.out.println(fila0.length);
		System.out.println(numeros[0].length);

		for (int i=0 ; i<numeros.length ; i++ ) {
			//System.out.println("Fila: "+i);
			for (int j=0 ; j<numeros[i].length ; j++ ) {
				//System.out.println("\tColumna: "+j);
				//System.out.print("Posición ("+i+","+j+")");
				System.out.print(numeros[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
