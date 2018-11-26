package principal;

import tools.Tool;

public class UF1P3c {

	public static void main(String[] args) {

		/*
		 * Do the same as the previous exercise but sorted by ascending name using the
		 * quicksort algorithm.
		 * 
		 */

		String[][] vector = new String[4][2];
		vector[0][0] = "Jose";
		vector[1][0] = "Antonio";
		vector[2][0] = "Carmen";
		vector[3][0] = "Manolo";
		vector[0][1] = "185.7";
		vector[1][1] = "150.2";
		vector[2][1] = "160.4";
		vector[3][1] = "170.2";

		mostrar(vector);
		Quicksort(vector, 0, vector.length - 1);
		System.out.println("--------------");
		mostrar(vector);

	}

	public static void Quicksort(String[][] arreglo, int a, int b) {
		int izq = a, der = b;
		String pivote = arreglo[(izq + der) / 2][0];

		// Avanzamos izq hasta encontrar un elemento que debe estar a la derecha
		// del pivote, e igualmente el indice derecho retrocede hasta encontrar un
		// elemento que deba estar a la izquierda del pivote.
		// Si los indices no se han cruazado realizamos el intercambio.

		do {
			while (arreglo[izq][0].compareTo(pivote) < 0) {
				izq++;
			}
			while (arreglo[der][0].compareTo(pivote) > 0) {
				der--;
			}
			if (izq <= der) {
				intercambiar(arreglo, izq, der);
				izq++;
				der--;
			}

		} while (izq <= der);

		// Si el indicador derecho se ha despalazado realizaremos
		// Quicksort de la parte derecha

		if (a < der) {
			Quicksort(arreglo, a, der);
		}
		// Si el indicador izquierdo se ha desplazado realizaremos
		// Quicksort de la parte izquierda
		if (izq < b) {
			Quicksort(arreglo, izq, b);
		}
	}

	public static void intercambiar(String[][] v, int i, int j) {
		String[] buffer = new String[2];
		buffer[0] = v[i][0];
		buffer[1] = v[i][1];
		
		v[i][0] = v[j][0];
		v[i][1] = v[j][1];
		
		v[j][0] = buffer[0];
		v[j][1] = buffer[1];
	}

	public static void mostrar(String[][] vector) {
		for (int fila = 0; fila < vector.length; fila++) {
			for (int col = 0; col < vector[0].length; col++) {
				System.out.print(vector[fila][col] + " ");
			}
			System.out.println();
		}
	}

}
