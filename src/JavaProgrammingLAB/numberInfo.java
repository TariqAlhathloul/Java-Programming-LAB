package JavaProgrammingLAB;
import java.util.Scanner;

/*
Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
Otherwise, print "positive" or "negative".
Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
*/

/*
 *PROJECT TITLE: Introduction to Java applications.
 *PURPOSE OF PROJECT: Practice Java programming language.
 *VERSION or DATE: week 5, 09/21/23
 *HOW TO START THIS PROJECT:visit the following websites https://www.bluej.org/ or any IDE you Desire.
 */



public class numberInfo {
    public void getNumberAbs() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Double:");
        double number = scan.nextDouble();
        scan.close();
        if (number == 0) {
            System.out.println("Zero");
        }
        else if(number > 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
        double absValue = Math.abs(number);
        if (absValue < 1) {
            System.out.println("Small");
        }else if (absValue > 1000000) {
            System.out.println("Large");
        }

    }
}
