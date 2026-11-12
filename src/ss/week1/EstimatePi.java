package ss.week1;

import java.util.Scanner;
import java.lang.Math;

public class EstimatePi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of iterations: ");
        int N = input.nextInt();
        int n = 0;
        for (int i = 0; i < N; i++) {
            double x = Math.random();
            double y = Math.random();
            if (Math.pow(x, 2) + Math.pow(y, 2) <= 1) {
                n++;
            }
        }
        double piEstimate = (4 * n) / (double) N;
        System.out.println("Estimation of pi: " + piEstimate);
        input.close();
    }
}
