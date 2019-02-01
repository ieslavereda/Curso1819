package repaso;

public class ListaEnteros {

	private NodoEntero cabeza;
	private int cantidad;

	public ListaEnteros() {
		this.cabeza = null;
		this.cantidad = 0;
	}

	public String toString() {
		NodoEntero aux = cabeza;
		String salida = "";

		while (aux != null) {
			salida = salida + aux.getInfo() + " ";
			aux = aux.getSiguiente();
		}

		return salida;
	}

	public void eliminarEntero(int entero) {
		NodoEntero aux1 = cabeza, aux2;

		if (cantidad == 0) {
			System.out.println("La lista esta vacia");
		} else if (cabeza.getInfo() == entero) {
			cabeza = cabeza.getSiguiente();
		} else {
			aux2 = cabeza.getSiguiente();

			while (aux2 != null && aux2.getInfo() != entero) {
				aux1 = aux2;
				aux2 = aux2.getSiguiente();
			}

			if (aux2!=null) {
				aux1.setSiguiente(aux2.getSiguiente());
			} else {
				System.out.println("No se encuentra el elemento");
			}
		}

		cantidad--;
	}

	public void insertarNodo(int entero) {
		NodoEntero n = new NodoEntero(entero), aux1, aux2;

		if (cabeza == null) {
			cabeza = n;
		} else if (cabeza.getInfo() > entero) {
			n.setSiguiente(cabeza);
			cabeza = n;
		} else if (cantidad == 1) {
			cabeza.setSiguiente(n);
		} else {
			aux1 = cabeza;
			aux2 = cabeza.getSiguiente();
			while (aux2 != null && aux2.getInfo() < entero) {
				aux1 = aux2;
				aux2 = aux2.getSiguiente();
			}
			aux1.setSiguiente(n);
			n.setSiguiente(aux2);
		}
		cantidad++;
	}

}
