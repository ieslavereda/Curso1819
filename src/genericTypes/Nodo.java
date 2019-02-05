package genericTypes;

public class Nodo<E> {

	private E info;
	private Nodo<E> siguiente;

	public Nodo(E info) {
		this.info = info;
		siguiente = null;
	}

	public Nodo<E> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<E> siguiente) {
		this.siguiente = siguiente;
	}

	public E getInfo() {
		return info;
	}

	@Override
	public String toString() {
		return info.toString() + ((siguiente != null) ? siguiente : "");
	}

}
