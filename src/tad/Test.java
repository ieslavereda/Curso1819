package tad;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaSimplementeEnlazada lista = new ListaSimplementeEnlazada();
		Nodo n = new Nodo(7);
		
		lista.insertNodo(n);
		lista.insertNodo(new Nodo(8));
		
		System.out.println(lista);
		
		
	}

}
