package racional;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Racional r1 = new Racional(1,2);
		Racional r2 = new Racional(1,2);
		
		System.out.println(r1.suma(r2));
		r1.suma(r2).imprimir();
	}

}
