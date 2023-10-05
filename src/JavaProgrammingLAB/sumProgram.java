package JavaProgrammingLAB;
import java.util.Scanner;
/*
 * PROJECT TITLE: Introduction to Java applications.
 *PURPOSE OF PROJECT: Practice Java programming language.
 *VERSION or DATE: week 6, 09/28/23
 *HOW TO START THIS PROJECT:visit the following websites https://www.bluej.org/ or any IDE you Desire.
*/

/*
*1.First question:
 * Write a java program that asks the user to enter two positive numbers.
*  If the user enters a negative number,
* then the program keeps asking him\her to renter a positive one.
*  Finally, the program prints the sum of the two numbers.
*/
public class sumProgram {
    Scanner scan = new Scanner(System.in);
    public void sumOfTwoPositiveNumbers(){
        int num1=0,num2=0, sum=0;
        System.out.println("Enter The First Positive Number: ");
        num1 = scan.nextInt();
        System.out.println("Enter The Second Positive Number: ");
        num2 = scan.nextInt();
        scan.close();
        if(num1 >= 0 && num2 >= 0) {
            sum = num1 + num2;
            System.out.println("Sum of the two numbers = " + sum);
        }else{
            System.out.println("You Entered a Negative Number Please ReEnter The numbers again");
        }
    }

}
