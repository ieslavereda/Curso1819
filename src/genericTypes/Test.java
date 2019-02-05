package genericTypes;

public class Test {

	public static void main(String[] args) {
		
		Lista<Socio> listaSocio = new Lista<Socio>();
		Lista<Libro> listaLibro = new Lista<Libro>();
		
		listaSocio.insertar(new Socio("Manolo","Garcia"));
		listaSocio.insertar(new Socio("Pepe","Lopez"));
		
		listaLibro.insertar(new Libro("El quijote","Cervantes"));
		
		System.out.println(listaSocio);
		System.out.println(listaLibro);
		
		
	}
}
