package empresa;

public class NodoCliente {
	
	private Cliente cliente;
	private NodoCliente siguiente;
	
	public NodoCliente(Cliente cliente) {
		this.cliente=cliente;
		siguiente=null;
	}

	public NodoCliente getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoCliente siguiente) {
		this.siguiente = siguiente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public String toString() {
		return cliente + "\n";
	}
	
	

}
