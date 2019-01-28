package ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejemplo3 {

	public static void main(String[] args) {
		
		PrintWriter pw=null;
		String cabecera ="Nombre,Apellido,telefono";
		Usuario usuario = new Usuario("Manolo", "Sanchez Ruiz","341342");
		try {
			
			pw = new PrintWriter(new FileWriter("prueba2.csv"));
			pw.println(cabecera);
			pw.write(usuario.getNombre()+","+usuario.getApellidos()+","+usuario.getTelefono()+"\n");
				
			
			
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			pw.close();
		}
	}
}
