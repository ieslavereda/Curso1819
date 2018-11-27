package principal;

import common.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Barco b1 = new Barco(4,"Acorazado");
		
		System.out.println(b1.toString());
		System.out.println();
		
		b1.tocado();
		b1.tocado();
		b1.tocado();
		b1.tocado();
		b1.tocado();
		
		System.out.println(b1.toString());
		
	}

}
