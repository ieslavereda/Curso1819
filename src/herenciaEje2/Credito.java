package herenciaEje2;

public class Credito extends Tarjeta {

	private float credito;
	private float limiteTarjeta;
	private float interes;

	public Credito(int numero, String titular, Cuenta cuenta, float limite, float interes) {

		super(numero, titular, cuenta);
		this.limiteTarjeta = limite;
		this.interes = interes;
		credito = limite;
	}

	public boolean pagoCredito(float cantidad) {
		boolean realizado = false;
		if (cantidad <= credito) {
			credito -= cantidad;
			realizado = true;
		} else {
			System.out.println("No hay credito disponible.");
		}
		return realizado;
	}

	public void pagoCompras() {
		float compras = limiteTarjeta - credito;
		cuenta.setSaldo(cuenta.getSaldo() - (compras * (1+interes/100)));
		credito = limiteTarjeta;
	}

	public String toString() {
		return super.toString() + "Credito actual: " + credito + "\n" + "Limite inicial: " + limiteTarjeta + "\n"
				+ "Interes: " + interes + "\n";
	}
}
