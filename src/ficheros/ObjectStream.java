package ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class ObjectStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario usuario = new Usuario("Manolo","Garcia Martinez","62555555");
		Coche c = new Coche("Toyota","Cualquiera","rojo",120,20000);
		Usuario usu;
		Coche co;
		
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		
		try {
			
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("objetos.txt")));
			
			oos.writeObject(usuario);
			oos.writeObject(c);
			
			
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			if(oos!=null)
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		try {
			
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("objetos.txt")));
			
			
			
			co=(Coche)ois.readObject();
			System.out.println(co.toString());
			
			usu=(Usuario) ois.readObject();
			System.out.println(usu.toString());
			
		}catch(IOException io) {
			io.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
