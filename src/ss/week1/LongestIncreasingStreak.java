package ss.week1;

public class LongestIncreasingStreak {
    /**
     * Prints the longest increasing streak for a test array of temperatures.
     *
     * @param args command-line arguments; currently unused
     */
    public static void main(String[] args) {
        int[] temps = {
                12, 13, 14, 15, 13, 14, 15, 16, 17, 12, 13, 14, 10, 11, 12, 13,
                12, 13, 14, 15, 16, 17, 18, 12, 11, 10, 9, 8, 7, 8, 9, 10, 11, 12
        };
        System.out.println("The longest increasing streak is: " + LongestIncStreakLength(temps));
    }

    /**
     * Returns the length of the longest increasing streak in the input array.
     *
     * @param temps an array of measured temperatures; assumes a non-empty array
     * @return an integer representing the length of the longest increasing streak in the input
     */
    public static int LongestIncStreakLength(int[] temps) {
        int longestStreak = 1;
        int currentStreak = 1;
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > temps[i-1]) {
                currentStreak++;
                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }
            } else {
                currentStreak = 1;
            }
        }
        return longestStreak;
    }
}
