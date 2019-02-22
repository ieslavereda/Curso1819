package abstracta;

public class Test {

	public static void main(String[] args) {
		
		
		ListaLibro listaLibro = new ListaLibro();
		
		
		listaLibro.insertar(new Libro("El quijote","Cervantes","45782034",7));
		
		
	
		System.out.println(listaLibro.obtenerLibroPorISBN("45782034"));
		
		
	}
}
