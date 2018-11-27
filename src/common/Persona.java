package common;

public class Persona {

	private String nombre;
	private int edad;
	private float peso;
	private float altura;
	private float IMC;
	
	public Persona(String nombre, int edad, float peso, float altura) {

		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		IMC= (float) (peso/Math.pow(altura/100, 2));
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

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		IMC= (float) (this.peso/Math.pow(this.altura/100, 2));
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
		IMC= (float) (this.peso/Math.pow(this.altura/100, 2));
	}

	public float getIMC() {
		return IMC;
	}

	public boolean esMayorEdad() {
		return (edad>=18)?true:false;
	}
	
}
