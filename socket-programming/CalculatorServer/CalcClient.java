import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CalcClient {
	public static void main(String[] args) {
		try {
			System.out.println("Client started..");
			Socket clientSocket = new Socket("localhost", 5005);
			
			//Read some data from the client's console
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			
			//Read data sent from the server through the socket's input stream
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			//Send data to the server: to the socket's output stream
			PrintWriter out  = new PrintWriter(clientSocket.getOutputStream(), true);
			
			//Display a small menu for the user
			int option = 0;
			int num1 = 0;
			int num2 = 0;
			
			do {
				System.out.println("Select an operation:");
				System.out.println("1. Addition");
				System.out.println("2. Substraction");
				System.out.println("3. Multiplication");
				System.out.println("4. Division");
				System.out.println("5. Exit");
				
				//Use the BufferedReader to get input from the console
				option = Integer.parseInt(userInput.readLine());
				if(option != 5) {
					System.out.println("Enter the first number: ");
					num1 = Integer.parseInt(userInput.readLine());
					System.out.println("Enter the second nuber: ");
					num2 = Integer.parseInt(userInput.readLine());
					
					//Send these details to the server as a string with `:` as the delimiter
					out.println(option+":"+num1+":"+num2);
				}
				else {
					//Send dummy values to the server as a string with `:` as the delimiter
					out.println(option+"0:0");
					break;
				}
				
				//Capture result from the input stream the server sends back
				String result = in.readLine();
				
				System.out.println("Result from server: "+result+"\n");
			}
			while(true);
			System.out.println("Client terminated..");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
