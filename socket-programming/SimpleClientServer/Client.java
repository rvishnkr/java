import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try {
			
			System.out.println("Client started..");
			
			//A socket object takes two parameters: an ip address and port number
			//In this case, it requires the ip address and port number of the server
			//'localhost' refers to the ip address of the local machine
			Socket clientSocket = new Socket("localhost", 5005);
			System.out.println("Connection established!");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
