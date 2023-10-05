package JavaProgrammingLAB;
import java.util.Scanner;

/*
|---------------------------------|
|DATE: week 5, 2023 sep 21 | LAB 3|
|---------------------------------|
*/

/*
--Write a Java program that reads two floating-point numbers and tests
--whether they are the same up to three decimal places.
*/
public class compareDoubles {
    Scanner scan = new Scanner(System.in);
    public void compare2Doubles() {

        System.out.println("Enter First Floating-point Number:");
        double x = scan.nextDouble();
        System.out.println("Enter Second Floating-point Number:");
        double y = scan.nextDouble();
        scan.close();

        y = y / 1000;
        x = x / 1000;
        /*
        ************************
        * Still need to improve*
        ************************
         */

        if((int)x == (int)y) {
            System.out.println(x + "==" + y);
        } else {
            System.out.println(x + "!=" + y);
        }
    }
}
