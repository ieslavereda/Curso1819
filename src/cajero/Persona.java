package cajero;

public class Persona {

	private String nombre;
	private String apellidos;
	private String DNI;
	private String fechaNac;
	private String email;
	
	public Persona(String nombre,String apellidos, String DNI) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.DNI=DNI;
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

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Nombre: " + nombre + "\n"+
				"Apellidos: " + apellidos +"\n" +
				"DNI: " + DNI;
	}
}
