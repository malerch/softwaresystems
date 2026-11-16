package ss.week1;

import java.lang.Math;

public class AmountFines {
    /**
     * Prints the results for a test array.
     *
     * @param args command-line arguments; currently unused
     */
    public static void main(String[] args) {
        int[] speeds = {
                78, 85, 93, 102, 81, 77, 110, 120, 99, 83, 75, 88,
                97, 115, 100, 79, 80, 90, 104, 112, 70, 82, 86, 130, 84
        };
        int[] totalSpeeds = TotalFines(speeds);
        System.out.println(
                "Total amount of fines: " + (totalSpeeds[0] + totalSpeeds[1] + totalSpeeds[2])
                +  "\nTotal €50 fines: " + totalSpeeds[0]
                +  "\nTotal €100 fines: " + totalSpeeds[1]
                +  "\nTotal €200 fines: " + totalSpeeds[2]
        );
    }

    /**
     * Returns the total number of fines for each bracket (50, 100, 200).
     *
     * @param speeds an array of measured speeds
     * @return an array of 3 integers for the amount of fines for €50, €100 and €200 respectively
     */
    public static int[] TotalFines(int[] speeds) {
        int[] totalFines = new int[3];
        for (int speed : speeds) {
            if (speed > 80 && speed <= 90) {
                totalFines[0]++;
            } else if (speed > 90 && speed <= 100) {
                totalFines[1]++;
            } else if (speed > 100) {
                totalFines[2]++;
            }
        }
        return totalFines;
    }
}
