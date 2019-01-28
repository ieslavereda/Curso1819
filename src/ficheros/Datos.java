package ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		String nombre = "Manolo Garcia";
		float altura = 185.5f;

		try {

			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("datos.txt")));
			
			dos.writeFloat(altura);
			dos.writeUTF(nombre);

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}finally {
			if(dos!=null)
				try {
					dos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		try {
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream("datos.txt")));
			
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
