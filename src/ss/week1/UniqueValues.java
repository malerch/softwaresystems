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
        System.out.println(Arrays.toString(GetUniqueVals(values)));
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
            if (!IsInArray(value, uniqueVals)) {
                int[] newArr = new int[uniqueVals.length + 1];
                System.arraycopy(uniqueVals, 0, newArr, 0, uniqueVals.length);
                newArr[newArr.length - 1] = value;
                uniqueVals = newArr;
            }
        }
        return uniqueVals;
    }

    /**
     * Returns true if the provided int value is an element of the provided int array.
     *
     * @param value an int whose membership is checked
     * @param array an int array to check if value is an element of
     * @return true if value is in array, false otherwise
     */
    public static boolean IsInArray(int value, int[] array) {
        for (int elem : array) {
            if (elem == value) {
                return true;
            }
        }
        return false;
    }
}