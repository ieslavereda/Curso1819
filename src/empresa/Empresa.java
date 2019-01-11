package empresa;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int opcion;
		ListaClientes clientes = new ListaClientes();

		menuPrincipal();
		opcion = entrada.nextInt();
		switch (opcion) {
		case 1:
			altaCliente(clientes);
			break;

		}

	}

	public static void altaCliente(ListaClientes clientes) {
		
		String nombre,apellidos,DNI;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dame el nombre:");
		nombre=entrada.nextLine();
		System.out.println("Dame los apellidos:");
		apellidos = entrada.nextLine();
		System.out.println("Dame el DNI:");
		DNI = entrada.nextLine();
		
		clientes.insertarCliente(new Cliente(DNI,nombre,apellidos));
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
