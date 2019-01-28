package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader in = null;
		String fila;
		String[] campos;
		Usuario usuario = null;

		try {
			in = new BufferedReader(new FileReader("prueba.csv"));

			fila = in.readLine();
			while (fila != null) {
				campos = fila.split(",");
				if (!campos[0].equals("Nombre")) {
					usuario = new Usuario(campos[0], campos[1], campos[2]);
					System.out.println(usuario);
				}
				System.out.println(fila);

				fila = in.readLine();
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (in != null)
				in.close();
		}
	}

}
