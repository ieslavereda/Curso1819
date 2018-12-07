package examen;

import java.util.Scanner;

public class Eje123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int size;
		String[][] array;
		
		System.out.println("Gime the size of the array: ");
		size=entrada.nextInt();
		array = new String[size][size];
		
		fillArray(array);
		showArray(array);
		System.out.println("The sum is: " + sumArray(array));
		
	}
	
	public static void fillArray(String[][] array) {
		for(int row=0;row<array.length;row++) {
			for (int col=0;col<array[0].length;col++) {
				array[row][col]=row+""+col;
				//array[row][col]=String.valueOf(row)+String.valueOf(col);
			}
		}
	}
	
	public static void showArray(String[][] array) {
		for(int row=0;row<array.length;row++) {
			for (int col=0;col<array[0].length;col++) {
				System.out.print(array[row][col]+" ");
			}
			System.out.println();
		}
	}
	
	public static int sumArray(String[][] array) {
		int sum=0;
		for(int row=0;row<array.length;row++) {
			for (int col=0;col<array[0].length;col++) {
				sum+=Integer.parseInt(array[row][col]);
			}
		}
		return sum;
	}
	

}
