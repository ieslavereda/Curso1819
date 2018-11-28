package notas;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] vector = new int[4];
		Nota[] vector = new Nota[4];
		
		vector[0] = new Nota((float)6.4,"Matematicas","Pedro");
		vector[1] = new Nota(8.1f,"Matematicas","Juan");
		vector[2] = new Nota(7.2f,"Matematicas","Manolo");
		vector[3] = new Nota(5,"Matematicas","Tomas");
		
		mostrar(vector);
				
	}
	
	public static void mostrar(Nota[] vector) {
		for(int i=0;i<vector.length;i++) {
			System.out.println(vector[i].toString());
		}
		
	}

}
