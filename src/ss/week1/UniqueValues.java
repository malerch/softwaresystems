package ss.week1;

import java.lang.Math;
import java.util.Arrays;

public class UniqueValues {
    /**
     * Given a test array of integers, prints a new array containing only unique values in the
     * order they first appear.
     *
     * @param args command-line arguments; currently unused
     */
    public static void main(String[] args) {
        int[] values = {
                4, 7, 4, 3, 7, 9, 3, 2, 9, 1, 2, 11,
                14, 10, 7, 12, 4, 13, 2, 1, 13, 14, 15, 15, 9
        };


    }

    /**
     * Returns an array of unique integers in the input array, in the order they first appear.
     *
     * @param values an array of integers to be operated on
     * @return an array of the unique integers in values
     */
    public static int[] GetUniqueVals(int[] values) {
        int[] uniqueVals = new int[0];
        for (int value : values) {
            for (int uniqueVal : uniqueVals) {

            }
        }
    }
}
