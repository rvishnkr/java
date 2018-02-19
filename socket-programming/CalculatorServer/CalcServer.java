import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CalcServer {

	public static void main(String[] args) {
		try {
			System.out.println("Server started..");
			ServerSocket ss = new ServerSocket(5005);
			System.out.println("Waiting for client\nListening on port 5005...");
			
			Socket serverSocket = ss.accept();
			System.out.println("Connection established!");
			
			//Read some data from the client: from the socket's input stream
			BufferedReader in = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
			
			//Send data to the client: to the socket's output stream
			//the `false` flag keeps the data in the `out` object's internal buffer until `out.flush()` is called 
			PrintWriter out = new PrintWriter(serverSocket.getOutputStream(), true);
			
			while(true) {
				//Read data from the client and split it into different parts based on the delimiter
				String str[] = in.readLine().split(":");
				
				int option = Integer.parseInt(str[0]);
				int num1 = Integer.parseInt(str[1]);
				int num2 = Integer.parseInt(str[2]);
				int flag=0;
				String result ="";
				
				switch(option) {
				case 1:
					result = "Sum of "+num1+" and "+num2+": "+(num1+num2)	;
					break;
				case 2:
					result = "difference of "+num2+" from "+num1+": "+(num1-num2)	;
					break;
				case 3:
					result = "Product of "+num1+" and "+num2+": "+(num1*num2)	;
					break;
				case 4:
					result = "Division of "+num1+" by "+num2+": "+(num1/num2)	;
					break;
				case 5:
					flag = 1;
					break;
				default:
					System.out.println("Invalid option!");
					break;
				}
				//If exit option was chosen
				if(flag==1) {
					break;
				}
				
				//Send the result back to the client
				out.println(result);
				
			}
			System.out.println("Server terminated..");


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
