package empresa;

import java.util.Date;

public class Factura {

	private static int numFactura = 1;
	private int numero;
	private Cliente cliente;
	private long fecha;
	private float total;
	private ListaDetalles detalles;

	public Factura(Cliente c) {
		numero = numFactura;
		numFactura++;
		cliente = c;
		fecha = System.currentTimeMillis();
		total = 0;
		detalles = new ListaDetalles();

	}

	public void añadirDetalle(Detalle d) {
		detalles.insertarDetalle(d);
		recalcularTotal();
	}

	private void recalcularTotal() {
		NodoDetalle aux = detalles.getCabeza();
		int total = 0;
		while (aux != null) {
			total += aux.getDetalle().getTotal();
			aux = aux.getSiguiente();
		}
		this.total = total;
	}
	

	public int getNumero() {
		return numero;
	}

	public String toString() {
		Date d = new Date(fecha);
		return "Factura nº: " + numero + "\n" + cliente + "Fecha: " + d + "\n" + detalles + "TOTAL: " + total + "\n";

	}
}
