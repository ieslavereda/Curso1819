package casino;

public class Premio {

	private final String nombre;
	private final int tickets;
	private int cantidad;

	public Premio(String nombre, int tickets, int cantidad) {
		this.nombre = nombre;
		this.tickets = tickets;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getTickets() {
		return tickets;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public boolean equals(Premio p) {
		return nombre.equalsIgnoreCase(p.getNombre());
	}

}
