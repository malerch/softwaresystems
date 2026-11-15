package ss.week1;

import java.util.Scanner;
/**
 * Phonewords class.
 */
public class Phonewords {
    /**
     * Asks user for a word and translates to digits using a telephone keypad mapping.
     *
     * @param args command-line arguments; currently unused
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.println("Please enter a word: ");
        String word = input.nextLine().toLowerCase();

        String digits = "";

        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a', 'b', 'c':
                    digits += '2';
                    break;
                case 'd', 'e', 'f':
                    digits += '3';
                    break;
                case 'g', 'h', 'i':
                    digits += '4';
                    break;
                case 'j', 'k', 'l':
                    digits += '5';
                    break;
                case 'm', 'n', 'o':
                    digits += '6';
                    break;
                case 'p', 'q', 'r', 's':
                    digits += '7';
                    break;
                case 't', 'u', 'v':
                    digits += '8';
                    break;
                case 'w', 'x', 'y', 'z':
                    digits += '9';
                    break;
                default:
                    break;
            }
        }

        // Output
        System.out.println(digits);

        input.close();
    }
}
