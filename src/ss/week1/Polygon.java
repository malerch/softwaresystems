package ss.week1;

import java.util.Scanner;
import java.lang.Math;

public class Polygon {
    public static void main(String[] args) {
        System.out.println("Number of sides:");
        Scanner input = new Scanner(System.in);
        int numSides = input.nextInt();
        System.out.println("Length of each side:");
        double lengthSide = input.nextDouble();
        double area = (
            (numSides * Math.pow(lengthSide, 2))
            / (4 * Math.tan(Math.PI / numSides))
            );
        System.out.println("The area is: " + area);
        input.close();
    }
}
