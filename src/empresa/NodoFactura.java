package empresa;

public class NodoFactura {

	private Factura factura;
	private NodoFactura siguiente;
	private NodoFactura anterior;

	public NodoFactura(Factura f) {
		factura = f;
		siguiente = null;
		anterior = null;
	}

	public NodoFactura getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoFactura siguiente) {
		this.siguiente = siguiente;
	}

	public NodoFactura getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoFactura anterior) {
		this.anterior = anterior;
	}

	public Factura getFactura() {
		return factura;
	}
	
	public String toString() {
		return factura.toString();
	}
}
