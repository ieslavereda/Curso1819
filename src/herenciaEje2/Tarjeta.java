package herenciaEje2;

public class Tarjeta {
	
	protected int numero;
	protected String titular;
	protected Cuenta cuenta;
	
	public Tarjeta(int numero, String titular, Cuenta cuenta) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.cuenta = cuenta;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}
	public boolean pagoCuenta(float cantidad) {
		boolean realizado=false;
		if(cantidad<=cuenta.getSaldo()) {
			cuenta.setSaldo(cuenta.getSaldo()-cantidad);
			realizado=true;
		}else {
			System.out.println("No hay saldo en cuenta.");
		}
		return realizado;
	}
	public String toString() {
		return "Numero: " + numero + "\n"+
				"Titular: " + titular + "\n"+
				cuenta ;
	}
		
}
