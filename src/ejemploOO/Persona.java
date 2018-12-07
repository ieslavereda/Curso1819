package ejemploOO;

public class Persona {
	private String nombre;
	private String apellidos;
	private String DNI;
	private Cuenta IBAN;
	
	public Persona() {
		
	}
	
	public Persona(String nombre,String apellidos, String DNI) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.DNI=DNI;
		this.IBAN=IBAN;
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

	public Cuenta getIBAN() {
		return IBAN;
	}

	public void setIBAN(Cuenta iBAN) {
		IBAN = iBAN;
	}
	
	
	public String toString() {
		return "Nombre: " + nombre + "\n" + 
				"Apellidos: " + apellidos +"\n"; 
	}
}
