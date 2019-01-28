package empresa;

public class ListaFacturas {

	private NodoFactura cabeza;
	private NodoFactura cola;
	private int cantidad;

	public ListaFacturas() {
		cabeza = null;
		cola=null;
		cantidad = 0;
	}

	public void insertarFactura(Factura f) {
		NodoFactura nf=new NodoFactura(f);
	
		if(cabeza==null) {
			cabeza=nf;
			cola=nf;
			cabeza.setAnterior(cola);
			cola.setSiguiente(cabeza);
			cantidad++;
		}else {
			//Insertamos por la cabeza
//			cabeza.setAnterior(nf);
//			nf.setSiguiente(cabeza);
//			cabeza=nf;
			
			//Insertamos por la cola
			cola.setSiguiente(nf);
			nf.setAnterior(cola);
			cola=nf;			
			cabeza.setAnterior(cola);
			cola.setSiguiente(cabeza);
			cantidad++;
		}
	}

	public Factura obtenerFactura(int numero) {
		
		Factura f=null;		
		NodoFactura aux= cabeza;
		int i=1;
		boolean encontrado=false;
		
		while(i<=cantidad && !encontrado) {
			if(aux.getFactura().getNumero()==numero) {
				encontrado=true;
				f=aux.getFactura();
			}
			aux=aux.getSiguiente();
			i++;
		}
		
		return f;
	}
}
