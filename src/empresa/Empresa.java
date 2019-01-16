package empresa;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int opcion;
		ListaClientes clientes = new ListaClientes();
		ListaFacturas facturas = new ListaFacturas();

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
				crearFactura(clientes, facturas);
				break;
			case 4:
				visualizarFactura(facturas);
				break;

			}
		} while (opcion != -1);
	

	}
	public static void visualizarFactura(ListaFacturas facturas) {
		Scanner entrada = new Scanner(System.in);
		int numFactura;
		
		System.out.println("Dime la factura a visualizar:");
		numFactura=entrada.nextInt();
		System.out.println(facturas.obtenerFactura(numFactura));
	}

	public static void crearFactura(ListaClientes clientes, ListaFacturas facturas) {

		Factura f ;
		Scanner entrada = new Scanner(System.in);
		Cliente c;
		String DNI, descripcion;
		int cantidad;
		float precio, total;
		Detalle detalle;

		System.out.println("DNI del cliente:");
		DNI = entrada.next();

		c = clientes.obtenerCliente(DNI);
		if (c == null) {
			System.out.println("No existe el cliente");
		} else {
			f = new Factura(c);

			System.out.println("Cantidad:");
			cantidad = entrada.nextInt();
			while (cantidad >= 0) {
				System.out.println("Descripcion:");
				descripcion = entrada.next();
				System.out.println("Precio Unitario:");
				precio = entrada.nextFloat();

				detalle = new Detalle(cantidad, descripcion, precio);
				f.añadirDetalle(detalle);

				System.out.println("Cantidad:");
				cantidad = entrada.nextInt();
			}
			facturas.insertarFactura(f);
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
		System.out.println("3- Crear Factura");
		System.out.println("4- Ver Factura");
		System.out.println("--------------------");
		System.out.println("Selecione (1-4): ");

	}

}
