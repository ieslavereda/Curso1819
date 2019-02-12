package genericTypes;

public class Ejemplar {
	
	private int id;
	private Libro libro;
	
	
	public Ejemplar(int id, Libro libro) {
		super();
		this.id = id;
		this.libro = libro;
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
		return "Ejemplar [id=" + id + ", libro=" + libro.getTitulo() + "]";
	}
	
	
	

}
