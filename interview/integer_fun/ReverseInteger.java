package integer_fun;

import java.util.Scanner;

/**
 * Program to reverse an integer
 * Assumptions: No overflow, only integers & leading 0s are ignored
 * 
 * @author ravi
 */
public class ReverseInteger{
    
    /**
     * Main method to reverse an integer
     * @param args
     */
    public static void main(String[] args){
        //Noe: Leading 0s are ignored. The reversed number will never have any trailing 0s.
        int n = getInput();
        Boolean isNegative=false;
        if(n<0) {
           isNegative = true;
           n = 0-n;
        }
        int revInt = reverseInt(n);
        if(isNegative) {
            revInt = 0-revInt;
        }
        System.out.println("Reversed integer: " +revInt);
    }

    /**
     * 
     * @param n The integer to be reversed
     * @return The reversed integer
     */
    private static int reverseInt(int n){
        int rev = 0;
        while(n!=0) {
            rev = rev*10 + n%10;
            n = n/10;
        }
        return rev;
    }

    /**
     * Get input from STDIN
     * @return The input integer
     */
    private static int getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the integer to be reversed: ");
        while(!sc.hasNextInt()) {
            System.out.print("Must be an integer: ");
            sc.next();
        }
        int n = sc.nextInt();
        sc.close();
        return n;
    }


}

