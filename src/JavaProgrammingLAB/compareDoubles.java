package JavaProgrammingLAB;
import java.util.Scanner;

/*
|----------------------------------|
|DATE: week 5 | 2023 sep 21 | LAB 2|
|----------------------------------|
*/

/*
* Write a Java program that reads two floating-point numbers and tests
* whether they are the same up to three decimal places.
*/


public class compareDoubles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers (click enter after each number):");

        double n1 = in.nextDouble();
        double n2 = in.nextDouble();

        final double PL=1E-3;//=0.001

        if (Math.abs(n1 - n2) <= PL)
            System.out.println("Entered numbers are the same up to third decimal places");
        else 
        {
            if((n1 - n2)>0)
                System.out.println("Greatest Number is " + n1);
            else 
                System.out.println("Greatest Number is " + n2);
        }  

    }
}
