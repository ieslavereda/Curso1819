package repaso;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaEnteros l = new ListaEnteros();

		l.insertarNodo(6);
		l.insertarNodo(4);
		l.insertarNodo(8);
		l.insertarNodo(2);
		l.insertarNodo(1);
		l.insertarNodo(10);

		System.out.println(l);

		l.eliminarEntero(5);
		
		System.out.println(l);
	}

}
