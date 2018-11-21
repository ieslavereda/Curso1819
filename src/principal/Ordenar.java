package principal;

import ordenar.Burbu;
import ordenar.Inser;
import ordenar.Merge;
import ordenar.Quick;
import ordenar.Selec;
import tools.Tool;

public class Ordenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long antes,despues,duracion;
		
		int[] vector = new int[100000000];
		//int[] vector = {6,2,7,5,8,9};
		
//		/*
//		 * Insercion
//		 */
//		Tool.rellenar(vector,0,999999);	
//
//		antes = System.currentTimeMillis();
//		Inser.inserccion(vector);		
//		despues = System.currentTimeMillis();
//		duracion = despues-antes;
//
//		System.out.println("Inserccion");
//		System.out.println("La ordenacion ha durado " + duracion + "ms.");
//		System.out.println("La ordenacion ha durado " + Math.abs(duracion/1000) + "s.");

		/*
		 * Quicksort
		 */
		
		Tool.rellenar(vector,0,999999);
		antes = System.currentTimeMillis();
		
		Quick.Quicksort(vector,0,vector.length-1);
		
		despues = System.currentTimeMillis();
		duracion = despues-antes;
		
		System.out.println("Quicksort");
		System.out.println("La ordenacion ha durado " + duracion + "ms.");
		System.out.println("La ordenacion ha durado " + Math.abs(duracion/1000) + "s.");

//		/*
//		 * Seleccion
//		 */
//		
//		Tool.rellenar(vector,0,999999);
//		antes = System.currentTimeMillis();
//		
//		Selec.seleccion(vector);
//		
//		despues = System.currentTimeMillis();
//		duracion = despues-antes;
//		System.out.println("Seleccion");
//		System.out.println("La ordenacion ha durado " + duracion + "ms.");
//		System.out.println("La ordenacion ha durado " + Math.abs(duracion/1000) + "s.");
//		
//		/*
//		 * Burbuja
//		 */
//		
//		Tool.rellenar(vector,0,999999);
//		antes = System.currentTimeMillis();
//		
//		Burbu.burbuja(vector);
//		
//		despues = System.currentTimeMillis();
//		duracion = despues-antes;
//		
//		System.out.println("Burbuja");
//		System.out.println("La ordenacion ha durado " + duracion + "ms.");
//		System.out.println("La ordenacion ha durado " + Math.abs(duracion/1000) + "s.");
		
		/*
		 * MergeSort
		 */
		
		Tool.rellenar(vector,0,999999);
		antes = System.currentTimeMillis();
		
		Merge.mergeSort(vector, 0, vector.length);
		
		despues = System.currentTimeMillis();
		duracion = despues-antes;
		
		System.out.println("MergeSort");
		System.out.println("La ordenacion ha durado " + duracion + "ms.");
		System.out.println("La ordenacion ha durado " + Math.abs(duracion/1000) + "s.");


	}
		
}
