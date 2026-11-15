package ss.week1;

import java.util.Scanner;
import java.lang.Math;
/**
* Fibonacci class.
*/
public class Fibonacci {
    /**
    * Ask the user for an integer and print the result of fib(n).
    *
    * @param args command-line arguments; currently unused
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.println("Enter the index of the number");
        int n = input.nextInt();

        // Output
        System.out.println("Fibonacci number: " + fibonacci(n));

        input.close();
    }

    /**
    * Calculates the nth fibonacci Number.
    *
    * @param n Index of the Fibonacci number to be calculated
    * @return nth Fibonacci number
    */
    public static long fibonacci(int n) {

        if (n == 0) {
             return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
