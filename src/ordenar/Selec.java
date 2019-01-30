package ordenar;

import tools.Tool;

public class Selec {
	public static void seleccion(int[] vector) {
		
		int positionLower;
		
		for(int j=0;j<vector.length;j++) {
			positionLower=j;
			for(int i=j;i<vector.length;i++) {
				if(vector[i]<vector[positionLower]) {
					positionLower=i;
				}
			}
			Tool.intercambiar(vector,j,positionLower);
		}		
	}
}
