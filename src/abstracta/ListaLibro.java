package abstracta;

public class ListaLibro extends Lista<Libro> {

	public Libro obtenerLibroPorISBN(String isbn) {
		Libro libro = null;
		
		Nodo<Libro> aux = this.getCabeza();
		while(aux!=null && libro==null) {
			libro = (aux.getInfo().getISBN().compareTo(isbn)==0)?aux.getInfo():null;
			aux=aux.getSiguiente();
		}
		
		
		
		return libro;
	}

	
	public String show() {
		
		return (this.getCantidad()>0)?"No esta vacia":"Vacia";
	}
	
}
