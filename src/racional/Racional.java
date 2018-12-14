package racional;

public class Racional {

	private int numerador;
	private int denominador;

	public Racional(int n, int d) {
		numerador = n;
		denominador = d;
	}

	public void asignaNumerador(int x) {
		numerador = x;
	}

	public void asignaDenominador(int y) {
		denominador = y;
	}
	public void imprimir() {
		System.out.print(numerador+"/" + denominador);
	}
	public String toString() {
		return "Numerador: " + numerador +"\n"+
				"Denominador: " + denominador + "\n";
	}
	
	
	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}
	private Racional obtenerMultiplo(int x) {
		return new Racional(numerador*x,denominador*x);
	}

	public Racional suma(Racional b) {
		Racional resultado = new Racional(1,1);
		Racional r1 = new Racional(numerador,denominador);
		Racional r2 = new Racional(b.getNumerador(),b.getDenominador());
		
		if(b.getDenominador()==denominador) {
			resultado.asignaNumerador(numerador+b.getNumerador());
			resultado.asignaDenominador(denominador);
		} else {
			r1 = r1.obtenerMultiplo(b.getDenominador());
			r2 = r2.obtenerMultiplo(denominador);
			resultado.asignaDenominador(r1.getDenominador());
			resultado.asignaNumerador(r1.getNumerador()+r2.getNumerador());
		}
		
		
		return resultado;
	}
	
}
