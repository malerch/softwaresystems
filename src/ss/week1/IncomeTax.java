package ss.week1;

import java.util.Scanner;
import java.lang.Math;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your income? ");
        int income = input.nextInt();
        double incomeTax;
        if (income <= 35472) {
            incomeTax = 0.0942 * income;
        } else if (income <= 69398) {
            incomeTax = 3341 + 0.3707 * (income - 35472);
        } else {
            incomeTax = 15917 + 0.4950 * (income - 69398);
        }

        System.out.print("Your income tax is " + incomeTax);

        input.close();
    }
}
