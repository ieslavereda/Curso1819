package complejos;

public class Complejo {
	
	private double pReal;
	private double pImag;
	
	public Complejo() {
		
	}
	
	public void asignar(double x, double y) {
		pReal=x;
		pImag=y;
	}
	
	public void sumar(Complejo b) {
		
		pReal = pReal + b.getPReal();
		pImag = pImag + b.getPImag();
	}
	
	public void imprimir() {
		System.out.print(pReal + " + " + pImag +"i");
	}
	
	public double getPReal() {
		return pReal;
	}
	public double getPImag() {
		return pImag;
	}
}
