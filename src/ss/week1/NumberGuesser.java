package ss.week1;

import java.util.Scanner;
import java.lang.Math;

public class NumberGuesser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randInt = (int) (Math.random() * 100);

        while (true) {
            System.out.print("Guess the number or DIE ");
            int answer = input.nextInt();
            if (answer < randInt) {
                System.out.println("Your guess is too low, fucking loser");
            } else if (answer > randInt) {
                System.out.println("Your guess is too high, fucking loser");
            } else {
                System.out.println(
                    "Your guess is correct! I guess you can stay alive for today"
                );
                break;
            }
        }

        input.close();
    }
}
