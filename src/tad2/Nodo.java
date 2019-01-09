package tad2;

public class Nodo {

	private Persona persona;
	private Nodo siguiente;
	private Nodo anterior;

	public Nodo(Persona p) {
		persona = p;
		siguiente = null;
		anterior = null;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
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

}
