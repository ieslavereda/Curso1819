package password;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Password password = new Password(Password.MAYUSCULAS+Password.MINUSCULAS+Password.NUMEROS+Password.ESPECIALES,8);
		
		System.out.println(password.getPasswd());
		
		Password p = new Password(Password.generarPIN());
		
		System.out.println(p.getPasswd());
		
		
	}

}
