package tad;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaSimplementeEnlazada lista = new ListaSimplementeEnlazada();
		
		
		lista.insertNodo(new Nodo(1));
		lista.insertNodo(new Nodo(3));
		lista.insertNodo(new Nodo(3));
//		lista.insertNodo(new Nodo(1));
		lista.insertarCabeza(new Nodo(0));
		lista.insertarPosicion(new Nodo(2), 3);
		
		lista.eliminar(0);
		

		
		System.out.println(lista);
		
		
	}

}
