package common;

public class Persona {

	private String nombre;
	private int edad;
	private String DNI;

	public Persona(String nombre, int edad,String DNI) {

		this.nombre = nombre;
		this.edad = edad;
		this.DNI=DNI;

	}
	

	public void cumplirAnyos() {
		edad++;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public String getDNI() {
		return DNI;
	}


	public void saluda() {
		System.out.println("Hola, me llamo " + nombre);
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + "]";
	}

	
	
}
