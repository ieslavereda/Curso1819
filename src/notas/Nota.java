package notas;

public class Nota {

	private float valor;
	private String asignatura;
	private String alumno;

	public Nota() {
	}

	public Nota(float valor, String asignatura, String alumno) {
		this.valor = valor;
		this.asignatura = asignatura;
		this.alumno = alumno;
	}

	public float getValor() {
		return valor;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public String getAlumno() {
		return alumno;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void setAsignatua(String asignatura) {
		this.asignatura = asignatura;
	}

	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}

	public String obtenerCalificacion() {
		if (valor < 5)
			return "Insuficiente";
		else if (valor >= 5 && valor < 6)
			return "Suficiente";
		else if (valor >= 6 && valor < 9)
			return "Notable";
		else
			return "Sobresaliente";
	}

	public String toString() {
		return "Nombre: " + this.alumno + "\n" +
				"Asignatura: " + this.asignatura + "\n" +
				"Nota : " + this.valor	+ "\n"+
				"Calificacion : " + obtenerCalificacion();
	}
}
