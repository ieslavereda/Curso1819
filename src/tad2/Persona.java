package tad2;

import java.io.Serializable;

public class Persona implements Serializable{

	private String nombre;
	private String apellidos;

	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;

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

	public String toString() {
		return "Nombre: " + nombre + "\n" + "Apellidos: " + apellidos + "\n";
	}

	public boolean equals(Object o) {
		boolean igual = false;

		if (o instanceof Persona) {
			igual = (((Persona) o).getNombre().compareTo(nombre) == 0)
					&& (((Persona) o).getApellidos().compareTo(apellidos) == 0);
		}

		return igual;
	}

}
