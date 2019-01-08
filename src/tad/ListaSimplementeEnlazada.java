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
	
	public void insertarPosicion(Nodo n,int posicion) {
		Nodo aux = cabeza;
		int i = 1;
		
		if(posicion<1 || posicion>cantidad) {
			System.out.println("Posicion no valida");
		}else if(posicion==1) {
			insertarCabeza(n);
		}else {
			while(i<posicion-1) {
				aux=aux.getSiguiente();
				i++;
			}
			n.setSiguiente(aux.getSiguiente());
			aux.setSiguiente(n);
			cantidad++;
		}
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

	public void insertarCabeza(Nodo n) {
		n.setSiguiente(cabeza);
		cabeza = n;
		cantidad++;
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
