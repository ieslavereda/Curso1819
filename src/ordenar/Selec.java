package ordenar;

import tools.Tool;

public class Selec {
	public static void seleccion(int[] vector) {
		
		int posicionMasPequeño;
		
		for(int j=0;j<vector.length;j++) {
			posicionMasPequeño=j;
			for(int i=j;i<vector.length;i++) {
				if(vector[i]<vector[posicionMasPequeño]) {
					posicionMasPequeño=i;
				}
			}
			Tool.intercambiar(vector,j,posicionMasPequeño);
		}		
	}
}
