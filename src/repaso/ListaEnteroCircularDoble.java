package repaso;

public class ListaEnteroCircularDoble {

	private NodoEnteroDoble cabeza;
	private int cantidad;

	public ListaEnteroCircularDoble() {

		this.cabeza = null;
		this.cantidad = 0;
	}

	public void insertarEntero(int i) {

		NodoEnteroDoble n = new NodoEnteroDoble(i);

		if (cantidad == 0) {
			cabeza = n;
			n.setSiguiente(n);
			n.setAnterior(n);
		} else if (cantidad == 1) {
			if (cabeza.getInfo() > i) {
				
				n.setSiguiente(cabeza);
				n.setAnterior(cabeza);
				cabeza.setSiguiente(n);
				cabeza.setAnterior(n);

				cabeza = n;
			} else {

				n.setSiguiente(cabeza);
				n.setAnterior(cabeza);
				cabeza.setSiguiente(n);
				cabeza.setAnterior(n);
			}
		}
		// Sin acabar ....

		cantidad++;
	}

	public NodoEnteroDoble getCabeza() {
		return cabeza;
	}

	public void setCabeza(NodoEnteroDoble cabeza) {
		this.cabeza = cabeza;
	}

	public int getCantidad() {
		return cantidad;
	}

}
