package tad2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaDoblementeEnlazada lista=new ListaDoblementeEnlazada();
		
		lista.insertarCabeza(new Nodo(new Persona("Jose","Martinez")));
		lista.insertarCabeza(new Nodo(new Persona("Jose","Cabeza")));
		lista.insertarCola(new Nodo(new Persona("Jose","Cola")));
		
		System.out.println(lista);	
		
		System.out.println(lista.existe(new Persona("Jose","Martinez")));
	}

}
