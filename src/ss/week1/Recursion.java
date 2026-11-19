package ss.week1;

/**
 * GreatestDigit class.
 */
public class Recursion {
    /**
     * Tests the gcd method with some arbitrary pairs.
     *
     * @param args command-line arguments; currently unused
     */
    public static void main(String[] args) {
        System.out.println(greatestDigit(48271));
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
}
