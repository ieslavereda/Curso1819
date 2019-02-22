package abstracta;

public class Libro {

	private int codEjemplar = 0;
	private String titulo;
	private String autor;
	private String ISBN;
	private Lista<Ejemplar> ejemplares;

	public Libro(String titulo, String autor, String iSBN, int cantidad) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
		//ejemplares = new Lista<Ejemplar>();
		addEjemplares(cantidad);

	}

	public void addEjemplares(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			ejemplares.insertar(new Ejemplar(codEjemplar, this));
			codEjemplar++;
		}
	}

	public Lista<Ejemplar> getEjemplares() {
		return ejemplares;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + "]";
	}

}
