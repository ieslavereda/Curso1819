package herenciaEje2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta c = new Cuenta(10000f, 12345678);
		Cuenta d = new Cuenta(1000f, 9999999);
		Credito tCredito = new Credito(111111, "Joaquin", c, 3000f, 2.5f);
		Debito tDebito = new Debito(222222,"Manolo",d,25f);
		
		System.out.println(tCredito);
		System.out.println("--------------");
		System.out.println(tDebito);

		tDebito.pagoCuenta(150);
		System.out.println();
		System.out.println(tDebito);
		
		tCredito.pagoCredito(1000);
		tCredito.pagoCompras();
		System.out.println();
		System.out.println(tCredito);
		
	}

}
