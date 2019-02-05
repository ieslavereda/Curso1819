package genericTypes;

public class Lista<E> {

	private Nodo<E> cabeza;
	private int cantidad;

	public Lista() {

		this.cabeza = null;
		this.cantidad = 0;
	}
	
	public void insertar(E info) {
		
		Nodo<E> n = new Nodo<E>(info);
		
		if(cantidad==0) {
			cabeza=n;
		}else {
			n.setSiguiente(cabeza);
			cabeza=n;
		}
		cantidad++;
	}

	public Nodo<E> getCabeza() {
		return cabeza;
	}

	public void setCabeza(Nodo<E> cabeza) {
		this.cabeza = cabeza;
	}

	public int getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return "Lista [\n" + "cantidad= " + cantidad + "\n" + cabeza + " ]\n";
	}

}
