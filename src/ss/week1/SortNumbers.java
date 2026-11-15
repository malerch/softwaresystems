package ss.week1;

import java.util.Arrays;
import java.util.Scanner;
/**
 * SortNumbers class.
 */
public class SortNumbers {
    /**
     * Reads a line of numbers separated by whitespace and prints the numbers from low to high.
     *
     * @param args command-line arguments; currently unused
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.println("Please enter some numbers: ");
        String numbers = input.nextLine();
        String[] split = numbers.trim().split("\\s+");
        int[] digits = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            digits[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(digits);

        // Output
        System.out.println(Arrays.toString(digits));

        input.close();
    }
}
