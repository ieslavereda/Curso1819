package figura;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangulo f = new Triangulo(10);
		Cuadrado c = new Cuadrado(10);
		
		//System.out.println(f.obtenerPerimetro());		
		//System.out.println(c.obtenerPerimetro());
		
		Figura[] figuras = new Figura[2];
		
		figuras[0] = f;
		figuras[1] = c;
		
//		System.out.println((f instanceof Triangulo)?true:false);
		
		for(int i=0;i<figuras.length;i++) {
			System.out.println((figuras[i] instanceof Triangulo)?"Triangulo":"Cuadrado");
		}
	
	}

}
