package casino;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tarjeta t1 = new Tarjeta();
		Tarjeta t2 = new Tarjeta();
		
		Juego j = new Juego(10);
		
		Premio p1 = new Premio("Perrito piloto",20,10);
		Premio p2 = new Premio("Submarino flotador",10,10);
		Premio p3 = new Premio("Pelota cuadrada",5,10);
		Premio p4 = new Premio("Premio falso",5,10);
		
		Terminal t = new Terminal(p1,p2,p3);
		
		t.recargarCreditos(t1, 100);
		for(int i=0;i<5;i++) j.jugar(t1);
		
		t.transferirTickets(t1, t2);
		
		t.canjearPremio(t2, p1);
	}

}
