package pruebas;

public class Carta {
	private final int valor;
	private final int palo;

	// PALOS
	public final static int OROS = 1;
	public final static int COPAS = 2;
	public final static int ESPADAS = 3;
	public final static int BASTOS = 4;

	// Tipos de VALOR
	public final static int AS = 1;
	public final static int DOS = 2;
	public final static int TRES = 3;
	public final static int CUATRO = 4;
	public final static int CINCO = 5;
	public final static int SEIS = 6;
	public final static int SIETE = 7;
	public final static int OCHO = 8;
	public final static int NUEVE = 9;
	public final static int SOTA = 10;
	public final static int CABALLO = 11;
	public final static int REY = 12;
	
	private boolean repartida;

	public Carta(int palo, int valor) throws Exception {
		if (palo > 4 || palo < 1 || valor > 12 || valor < 1)
			throw new Exception();
		this.valor = valor;
		this.palo = palo;
		this.repartida=false;
	}

	public String obtenerPalo() {
		String palo = "";
		switch (this.palo) {
		case OROS:
			palo = "Oros";
			break;
		case COPAS:
			palo = "Copas";
			break;
		case BASTOS:
			palo = "Bastos";
			break;
		case ESPADAS:
			palo = "Espadas";
			break;

		}
		return palo;
	}
	public int obtenerValor() {
		return valor;
	}
	public String toString() {
		return valor+" de "+obtenerPalo();
	}
	public boolean getRepartida() {
		return repartida;
	}
	public void setRepartida(boolean repartida) {
		this.repartida=repartida;
	}

}
