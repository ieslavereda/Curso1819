package figura;

public class Triangulo extends Figura {

	public Triangulo(float longitud) {
		super(3,longitud);
	}
	
	public float obtenerArea() {
		return longitud*longitud/2;
	}
}

