package ordenar;

import tools.Tool;

public class Inser {
	public static void inserccion(int[] vector) {
		int posicionMasPequeño,buffer;
		
		for(int j=0;j<vector.length;j++) {
			posicionMasPequeño=j;
			for(int i=j;i<vector.length;i++) {
				if(vector[i]<vector[posicionMasPequeño]) {
					posicionMasPequeño=i;
				}
			}
			buffer=vector[posicionMasPequeño];
			Tool.desplazar(vector,j,posicionMasPequeño);
			vector[j]=buffer;
		}
	}
}
