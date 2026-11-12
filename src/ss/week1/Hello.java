package ss.week1;

import java.util.Scanner;
/**
* Hello World class.
*/
public class Hello {
    /**
    * Prints a greeting to the console.
    * @param args command-line arguments; currently unused
    */
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("What is your age?");
        int age = input.nextInt();
        System.out.println("Hello " + name + ", you are " + age + " years old");
        input.close();
    }
}
