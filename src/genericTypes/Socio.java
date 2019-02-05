package genericTypes;

public class Socio {
	private String nombre;
	private String apellidos;
	public Socio(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	@Override
	public String toString() {
		return "[nombre=" + nombre + ", apellidos=" + apellidos + "]\n";
	}
	
}
