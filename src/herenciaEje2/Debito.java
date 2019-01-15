package herenciaEje2;

public class Debito extends Tarjeta{

	private float cuota;

	public Debito(int numero, String titular, Cuenta cuenta, float cuota) {
		super(numero, titular, cuenta);
		this.cuota = cuota;
	}
	
	public void cargoCuota() {
		cuenta.setSaldo(cuenta.getSaldo()-cuota);
	}
	
	public String toString() {
		return super.toString()+
				"Cuota: " + cuota;
	}
	
}
