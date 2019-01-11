package empresa;

public class Cliente {

	private static int CLIENTEID = 1;
	private int id;
	private String DNI;
	private String nombre;
	private String apellidos;
	
	public Cliente(String DNI,String nombre,String apellidos) {
		id=CLIENTEID;
		this.DNI=DNI;
		this.nombre=nombre;
		this.apellidos=apellidos;		
		CLIENTEID++;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
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

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", DNI=" + DNI + ", nombre=" + nombre + " " + apellidos + "]\n";
	}
	
	@Override
	public boolean equals(Object o) {
		boolean igual = false;
		if (o instanceof Cliente) {
			igual=(((Cliente) o).getDNI().compareTo(DNI))==0;
		}
		return igual;
	}
}
