package tools;

public class Tool {
	public static void intercambiar(int[] v, int i, int j) {
		int buffer = v[i];
		v[i]=v[j];
		v[j]=buffer;
	}
	public static void desplazar(int[] v, int i,int j) {
		while(i<j) {
			v[j]=v[j-1];
			j--;
		}
	}
	public static void mostrar(int[] v) {
		for(int i=0;i<v.length;i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
	}
	public static void rellenar(int[] vector,int limInf,int limSup) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * (limSup-limInf+1) + limInf);
		}
	}
}
