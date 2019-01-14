package empresa;

public class NodoDetalle {
	private Detalle detalle;
	private NodoDetalle siguiente;

	public NodoDetalle(Detalle detalle) {
		this.detalle = detalle;
		siguiente=null;
	}

	public NodoDetalle getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoDetalle siguiente) {
		this.siguiente = siguiente;
	}

	public Detalle getDetalle() {
		return detalle;
	}

	@Override
	public String toString() {
		return detalle.toString();
	}
		
	

}
