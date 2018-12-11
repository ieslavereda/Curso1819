package cajero;

public class Cuenta {

	private static int cuentaBase = 10000000;

	private Persona titular;
	private int numero;
	private Password pin;
	private float saldo;

	public Cuenta() {

	}

	public Cuenta(Persona titular) {
		numero = cuentaBase;
		cuentaBase++;
		pin = new Password(Password.NUMEROS, 4);
		pin = new Password(Password.generarPIN());
		this.titular = titular;

	}

	public Cuenta(Persona titular, float saldo) {
		numero = cuentaBase;
		cuentaBase++;
		pin = new Password(Password.NUMEROS, 4);
		// pin = new Password(Password.generarPIN());
		this.titular = titular;

		this.saldo = (saldo > 0) ? saldo : 0;

//		if(saldo>0) {
//			this.saldo=saldo;
//		}else {
//			this.saldo=0;
//		}	
	}

	public boolean reintegro(float cantidad) {

		boolean realizado = false;

		if (saldo > cantidad && cantidad > 0) {
			saldo -= cantidad;
			realizado = true;
		}

		return realizado;
	}

	public boolean ingreso(float cantidad) {

		boolean realizado = false;

		if (cantidad > 0) {
			saldo += cantidad;
			realizado = true;
		}

		return realizado;
	}

	public boolean cambioPIN(String pin) {

		try {
			Integer.parseInt(pin);
			if (pin.length() == 4) {
				this.pin= new Password(pin);
				return true;
			}
		} catch (Exception ignoreException) {
			System.out.println("El PIN no es valido.");
		}
		return false;

	}
	public boolean comprobarPIN(String pin) {
		return this.pin.comprobarPassword(pin);
	}
}
