package JavaProgrammingLAB;
import java.util.Scanner;

/*
|----------------------------------|
|DATE: week 5 | 2023 sep 21 | LAB 2|
|----------------------------------|
*/

/*
* Write a Java program to solve quadratic equation: ax2 + bx + c =0.
* Where a, b and c are real numbers and a != 0.
* The term b2-4ac is known as the discriminant of a quadratic equation.
* It tells the nature of the roots.
* */
public class QuadraticEquationSolver {
        public static void quadraticEquationSolver() {

            Scanner input = new Scanner(System.in);

            System.out.print("Input a: ");
            double a = input.nextDouble();
            System.out.print("Input b: ");
            double b = input.nextDouble();
            System.out.print("Input c: ");
            double c = input.nextDouble();

            double result = b * b - 4.0 * a * c;
            if (result > 0.0) {
                double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
                System.out.println("The roots are " + r1 + " and " + r2);
            } else if (result == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The root is " + r1);
            } else {
                System.out.println("The equation has no real roots.");
            }

        }
    }
