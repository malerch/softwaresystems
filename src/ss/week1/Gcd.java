package ss.week1;

/**
 * Gcd class.
 */
public class Gcd {
    /**
     * Tests the gcd method with some arbitrary pairs.
     *
     * @param args command-line arguments; currently unused
     */
    public static void main(String[] args) {
        System.out.println(
                "Gcd of 12 and 18: " + gcd(12, 18)
                + "\nGcd of 17 and 5: " + gcd(17, 5)
                + "\nGcd of 0 and 7: " + gcd(0, 7)
        );
    }

    /**
     * Finds the greatest common divisor of integers a and b.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the greatest common divisor of a and b
     */
    public static int gcd(int a, int b) {
        if (b == 0) { return a; }
        return gcd(b, a % b);
    }
}
