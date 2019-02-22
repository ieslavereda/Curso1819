package abstracta;



public class Ejemplar {

	private int id;
	private boolean prestado;
	private Libro libro;

	public Ejemplar(int id, Libro libro) {
		super();
		this.id = id;
		this.libro = libro;
		//prestadoA = null;
		prestado = false;
	}

	

	public boolean isPrestado() {
		return prestado;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return String.valueOf(id) + " -> " + ((prestado) ? "Prestado" : "Disponible");
	}

}
