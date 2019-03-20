/**
 * 
 */
package collections;

/**
 * Creado el 20 mar. 2019
 * 
 * @author <a href="mailto:joaalsai@ieslavereda.es">Joaquin Vicente Alonso
 *         Saiz</a>
 *
 */
public class Persona {

	private String nombre;
	private String apellidos;

	public Persona(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + "]\n";
	}

	public boolean equals(Object o) {
		boolean iguales = false;
		if (o != null) {
			if (((Persona) o).getNombre().compareTo(nombre) == 0
					&& ((Persona) o).getApellidos().compareTo(apellidos) == 0)
				iguales = true;
		}

		return iguales;
	}
	
	public int hashCode() {
		return nombre.hashCode()+apellidos.hashCode();
	}

}
