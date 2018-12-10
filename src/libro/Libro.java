package libro;

public class Libro {

	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;

	public Libro() {
	}

	public Libro(String titulo, String autor, int ejemplares) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		prestados = 0;
	}

	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		ejemplares = 0;
		prestados = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

//	public void setEjemplares(int ejemplares) {
//		this.ejemplares = ejemplares;
//	}

	public boolean prestar() {
		boolean prestado = false;
		if (prestados < ejemplares) {
			prestados++;
			prestado = true;
		}
		return prestado;
	}

	public boolean prestar(int cantidad) {

		boolean prestado = false;

		if ((prestados + cantidad) <= ejemplares) {
			prestados += cantidad;
			prestado = true;
		}

		return prestado;
	}

	public boolean devolver() {
		boolean devuelto = false;

		if (prestados > 0) {
			prestados--;
			devuelto = true;
		}

		return devuelto;
	}

	public void addBook() {
		ejemplares++;
	}

	public boolean addBooks(int cantidad) {
		boolean added = false;

		if (cantidad > 0) {
			ejemplares += cantidad;
			added = true;
		}

		return added;
	}

	public boolean eliminarBooks(int cantidad) {
		boolean eliminado = false;
		
		if(ejemplares-cantidad>=prestados && cantidad>=0) {
			ejemplares-=cantidad;
			eliminado=true;
		}
		
		return eliminado;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + "\n" + "Autor: " + autor + "\n" + "Ejemplares: " + ejemplares + "\n"
				+ "Prestados: " + this.prestados;
	}

}
