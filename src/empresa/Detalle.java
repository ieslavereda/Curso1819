package empresa;

public class Detalle {

	private int cantidad;
	private String descripcion;
	private float unitario;
	private float total;

	public Detalle(int cantidad, String descripcion, float unitario) {
		super();
		this.cantidad = cantidad;
		this.descripcion = descripcion;
		this.unitario = unitario;
		this.total = cantidad * unitario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
		this.total = cantidad * unitario;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getUnitario() {
		return unitario;
	}

	public void setUnitario(float unitario) {
		this.unitario = unitario;
		this.total = cantidad * unitario;
	}

	public float getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "[ " +cantidad + " " + descripcion + "  " + unitario + "  "
				+ total + " ]";
	}
	

	
}
