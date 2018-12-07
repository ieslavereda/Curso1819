package examen;

public class Eje78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sortedArray = {0,4,6,9,10,11,21,22,25,27};
		int[] unSortedArray = {1,7,4,8,8,8,22,44,3,43,11};
		
		System.out.println("Recursive");
		System.out.println("The number 22 is on the position:" + binarySearch(sortedArray,22,0,sortedArray.length));
		System.out.println("The number 6 is on the position:" + binarySearch(sortedArray,6,0,sortedArray.length));
		System.out.println("The number 5 is on the position:" + binarySearch(sortedArray,5,0,sortedArray.length));
		
		System.out.println("Iterative");
		System.out.println("The number 5 is on the position:" + search(unSortedArray,5));
		System.out.println("The number 8 is on the position:" + search(unSortedArray,8));
		System.out.println("The number 43 is on the position:" + search(unSortedArray,43));
	}
	public static int binarySearch(int[] sortedArray,int number,int start,int end) {
		
		int medio = (start+end)/2;
		
		if(end<start)return -1;
		else if (sortedArray[medio]==number) return medio;
		else if (sortedArray[medio]>number) return binarySearch(sortedArray,number,0,medio-1);
		else return binarySearch(sortedArray,number,medio+1,end);
	}
	
	public static int search(int[] array,int number) {
//		for(int i=0;i<array.length;i++) {
//			if(array[i]==number)return i;
//		}
//		return -1;
		
//		int i=0;
//		boolean encontrado=false;
//		do {
//			if(array[i]==number)encontrado=true;
//			else i++;
//		}while(!encontrado && i<array.length);
//		
//		return (encontrado)?i:-1;
		
		int i=0,position=-1;
		boolean encontrado=false;
		do {
			if(array[i]==number) {
				encontrado=true;
				position=i;
			}
			else i++;
		}while(!encontrado && i<array.length);
		
		return position;
	}

}
