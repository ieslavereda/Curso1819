package repaso;

public class NodoEnteroDoble {

	private int info;
	private NodoEnteroDoble siguiente;
	private NodoEnteroDoble anterior;
	public NodoEnteroDoble(int info) {
		super();
		this.info = info;
		siguiente=null;
		anterior=null;
	}
	public NodoEnteroDoble getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoEnteroDoble siguiente) {
		this.siguiente = siguiente;
	}
	public NodoEnteroDoble getAnterior() {
		return anterior;
	}
	public void setAnterior(NodoEnteroDoble anterior) {
		this.anterior = anterior;
	}
	public int getInfo() {
		return info;
	}
	
	
}
