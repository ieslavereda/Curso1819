package ejemploOO;

public class Cuenta {
	private int numero;
	private Persona titular;
	private String entidad;
	private float saldo;
	
	public Cuenta(int numero, Persona titular, String entidad, float saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.entidad = entidad;
		this.saldo = saldo;
		titular.setIBAN(this);
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Persona getTitular() {
		return titular;
	}
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
