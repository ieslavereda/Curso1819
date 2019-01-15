package herenciaEje2;

public class Cuenta {

	private float saldo;
	private int numero;

	public Cuenta(float saldo, int numero) {
		super();
		this.saldo = saldo;
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String toString() {
		return "IBAN: " + numero + "\n" + "Saldo: " + saldo + "\n";
	}
}
