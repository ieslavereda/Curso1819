package ordenar;

import tools.Tool;

public class Burbu {

	public static void burbuja(int[] vector) {

		for (int j = 0; j < vector.length; j++) {
			for (int i = 0; i < vector.length - 1; i++) {
				if (vector[i] > vector[i + 1]) {
					Tool.intercambiar(vector, i, i + 1);
				}
			}
		}
	}


}
