package empresa;

public class ListaDetalles {

	private NodoDetalle cabeza;
	private int cantidad;

	public ListaDetalles() {
		cabeza = null;
		cantidad = 0;
	}

	public NodoDetalle getCabeza() {
		return cabeza;
	}

	public void insertarDetalle(Detalle d) {
		NodoDetalle aux = cabeza;
		NodoDetalle n = new NodoDetalle(d);

		if (cabeza == null) {
			cabeza = n;
			cantidad++;
		} else {
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}

			aux.setSiguiente(n);
			cantidad++;
		}
	}

	public String toString() {
		String salida = "";
		NodoDetalle aux = cabeza;
		while (aux != null) {
			salida += aux.getDetalle().toString();
			aux=aux.getSiguiente();
		}

		return salida;
	}

}
