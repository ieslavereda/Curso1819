package herenciaEje1;

public class Factura extends Precio{

	private String cliente;
	private String emisor;
	
	public Factura(String cliente,String emisor,float cantidad ) {
		this.cliente=cliente;
		this.emisor=emisor;
		this.cantidad=cantidad;
	}
	
	public void imprimir() {
		System.out.println("Cliente: " + cliente +"\n"+
							"Emisor: " + emisor + "\n" + 
							"Total: " + cantidad+" €");
	}
}
