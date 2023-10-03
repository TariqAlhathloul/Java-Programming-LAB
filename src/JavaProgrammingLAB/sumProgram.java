package JavaProgrammingLAB;
import java.util.Scanner;
/*
 * PROJECT TITLE: Introduction to Java applications.
 *PURPOSE OF PROJECT: Practice Java programming language.
 *VERSION or DATE: week 6, 09/28/23
 *HOW TO START THIS PROJECT:visit the following websites https://www.bluej.org/ or any IDE you Desire.
*/

/*
* Write a java program that asks the user to enter two positive numbers.
*  If the user enters a negative number,
* then the program keeps asking him\her to renter a positive one.
*  Finally, the program prints the sum of the two numbers.
*/
public class sumProgram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first positive number: ");
        int n1=scan.nextInt();
        while (n1<0){
            System.out.println("You entered a negative number");
            System.out.print("Re-enter the first positive number: ");
            n1=in.nextInt();
        }
        System.out.print("Enter the second positive number: ");
        int n2=scan.nextInt();
        while (n2<0){
            System.out.println("You entered a negative number");
            System.out.print("Re-enter the second positive number: ");
            n2=in.nextInt();
        }
        int sum=n1+n2;
        System.out.print(n1+" + "+n2+" = "+sum);
    }

}
