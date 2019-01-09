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

	// Insercion de un elemento en una posicion dada
	public void insertarPosicion(Nodo n, int posicion) {
		Nodo aux = cabeza;
		int i = 1;

		// Comprobamos que la posicion a eliminar exista
		if (posicion < 1 || posicion > cantidad) {
			System.out.println("Posicion no valida");
		} else if (posicion == 1) {
			// Eliminamos la cabez
			insertarCabeza(n);
		} else {
			// Avanzamos hasta la posicion anterior a insertar el elmento
			while (i < posicion - 1) {
				aux = aux.getSiguiente();
				i++;
			}
			// Insertamos el elemento y actualizamos referencias
			n.setSiguiente(aux.getSiguiente());
			aux.setSiguiente(n);
			cantidad++;
		}
	}

	// Encolar un elemento por la cola
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

	public void insertarCabeza(Nodo n) {
		n.setSiguiente(cabeza);
		cabeza = n;
		cantidad++;
	}

	public void eliminarPosicion(int posicion) {
		Nodo aux = cabeza;
		int i = 1;

		// Compruebo que la posicion sea valida
		if (posicion < 1 || posicion > cantidad) {
			System.out.println("Posicion no valida");
		} else if (posicion == 1) {
			// Si la posicion es 1 elimino la cabeza
			cabeza = aux.getSiguiente();
			cantidad--;
		} else {
			while (i < posicion - 1) {
				aux = aux.getSiguiente();
				i++;
			}
			aux.setSiguiente(aux.getSiguiente().getSiguiente());
			cantidad--;
		}
	}

	public void eliminarPrimero(int elemento) {
		Nodo aux = cabeza;
		if (cantidad >= 1) {
			if (cabeza.getInfo() == elemento) {

				eliminarPosicion(1);
			} else {
				while (aux.getSiguiente() != null && aux.getSiguiente().getInfo() != elemento) {
					aux = aux.getSiguiente();
				}
				if(aux.getSiguiente()!=null)aux.setSiguiente(aux.getSiguiente().getSiguiente());

			}
		}

	}
	public void eliminar(int elemento) {
		Nodo aux = cabeza;
		if (cantidad >= 1) {
			if (cabeza.getInfo() == elemento) {

				eliminarPosicion(1);
			} else {
				while (aux!=null && aux.getSiguiente() != null ) {
					// Mientras sea igual al elemento buscado
					while(aux.getSiguiente()!=null && aux.getSiguiente().getInfo() == elemento) {
						// Eliminamos
						aux.setSiguiente(aux.getSiguiente().getSiguiente());
						cantidad--;
					}
					// Avanzamos
					aux = aux.getSiguiente();
				}
				

			}
		}

	}

	

	public String toString() {
		String salida = "cantidad: " + cantidad + "\n";
		Nodo aux = cabeza;
		while (aux != null) {
			salida = salida + aux.toString();
			aux = aux.getSiguiente();
		}
		return salida;
	}

}
