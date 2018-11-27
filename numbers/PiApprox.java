package numbers;

import java.util.Scanner;

/**
 * Program to approximate pi using the Gregory-Leibniz series
 * for pi = 4 * (1-1/3+1/5-1/7 + ....)
 * 
 * @author ravi
 *
 */
public class PiApprox {

	public static void main(String[] args) {
		int iterations = -1 ;
		double pi = 1;
		Scanner scan = new Scanner(System.in);

		/* Validate input */
		do {
			System.out.print("Enter the number of iterations(+ve integer) to approximate pi to: ");
			while(!scan.hasNextInt()) {
				System.out.print("Please enter a +ve integer only: ");
				scan.next();
			}
			iterations = scan.nextInt();
		} while(iterations < 0 );
		scan.close();
		
		/* Keep track of even or odd position term */
		int counter = 1; 
		/* Calculate at which odd number the loop stops! */
		int loopStop = (iterations - 3)/2 + 1;
		
		for(double i = 3; i<loopStop; i+=2) {
			if(counter % 2 == 0) {
				pi = pi+(1/i);
			}
			else {
				pi = pi-(1/i);
			}
			counter++;
		}
		pi = 4 * pi;
		System.out.println("Pi approximated to " + iterations + " iterations using Gregory-Leibniz series  = " + pi);
	}

}
