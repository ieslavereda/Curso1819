package figura;

public class Cuadrado extends Figura {

	public Cuadrado(float longitud) {
		super(4,longitud);
	}
	public float obtenerArea() {
		
		return this.longitud*this.longitud;
	}
}
