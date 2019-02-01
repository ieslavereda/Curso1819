package repaso;

public class NodoEntero {
	
	private int Info;
	private NodoEntero siguiente;
	public NodoEntero(int info) {
		super();
		Info = info;
		siguiente=null;
	}
	public NodoEntero getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoEntero siguiente) {
		this.siguiente = siguiente;
	}
	public int getInfo() {
		return Info;
	}
	@Override
	public String toString() {
		return "NodoEntero [Info=" + Info + "]";
	}
	
	

}
