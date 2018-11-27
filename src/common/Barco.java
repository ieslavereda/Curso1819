package common;

public class Barco {

	private int longitud;
	private String tipo;
	private boolean hundido;
	private int vida;


	public Barco(int longitud, String tipo) {
		this.longitud=longitud;
		this.tipo=tipo;

		hundido=false;
		vida=longitud;
			
	}
	
	public boolean tocado() {
		
		if(vida>0)vida--;
		if(vida==0) {
			hundido=true;
		}
				
		return hundido;
	}
	
	public String toString() {
		return 	"Barco: " + tipo +"\n"+
				"Longitud: " + longitud +"\n"+
				"Vida: " + vida +"\n"+
				"Hundido: " +((hundido)?"Si":"No");
	}
}
