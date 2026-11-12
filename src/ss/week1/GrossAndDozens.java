package ss.week1;

import java.util.Scanner;

public class GrossAndDozens {
    public static void main(String[] args) {
        System.out.println("How many eggs are there?");
        Scanner input = new Scanner(System.in);
        int numberOfEggs = input.nextInt();
        int gross = numberOfEggs / 144;
        int dozen = (numberOfEggs % 144) / 12;
        int rest = numberOfEggs % 12;
        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + rest);
        input.close();
    }
}
