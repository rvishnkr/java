import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
			
			System.out.println("Waiting for client\nListening on port 5005...");
			//Create a new server socket object
			//Server sockets need to be bound to a port number
			//'ss' is now bound to port number '5005'
			ServerSocket ss = new ServerSocket(5005);
			//The server socket is not used for communication
			//The only purpose of a server socket object is to accept incoming client requests/connections
			
			//To get a socket object for communication, we use the server socket's accept() method
			//As soon as a connection is accepted, a socket object is returned	
			//This socket object will be used for communication
			Socket serverSocket = ss.accept();
			System.out.println("Connection established!");

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}