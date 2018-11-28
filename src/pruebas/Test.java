package pruebas;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Carta c;

//			Carta c = new Carta(Carta.COPAS, Carta.CUATRO);
		Baraja b = new Baraja();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quieres una carta?");
		String opcion = entrada.next();

		while (opcion.equals("s")) {
			c = b.repartirCarta();
			System.out.println(c.toString());
			System.out.println("Quieres otra carta?");
			opcion = entrada.next();
		}

	}

}
