package principal;

import common.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p = new Persona("Manolo",30,85.3f,185.0f);
		
		System.out.println(p.getNombre());
		System.out.println("IMC = " + p.getIMC());
		System.out.println("Es mayor de edad? " + ((p.esMayorEdad())?"SI":"NO"));

	}

}
