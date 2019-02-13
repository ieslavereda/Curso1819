package genericTypes;

public class Ejemplar {

	private int id;
	private boolean prestado;
	private Socio prestadoA;
	private Libro libro;

	public Ejemplar(int id, Libro libro) {
		super();
		this.id = id;
		this.libro = libro;
		prestadoA = null;
		prestado = false;
	}

	public boolean prestar(Socio socio) {

		if (prestado || socio.getEjemplares().getCantidad() >= 3) {
			return false;
		} else {
			socio.getEjemplares().insertar(this);
			prestado = true;
			prestadoA = socio;
		}

		return prestado;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public Socio getPrestadoA() {
		return prestadoA;
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
