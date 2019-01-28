package tad2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.*;

public class Test {

	public static void main(String[] args) {
		
		String fichero = "listas";
		File f = new File(fichero);
				
//		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		
		
		ListaDoblementeEnlazada lista=new ListaDoblementeEnlazada();
//		
//		lista.insertarCabeza(new Nodo(new Persona("Jose","Martinez")));
//		lista.insertarCabeza(new Nodo(new Persona("Jose","Cabeza")));
//		lista.insertarCola(new Nodo(new Persona("Jose","Cola")));
		
//		System.out.println(lista);
		
//		try {
//			
//			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("listas")));
//			oos.writeObject(lista);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			if(oos!=null)
//				try {
//					oos.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		}
		
		//System.out.println(lista.existe(new Persona("Jose","Martinez")));
		
		try {
			
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
			
			lista = (ListaDoblementeEnlazada)ois.readObject();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(ois!=null)
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		System.out.println(lista);
		
	}

}
