package tad;

public class ListaSimplementeEnlazada {

	private Nodo cabeza;
	private int cantidad;

	public ListaSimplementeEnlazada() {
		cabeza = null;
		cantidad = 0;
	}

	public ListaSimplementeEnlazada(Nodo n) {
		cabeza = n;
		cantidad = 1;
	}

	public void insertNodo(Nodo n) {
		Nodo aux = cabeza;

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
		String salida = "cantidad: " + cantidad+"\n";
		Nodo aux = cabeza;
		while (aux != null) {
			salida = salida + aux.toString();
			aux=aux.getSiguiente();
		}
		return salida;
	}

}
