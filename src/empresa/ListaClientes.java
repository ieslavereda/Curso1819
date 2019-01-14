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
	
	public boolean existe(Cliente c) {
		boolean existe = false;
		NodoCliente aux=cabeza;
		
		while(aux!=null && !existe) {
			existe=aux.getCliente().equals(c);
			aux=aux.getSiguiente();
		}		
		
		return existe;
	}
	public Cliente obtenerCliente(String DNI) {
		NodoCliente aux = cabeza;
		Cliente c=null;
		
		while(aux!=null) {
			if(aux.getCliente().getDNI().compareTo(DNI)==0) {
				c=aux.getCliente();
			}
			aux=aux.getSiguiente();
		}
		
		return c;
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
