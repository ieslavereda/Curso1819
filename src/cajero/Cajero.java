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
			case 1:
				reintegro(titulares, cuentas);
				break;
			case 2:
				ingresar(titulares, cuentas);
				break;
			case 3:
				crearCuenta(titulares, cuentas);
				break;
			case 4:
				crearTitular(titulares);
				break;
			}

		} while (opcion != -1);

	}
	
	public static void reintegro(Persona[] titulares,Cuenta[] cuentas) {
		Scanner entrada = new Scanner(System.in);
		String dni;
		Persona persona;
		int indice;
		float cantidad;
		String pin;

		System.out.println("Introduzca su DNI:");
		dni = entrada.next();
		
		persona = buscarTitular(titulares, dni);
		if (persona != null) {
			if (buscarCuentasTitular(cuentas, persona)) {
				System.out.println("De que cuenta quiere el reintegro?:");
				indice = entrada.nextInt();
				if (cuentas[indice] != null) {
					if (cuentas[indice].getTitular().equals(persona)) {
						System.out.println("Cuanto quieres sacar?:");
						cantidad = entrada.nextFloat();
						System.out.println("Introduzca el PIN:");
						pin = entrada.next();
						
						if(cuentas[indice].reintegro(persona,pin,cantidad)) {
							System.out.println("Aqui tiene su dinero");
						}else {
							System.out.println("Error.");
						}
						
					} else {
						System.out.println("Esa cuenta no es suya");
					}
				} else {
					System.out.println("No existe esa cuenta");
				}
			}
		}
	}

	public static void ingresar(Persona[] titulares, Cuenta[] cuentas) {
		Scanner entrada = new Scanner(System.in);
		String dni;
		Persona persona;
		int indice;

		System.out.println("Introduzca su DNI:");
		dni = entrada.next();

		persona = buscarTitular(titulares, dni);
		if (persona != null) {
			if (buscarCuentasTitular(cuentas, persona)) {
				System.out.println("En que cuentas quiere ingresar?:");
				indice = entrada.nextInt();
				if (cuentas[indice] != null) {
					if (cuentas[indice].getTitular().equals(persona)) {
						System.out.println("Cuanto quiere ingresar?:");
						cuentas[indice].ingreso(entrada.nextFloat());
					} else {
						System.out.println("Esa cuenta no es suya");
					}
				} else {
					System.out.println("No existe esa cuenta");
				}

			} else {
				System.out.println("No tiene cuentas a su nombre.");
			}
		} else {
			System.out.println("No existe ese titular");
		}
	}

	public static boolean buscarCuentasTitular(Cuenta[] cuentas, Persona persona) {
		boolean existe = false;
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] != null) {
				if (cuentas[i].getTitular().equals(persona)) {
					System.out.println(i + " " + cuentas[i].getNumero() + " " + cuentas[i].getSaldo() + "€");
					existe = true;
				}
			}
		}
		return existe;
	}

	public static void crearTitular(Persona[] titulares) {

		Scanner entrada = new Scanner(System.in);
		String nombre, apellidos, DNI;
		int posicion;

		System.out.println("Dime tu nombre: ");
		nombre = entrada.next();
		System.out.println("Dime tus apellidos: ");
		apellidos = entrada.next();
		System.out.println("Dime tu DNI: ");
		DNI = entrada.next();

		posicion = buscarPosicionLibre(titulares);
		if (posicion != -1) {
			titulares[posicion] = new Persona(nombre, apellidos, DNI);
		}
		// mostrar(titulares);
	}

	public static void crearCuenta(Persona[] titulares, Cuenta[] cuentas) {

		Scanner entrada = new Scanner(System.in);
		String dni;
		Persona persona;
		int pos;

		System.out.println("Introduzca su DNI: ");
		dni = entrada.next();

		persona = buscarTitular(titulares, dni);

		pos = buscarPosicionLibre(cuentas);

		if (persona != null && pos != -1) {
			cuentas[pos] = new Cuenta(persona);
			System.out.println("Cuenta creada. Su PIN es: " + cuentas[pos].getPin());

		} else {
			System.out.println("Error");
		}
		// mostrar(cuentas);
	}

	public static Persona buscarTitular(Persona[] titulares, String dni) {
		Persona p = null;
		int i = 0;

		while (titulares[i] != null && i < titulares.length) {
			if (titulares[i].getDNI().equals(dni)) {
				p = titulares[i];
				break;
			}
			i++;
		}
		return p;

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

	public static int buscarPosicionLibre(Cuenta[] cuentas) {

		int posicion = 0;
		while (posicion < cuentas.length && cuentas[posicion] != null) {
			posicion++;
		}
		return (posicion == cuentas.length) ? -1 : posicion;
	}

	public static void mostrar(Persona[] p) {
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
	}

	public static void mostrar(Cuenta[] c) {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
