/**
 * 
 */
package multiSockets;

/**
 * Creado el 11 mar. 2019
 * @author <a href="mailto:joaalsai@ieslavereda.es">Joaquin Vicente Alonso Saiz</a>
 *
 */
import java.net.*;
import java.io.*;
 
public class KKMultiServer {
    public static void main(String[] args) throws IOException {
 
    
 
        int portNumber = 2000;
        boolean listening = true;
         
        try (ServerSocket serverSocket = new ServerSocket(portNumber)) { 
            while (listening) {
                new KKMultiServerThread(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            System.err.println("Could not listen on port " + portNumber);
            System.exit(-1);
        }
    }
}
