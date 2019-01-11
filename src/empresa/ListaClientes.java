package empresa;

public class ListaClientes {

	private NodoCliente cabeza;
	private int cantidad;
	
	public ListaClientes() {
		cabeza=null;
		cantidad=0;
	}
	
	public void insertarCliente(Cliente cliente) {
		
		NodoCliente n = new NodoCliente(cliente);
		
		if(cantidad==0) {
			cabeza=n;
		}else {
			n.setSiguiente(cabeza);
			cabeza=n;
		}
		cantidad++;
	}
	
	public NodoCliente getCabeza() {
		return cabeza;
	}
	public int getCantidad() {
		return cantidad;
	}
	
	@Override
	public String toString() {
		String salida="";
		NodoCliente aux=cabeza;
		
		while(aux!=null) {
			salida+=aux;
			aux=aux.getSiguiente();
		}		
		
		return salida + "cantidad= " + cantidad; 
	}
	
}
