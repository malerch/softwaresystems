package ss.week1;

import java.util.Scanner;
/**
* Fibonacci class.
*/
public class Fibonacci {
    /**
    * Ask the user for an integer and print the result of fib(n)
    *
    * @param args command-line arguments; currently unused
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.println("What's your name?");
        String name = input.nextLine();

        // Output
        System.out.println("Hello " + name + ", you are " + age + " years old");

        input.close();
    }

    /**
    * Calculates the nth fibonacci Number
    *
    * @param n Index of the fibonacci number to be calculated
    * @return nth fibonacci number
    */
    public static long fibonacci(int n) {

        return 0;
    }
}
