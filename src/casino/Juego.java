package casino;

public class Juego {

	private final int creditos;
	
	public Juego(int creditos) {
		this.creditos=creditos;
	}
	
	public void jugar (Tarjeta tarjeta) {
		
		int tickets;
		
		if(tarjeta.getCreditos()>=creditos) {
			
			tickets = (int)(Math.random()*10);
			tarjeta.setTickets(tarjeta.getTickets()+tickets);
			tarjeta.setCreditos(tarjeta.getCreditos()-creditos);
			
			System.out.println("Tarjeta numero: " + tarjeta.getNumero());
			System.out.println("Tickets ganados: " + tickets);
			System.out.println("Saldo de tickets: " + tarjeta.getTickets());			
			
		}else {
			System.out.println("No dispone de creditos suficientes");
		}
		
	}
}
