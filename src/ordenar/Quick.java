package ordenar;

import tools.Tool;

public class Quick {
	/*	Quicksort
	El método de ordenación rápida (Quicksort) para ordenar los elementos del array se basa
	en el hecho de que es más rápido y fácil ordenar dos listas pequeñas que una lista grande.
	Su nombre se debe a que este método, en general, puede ordenar una lista de datos mucho
	más rápido que cualquier otro método.
	El método se basa en la estrategia típica de "divide y vencerás". El array a ordenar se
	divide en dos partes: una contendrá todos los valores menores o iguales a un cierto valor
	(que se suele denominar pivote) y la otra con los valores mayores que dicho valor. El
	primer paso es dividir el array original en dos subarrays y un valor que sirve de separación,
	esto es, el pivote. Así, el array se dividirá en tres partes:

		• La parte izquierda, que contendrá valores inferiores o iguales al pivote.
		• El pivote.
		• La parte derecha, que contiene valores superiores o iguales al pivote. 

	Inicialmente, las partes izquierda y derecha no estarán ordenadas, excepto en el caso de
	que estén compuestas por un único elemento.
	La corrección de este algoritmo se base en los siguientes hechos: 

	 	• El subconjunto de elementos menores que el pivote se ordenará correctamente, en
		virtud del proceso recursivo.
		• El mayor elemento en el subconjunto de elementos menores no es mayor que el
		pivote, debido a cómo se realiza la	partición.
		• El menor elemento en el subconjunto de elementos mayores no es menor que el 
		pivote, debido a cómo se realiza la partición.
		• El subconjunto de elementos mayores se ordena correctamente, en virtud del
		proceso recursivo. 

	El mejor caso para Quicksort se presenta cuando el pivote divide al conjunto en dos
	subconjuntos de igual tamaño. En este caso tendremos dos llamadas recursivas con un
	tamaño igual a la mitad del original y el tiempo de ejecución es O(length*log(length^2)).

	Ya que los subconjuntos de igual tamaño son los mejores para Quicksort, es de esperar que
	los de muy distinto tamaño sean los peores y, efectivamente, así es. Suponiendo, por
	ejemplo, que el elemento que se toma como pivote es el menor del conjunto el subconjunto
	de la izquierda (elementos menores) estará vacío, y el de la derecha (elementos mayores)
	contendrá a todos los elementos menos al pivote. Poniéndonos en el peor de los casos,
	aquél en el que siempre obtenemos uno de los dos subconjuntos vacíos y el otro contiene
	n-1 elementos, la complejidad del algoritmo sería O(length^2).
	En el caso medio, si el algoritmo es implementado cuidadosamente y los subconjuntos de
	elementos generados en cada partición contienen aproximadamente el mismo número de
	elementos, puede demostrarse que el tiempo de ejecución es O(length*log(length^2)). Para
	conseguir esta implementación cuidadosa, es crucial determinar adecuadamente el
	elemento pivote. 
*/
	public static void Quicksort(int[] arreglo, int a,int b) {
		int izq=a, der=b;
		int pivote = arreglo[(izq+der)/2];
		
		// Avanzamos izq hasta encontrar un elemento que debe estar a la derecha
		// del pivote, e igualmente el indice derecho retrocede hasta encontrar un 
		// elemento que deba estar a la izquierda del pivote.
		// Si los indices no se han cruazado realizamos el intercambio.
		
		do {
			while(arreglo[izq]<pivote) {
				izq++;
			}
			while(arreglo[der]>pivote) {
				der--;
			}
			if(izq<=der) {
				Tool.intercambiar(arreglo,izq,der);
				izq++;
				der--;
			}
			
		}while(izq<=der);
		
		// Si el indicador derecho se ha despalazado realizaremos 
		// Quicksort de la parte derecha
		
		if(a<der) {
			Quicksort(arreglo,a,der);
		}
		// Si el indicador izquierdo se ha desplazado realizaremos
		// Quicksort de la parte izquierda
		if(izq<b) {
			Quicksort(arreglo,izq,b);
		}
	}

}
