package ficheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Ejemplo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileOutputStream fos = null;
		FileInputStream fis = null;
		int dato;
		

		try {
			//fos = new FileOutputStream("prueba.txt", true);
			//byte[] palabra = { (byte) 'H', (byte) 'O', (byte) 'L', (byte) 'A' };
			//fos.write(palabra);
			
			fis = new FileInputStream("prueba.txt");
			
			dato=fis.read();
			while(dato!=-1){
				System.out.print((char)dato);
				dato=fis.read();
			}
			System.out.print(dato);
			
			
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			//if(fos!=null)fos.close();
			if(fis!=null)fis.close();
		}
	}

}
