package ss.week1;

import java.util.Scanner;
import java.lang.Math;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the amount borrowed? ");
        int amountBorrowed = input.nextInt();
        System.out.print("What is the yearly interest rate (in %)? ");
        double yearlyInterestRate = input.nextDouble() / 100;
        double monthlyInterestRate = yearlyInterestRate / 12;
        System.out.print("What is the number of years? ");
        int numYears = input.nextInt();

        long monthlyPayment = Math.round(
            ((monthlyInterestRate)
            / (1 - Math.pow((1 + monthlyInterestRate), -(numYears * 12))))
            * amountBorrowed
        );

        System.out.print("The monthly payment is: " + monthlyPayment);

        input.close();
    }
}
