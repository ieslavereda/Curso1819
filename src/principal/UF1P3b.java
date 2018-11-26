package principal;

public class UF1P3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a two-dimensional vector that contains the name 
		 * and height of people. The program should return a list .
		 * of people ordered by height. Use the mergesort algorithm.
		 * 
		 */
		
		String[][] vector = new String [4][2];
		vector[0][0]="Jose";
		vector[1][0]="Antonio";
		vector[2][0]="Carmen";
		vector[3][0]="Manolo";
		vector[0][1]="185.7";
		vector[1][1]="150.2";
		vector[2][1]="160.4";
		vector[3][1]="170.2";
		
		mostrar(vector);
		mergeSort(vector,0,vector.length);
		System.out.println("--------------");
		mostrar(vector);
		
		
	}
	
	public static void mergeSort(String[][] arreglo, int inicio, int longitud) {
		int longitud1; // Longitud de la primera mitad del arreglo
		int longitud2; // Longitud de la segunda mitad del arreglo

		if (longitud > 1) {
			longitud1 = longitud / 2;
			longitud2 = longitud - longitud1;
			// Se realizan divisiones recursivas del arreglo.
			// Al final llamamos a la funcion merge para mezclarlos
			
			mergeSort(arreglo,inicio,longitud1);
			mergeSort(arreglo,inicio+longitud1,longitud2);
			merge(arreglo,inicio,longitud1,longitud2);
		}
	}

	public static void merge(String[][] arreglo, int inicio, int longitud1, int longitud2) {

		String[][] arregloBuffer = new String[longitud1+longitud2][2];
		
		int indice1=0,indice2=0,indiceBuffer=0;
		
		while((indice1<longitud1)&&(indice2<longitud2)) {
			if(Float.parseFloat(arreglo[inicio+indice1][1])<Float.parseFloat(arreglo[inicio+longitud1+indice2][1])) {
				arregloBuffer[indiceBuffer][0]=arreglo[inicio+indice1][0];
				arregloBuffer[indiceBuffer][1]=arreglo[inicio+indice1][1];
				indiceBuffer++;
				indice1++;
			}else {
				arregloBuffer[indiceBuffer][0]=arreglo[inicio+longitud1+indice2][0];
				arregloBuffer[indiceBuffer][1]=arreglo[inicio+longitud1+indice2][1];
				indiceBuffer++;
				indice2++;
			}
		}
		while(indice1<longitud1) {
			arregloBuffer[indiceBuffer][0]=arreglo[inicio+indice1][0];
			arregloBuffer[indiceBuffer][1]=arreglo[inicio+indice1][1];
			indiceBuffer++;
			indice1++;
		}
		while(indice2<longitud2) {
			arregloBuffer[indiceBuffer][0]=arreglo[inicio+longitud1+indice2][0];
			arregloBuffer[indiceBuffer][1]=arreglo[inicio+longitud1+indice2][1];
			indiceBuffer++;
			indice2++;
		}
		for(int i=0;i<longitud1+longitud2;i++) {
			arreglo[inicio+i][0]=arregloBuffer[i][0];
			arreglo[inicio+i][1]=arregloBuffer[i][1];
		}
	}
	
	public static void mostrar(String[][] vector) {
		for(int fila=0;fila<vector.length;fila++) {
			for(int col=0;col<vector[0].length;col++) {
				System.out.print(vector[fila][col]+" ");
			}
			System.out.println();
		}
	}
	
	
	

}
