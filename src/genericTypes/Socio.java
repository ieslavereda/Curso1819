package genericTypes;

public class Socio {
	private String nombre;
	private String apellidos;
	private String DNI;

	public Socio(String nombre, String apellidos, String DNI) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getDNI() {
		return DNI;
	}



	public void setDNI(String dNI) {
		DNI = dNI;
	}



	@Override
	public String toString() {
		return "[nombre=" + nombre + ", apellidos=" + apellidos + "]\n";
	}

}
