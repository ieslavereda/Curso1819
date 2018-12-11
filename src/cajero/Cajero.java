package cajero;

import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		Persona[] titulares = new Persona[10];
		Cuenta[] cuentas = new Cuenta[10];

		int opcion;

		do {
			mostrarMenuPrincipal();
			opcion = entrada.nextInt();
			switch (opcion) {
			case 4:
				crearTitular(titulares);
				break;
			}

		} while (opcion != -1);

	}

	public static void crearTitular(Persona[] titulares) {

		Scanner entrada = new Scanner(System.in);
		String nombre, apellidos, DNI;
		int posicion;

		System.out.println("Dime tu nombre: ");
		nombre = entrada.next();
		System.out.println("Dime tus apellidos: ");
		apellidos = entrada.nextLine();
		System.out.println("Dime tu DNI: ");
		DNI = entrada.next();

		posicion = buscarPosicionLibre(titulares);
		if (posicion != -1) {
			titulares[posicion] = new Persona(nombre, apellidos, DNI);
		}
		mostrar(titulares);
	}

	public static void mostrarMenuPrincipal() {

		System.out.println("1 - Reintegros");
		System.out.println("2 - Ingresos");
		System.out.println("3 - Crear cuenta");
		System.out.println("4 - Crear titular");
		System.out.println("5 - Cambio de PIN");
		System.out.println("------------------");
		System.out.println("Elija una opcion (1-5)");

	}

	public static int buscarPosicionLibre(Persona[] titulares) {

		int posicion = 0;
		while (posicion < titulares.length && titulares[posicion] != null) {
			posicion++;
		}
		return (posicion == titulares.length) ? -1 : posicion;
	}
	
	public static void mostrar(Persona[] p) {
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
		}
	}

}
