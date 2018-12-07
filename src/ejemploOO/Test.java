package ejemploOO;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p = new Persona("Jose","Lopez Martinez","123456789S");
		Coche c = new Coche("Toyota","Cualquiera","rojo",120,20000);
		Cuenta ccc= new Cuenta(123456789,p,"BBVA",200);
		
		c.setPropietario(p);
		
		System.out.println(c);
	}

}
