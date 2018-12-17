package casino;

public class Tarjeta {

	private int creditos;
	private int tickets;
	private int numero;

	private static int siguienteNumero = 1;

	public Tarjeta() {
		creditos = 0;
		tickets = 0;
		numero = siguienteNumero;
		siguienteNumero++;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

	public static int getSiguienteNumero() {
		return siguienteNumero;
	}

	public static void setSiguienteNumero(int siguienteNumero) {
		Tarjeta.siguienteNumero = siguienteNumero;
	}

	public int getNumero() {
		return numero;
	}
	
	
}
