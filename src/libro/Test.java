package libro;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro l = new Libro("El quijote","Miguel de Cervantes",3);
		
		System.out.println(l.prestar(3));
		System.out.println(l.devolver());
		
		
		System.out.println(l.eliminarBooks(-1));
		System.out.println(l);
		
		

	}

}
