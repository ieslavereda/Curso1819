package recursividad;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fibo(9));

	}
	
	public static int fibo(int n) {
		if(n==0 || n==1) return 1;
		else return fibo(n-1) + fibo(n-2);
	}

}
