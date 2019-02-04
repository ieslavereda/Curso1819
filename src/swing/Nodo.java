package swing;

import java.io.Serializable;

public class Nodo implements Serializable {

	private static final long serialVersionUID = 1L;
	private Libro libro;
	private Nodo siguiente;
	private Nodo anterior;

	public Nodo(Libro l) {
		libro = l;
		siguiente = null;
		anterior = null;
	}

	
	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}


	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	@Override
	public String toString() {
		return "Nodo [libro=" + libro + ", siguiente=" + siguiente + ", anterior=" + anterior + "]";
	}
	
	

}
