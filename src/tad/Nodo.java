package tad;

public class Nodo {

	private int info;
	private Nodo siguiente;
	
	public Nodo(int x) {
		info=x;
		siguiente=null;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	public String toString() {
		return 	"Info: " + info +"\n"+
				"Siguiente:" + siguiente + "\n";
	}
	
	
}
