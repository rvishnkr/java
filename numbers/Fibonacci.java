package numbers;

import java.util.Scanner;

/**
 * Program that prints the fibonacci series and sum up to a user defined value
 * Uses recursive and non-recursive methods.
 * 
 * @author ravi
 *
 */
public class Fibonacci {

	/**
	 * Recursive Fibonacci sum finder
	 * 
	 * @param n The number up to which Fibonacci sum needs to be found
	 * @return The nth Fibonacci sum
	 */
	static int recFibonSum(int n) {
		if(n <=1 ) {
			return n;
		}
		return recFibonSum(n-1) + recFibonSum(n-2);
	}

	/**
	 * Non-recursive Fibonacci series printer
	 * 
	 * @param n The number up to which Fibonacci series is to be printed
	 */
	static void nonrecFibonSeries(int n) {
		int i = 1, t1 = 0, t2 = 1;
		System.out.print("First " + n + " terms: ");

		while (i <= n) {
			System.out.print(t1 + " ");

			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;

			i++;
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Enter number upto which Fibonacci series to print: ");
		Scanner sc = new Scanner(System.in);
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Please enter an integer only! ");
		}
		int n = sc.nextInt();
		sc.close();
		
		nonrecFibonSeries(n);
		System.out.println("Fibonacci sum: " + recFibonSum(n));
	}
}
