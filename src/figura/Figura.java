package figura;

public class Figura {

	protected int lados;
	protected float longitud;
	
	public Figura(int lados,float longitud) {
		this.lados=lados;
		this.longitud=longitud;
	}
	
	public float obtenerPerimetro() {
		return longitud*lados;
	}
	
}
