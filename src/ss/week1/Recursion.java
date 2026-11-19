package ss.week1;

import java.util.Arrays;

/**
 * GreatestDigit class.
 */
public class Recursion {
    /**
     * Tests the recursive methods and prints to the console.
     *
     * @param args command-line arguments; currently unused
     */
    public static void main(String[] args) {
        // Test for 1.24
        System.out.println(greatestDigit(48271));

        // Tests for 1.25
        /*System.out.println(isPalindrome(new int[] {1, 2, 3, 2, 1}, 0, 0));
        System.out.println(isPalindrome(new int[] {5, 4, 4, 5}, 0, 0));
        System.out.println(isPalindrome(new int[] {1, 2, 3, 4, 5}, 0, 0));*/

        // Tests for 1.26
        int[] data = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println(search(data, 10, 0, data.length - 1));
        System.out.println(search(data, 2, 0, data.length - 1));
        System.out.println(search(data, 15, 0, data.length - 1));
    }

    /**
     * Finds the greatest digit in a given positive integer.
     *
     * @param a positive integer
     * @return the greatest common divisor of a and b
     */
    public static int greatestDigit(int a) {
        char[] digits = Integer.toString(a).toCharArray();
        if (digits.length == 1) { return (int) digits[0] - '0'; }
        return Math.max(
                (int) digits[0] - '0',
                greatestDigit(Integer.parseInt(new String(digits).substring(1)))
        );
    }

    /**
     * Determines whether an array of integers is a palindrome.
     *
     * @param arr array of integers
     * @param start first index to compare in arr
     * @param end second index to compare in arr
     * @return true if arr is a palindrome, false otherwise
     */
    public static boolean isPalindrome(int[] arr, int start, int end) {
        return false;
    }

    /**
     * Performs a recursive binary search to find the index of a given target value in an array
     * of ints, or -1 if not found.
     *
     * @param arr int array to search
     * @param target target value to search for
     * @param start start index of search in array
     * @param end end index of search in array
     * @return index of target in arr, or -1 if not found
     */
    public static int search(int[] arr, int target, int start, int end) {
        if (end - start <= 0) { return -1; }
        int mid = (start + end) / 2;
        if (arr[mid] > target) {
            return search(arr, target, start, mid);
        } else if (arr[mid] < target) {
            return search(arr, target, mid + 1, end);
        } else {
            return mid;
        }
    }
}
