package swing;

import java.io.Serializable;

public class ListaDoblementeEnlazada implements Serializable{

	private Nodo cabeza;
	private int cantidad;
	private Nodo cola;

	public ListaDoblementeEnlazada() {
		cabeza = null;
		cola = null;
		cantidad = 0;
	}
	

	public int getCantidad() {
		return cantidad;
	}


	public Nodo getCabeza() {
		return cabeza;
	}


	public void setCabeza(Nodo cabeza) {
		this.cabeza = cabeza;
	}


	public void insertarCola(Nodo n) {

		// Si la lista esta vacia, cola y cabeza apuntan a n
		if (cantidad == 0) {
			cola = n;
			cabeza = n;
			cantidad++;
		} else {

			// La cola apunta al nuevo elemento
			cola.setSiguiente(n);
			// El nuevo elemento pasa a ser la cola y apunta a la antigua cola
			n.setAnterior(cola);
			cola = n;

			cantidad++;
		}
	}

	public void insertarCabeza(Nodo n) {
		// Si la lista esta vacia, cola y cabeza apuntan a n
		if (cantidad == 0) {
			cola = n;
			cabeza = n;
			cantidad++;
		} else {
			// La cabeza apunta a su anterior n
			cabeza.setAnterior(n);
			// El nuevo elemento apunta a la antigua cabeza
			n.setSiguiente(cabeza);
			// Actualizamos la cabeza de la lista a la nueva cabeza
			cabeza=n;
			
			cantidad++;			
		}
	}
	
	public String toString() {
		String salida="cantidad: " + cantidad +"\n";
		Nodo aux=cabeza;
		
		// Mientras que el nodo contenga "algo"
		while(aux!=null) {
			// Añadimos a la salida la salida producida por aux.toString()
			salida+=aux;
			// Avanzamos
			aux=aux.getSiguiente();
		}
		
		return salida;
	}
	
}
