package recursividad;

public class DivisionEntera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(division(8,2));
	}

	public static int division(int numerador, int denominador) {
		if (numerador < denominador)
			return 0;
		else
			return 1 + division(numerador - denominador, denominador);
	}

}
