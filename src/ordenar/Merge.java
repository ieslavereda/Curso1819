package ordenar;

public class Merge {

	/*
	 * Este algoritmo consiste basicamente en dividir en partes iguales la lista de
	 * numeros y luego mezclarlos comparandolos, dejandolos ordenados
	 * 
	 * Si se piensa en este algoritmo recursivamente, podemos imaginar que dividira
	 * la lista hasta tener un elemento en cada lista, luego lo compara con el que
	 * esta a su lado y segun corresponda, lo situa en su sitio.
	 */

	public static void mergeSort(int[] arreglo, int inicio, int longitud) {
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

	public static void merge(int[] arreglo, int inicio, int longitud1, int longitud2) {

		int[] arregloBuffer = new int[longitud1+longitud2];
		
		int indice1=0,indice2=0,indiceBuffer=0;
		
		while((indice1<longitud1)&&(indice2<longitud2)) {
			if(arreglo[inicio+indice1]<arreglo[inicio+longitud1+indice2]) {
				arregloBuffer[indiceBuffer]=arreglo[inicio+indice1];
				indiceBuffer++;
				indice1++;
			}else {
				arregloBuffer[indiceBuffer]=arreglo[inicio+longitud1+indice2];
				indiceBuffer++;
				indice2++;
			}
		}
		while(indice1<longitud1) {
			arregloBuffer[indiceBuffer]=arreglo[inicio+indice1];
			indiceBuffer++;
			indice1++;
		}
		while(indice2<longitud2) {
			arregloBuffer[indiceBuffer]=arreglo[inicio+longitud1+indice2];
			indiceBuffer++;
			indice2++;
		}
		for(int i=0;i<arregloBuffer.length;i++) {
			arreglo[i]=arregloBuffer[i];
		}
	}

}
