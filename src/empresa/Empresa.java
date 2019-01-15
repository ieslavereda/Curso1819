package empresa;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int opcion;
		ListaClientes clientes = new ListaClientes();
		Factura f=null;

		do {
			menuPrincipal();
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1:
				altaCliente(clientes);
				break;
			case 2:
				System.out.println(clientes);
				break;
			case 3:
				crearFactura(clientes, f);
				break;

			}
		} while (opcion != -1);

	}

	public static void crearFactura(ListaClientes clientes, Factura f) {

		Scanner entrada = new Scanner(System.in);
		Cliente c;
		String DNI;

		System.out.println("DNI del cliente:");
		DNI = entrada.nextLine();
		
		c = clientes.obtenerCliente(DNI);
		if (c == null) {
			System.out.println("No existe el cliente");
		} else {
			f=new Factura(c);
		}

	}

	public static void altaCliente(ListaClientes clientes) {

		String nombre, apellidos, DNI;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame el nombre:");
		nombre = entrada.nextLine();
		System.out.println("Dame los apellidos:");
		apellidos = entrada.nextLine();
		System.out.println("Dame el DNI:");
		DNI = entrada.nextLine();

		Cliente c = new Cliente(DNI, nombre, apellidos);
		if (!clientes.existe(c))
			clientes.insertarCliente(c);
		else
			System.out.println("Ya existe el cliente!");
	}

	public static void menuPrincipal() {

		System.out.println("--------------------");
		System.out.println("1- Alta de usuarios");
		System.out.println("2- Listar usuarios");
		System.out.println("3- Alta de usuarios");
		System.out.println("4- Alta de usuarios");
		System.out.println("--------------------");
		System.out.println("Selecione (1-4): ");

	}

}