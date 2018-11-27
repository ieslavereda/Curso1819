package principal;

import common.Shape;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape cuadrado = new Shape(4,true);
		
		System.out.println("Lados = " + cuadrado.getNumSides() +"\n");
		System.out.println("Es regular?: " + cuadrado.getRegular());
	}

}
