package ejemploOO;

public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	private Persona propietario;
	private String combustible;
	private String color;
	private int cv;
	private float precio;
	
	public Coche() {
	}
	
	public Coche(String marca,String combustible, String color,int cv,float precio) {
		this.marca=marca;
		this.combustible=combustible;
		this.color= color;
		this.cv=cv;
		this.precio=precio;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String m) {
		matricula=m;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		
		if(propietario.getIBAN().getSaldo()>=precio)		
		this.propietario = propietario;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}
	
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String toString() {
		return "Marca: " + this.marca+"\n"+
				"Modelo: " + this.modelo + "\n" +
				"Cv: " + cv + "\n"+
				"Propietario: " +propietario +"\n";
	}

}
