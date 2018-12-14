package complejos;

public class PruebaComplejo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Complejo a,b;
		
		a = new Complejo();
		b = new Complejo();
		
		a.asignar(3, 4);
		b.asignar(2, 1);
		System.out.print("(");
		a.imprimir();
		System.out.print(") + (");
		b.imprimir();
		System.out.print(") = ");
		a.sumar(b);
		a.imprimir();
	}

}
