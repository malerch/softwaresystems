package ss.week1;

import java.util.Scanner;
import java.lang.Math;

public class NPrimes {
    /**
    * Determine whether a number is prime
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many primes? ");
        int N = input.nextInt();
        int i = 0;
        int j = 2;
        while (i < N) {
            if (isPrime(j)) {
                System.out.print(j + " ");
                i++;
            }
            j++;
        }
        input.close();
    }
}
