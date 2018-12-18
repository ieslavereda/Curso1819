package casino;

public class Terminal {

	private Premio[] premios = new Premio[3];

	public Terminal(Premio p1, Premio p2, Premio p3) {
		premios[0] = p1;
		premios[1] = p2;
		premios[2] = p3;
	}

	public void canjearPremio(Tarjeta t, Premio p) {

		int posicion = existePremio(p);

		if (posicion == -1) {
			System.out.println("El premio no esta disponible en este termianl.");
		} else if (premios[posicion].getCantidad() == 0) {
			System.out.println("No quedan existencias de ese premio.");
		} else if (premios[posicion].getTickets() > t.getTickets()) {
			System.out.println("No tienes saldo suficiente.");
		} else {

			t.setTickets(t.getTickets() - premios[posicion].getTickets());
			premios[posicion].setCantidad(premios[posicion].getCantidad() - 1);

			consultarSaldos(t);
			System.out.println("Cantidad de " + premios[posicion].getNombre() + " disponibles: "
					+ premios[posicion].getCantidad());

		}

	}

	private int existePremio(Premio p) {
		int posicion = -1, i = 0;

		while (posicion == -1 && i < premios.length) {
			if (premios[i].equals(p)) {
				posicion = i;
			} else {
				i++;
			}
		}

		return posicion;
	}

	public void recargarCreditos(Tarjeta tarjeta, int dolares) {
		if (dolares < 0) {
			System.out.println("Debe introducir una cantidad positiva de dolares.");
		} else {
			tarjeta.setCreditos(tarjeta.getCreditos() + 2 * dolares);
			consultarSaldos(tarjeta);
		}
	}

	public void consultarSaldos(Tarjeta tarjeta) {
		System.out.println("Tarjeta numero: " + tarjeta.getNumero());
		System.out.println("Saldo creditos: " + tarjeta.getCreditos());
		System.out.println("Saldo tickets: " + tarjeta.getTickets());
	}

	public void transferirTickets(Tarjeta tOrigen, Tarjeta tDestino) {
		transferirTickets(tOrigen, tDestino, tOrigen.getTickets());
	}

	public void transferirTickets(Tarjeta tOrigen, Tarjeta tDestino, int cantidad) {
		if (cantidad >= 0) {
			if (tOrigen.getTickets() >= cantidad) {

				tOrigen.setTickets(tOrigen.getTickets() - cantidad);
				tDestino.setTickets(tDestino.getTickets() + cantidad);

				consultarSaldos(tDestino);

			} else {
				System.out.println("No tines tickets suficiente");
			}
		} else {
			System.out.println("La cantidad debe ser un entero positivo");
		}
	}

	public void transferirCreditos(Tarjeta tOrigen, Tarjeta tDestino) {
		transferirCreditos(tOrigen, tDestino, tOrigen.getCreditos());
	}

	public void transferirCreditos(Tarjeta tOrigen, Tarjeta tDestino, int cantidad) {

		if (cantidad >= 0) {
			if (tOrigen.getCreditos() >= cantidad) {

				tOrigen.setCreditos(tOrigen.getCreditos() - cantidad);
				tDestino.setCreditos(tDestino.getCreditos() + cantidad);

				consultarSaldos(tDestino);

			} else {
				System.out.println("No tines saldo suficiente");
			}
		} else {
			System.out.println("La cantidad debe ser un entero positivo");
		}

	}

}
