package ss.week1;

import java.util.Scanner;
import java.lang.Math;

public class NEmirps {
    /**
     * Asks user for a number N of emirps and outputs the first N emirps to console.
     *
     * @param args command-line arguments; currently unused
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many emirps? ");
        int N = input.nextInt();

        int i = 0;
        int j = 2;
        while (i < N) {
            if (isEmirp(j)) {
                System.out.print(j + " ");
                i++;
            }
            j++;
        }

        input.close();
    }

    /**
     * Determine whether a number is prime.
     *
     * @param number the number whose primality is determined
     * @return whether the number is prime
     */
    public static boolean isPrime(int number) {
        // for every integer i from 2 to sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // if number is divisible by i, number is not prime
            if (number % i == 0) {
                return false;
            }
        }
        // number is not divisible by any i, so number is prime
        return true;
    }

    /**
     * Reverses the digits of a number and returns the result.
     *
     * @param number the number to be reversed
     * @return the input number reversed
     */
    public static int reverse(int number) {
        // convert integer to string called numString
        String numString = Integer.toString(number);
        // convert string to CharArray called numArray
        char[] numArray = numString.toCharArray();
        // initialise an empty string reversedString
        String reversedString = "";
        // for i from the index of the final character to the first
        for (int i = numArray.length - 1; i >= 0; i--) {
            // add numArray[i] to reversedString
            reversedString += numArray[i];
        }
         // convert reversedString into an int and return it
        return Integer.parseInt(reversedString);
    }

    /**
     * Returns true if and only if the given number is an emirp.
     *
     * @param number the number whose emirpness is checked
     * @return true if number is emirp
     */
    public static boolean isEmirp(int number) {
        // check number is prime, the reversed number is prime,
        // the reversed number isn't the same, and return the result
        return isPrime(number) && isPrime(reverse(number)) && number != reverse(number);
    }
}
