package cajero;

public class Password {
	public static final String NUMEROS = "0123456789";
	public static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
	public static final String ESPECIALES = "<>_?¿:;$%&*+";
	
	private String passwd;
	
	public Password(String passwd) {
		this.passwd=passwd;
	}
	
	public Password(String cadena, int cantidad) {
		this.passwd = generarPassword(cadena,cantidad);
	}
	public String getPasswd() {
		return passwd;
	}
	public static String generarPIN() {
		return generarPassword(NUMEROS,4);
	}
	
	public static String generarPasswordSeguro() {
		
		return generarPassword(NUMEROS+MAYUSCULAS+MINUSCULAS+ESPECIALES,10);
		
	}
	
	public boolean comprobarPassword(String passwd) {
		return this.passwd.equals(passwd);
	}
	
	private static String generarPassword(String cadena,int cantidad) {
		String passwd="";
		for(int i=0;i<cantidad;i++) {
			passwd+=cadena.charAt((int)(Math.random()*cadena.length()));
		}
		
		return passwd;
	}
}
