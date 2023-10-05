package JavaProgrammingLAB;
import java.util.Scanner;

/*
 * PROJECT TITLE: Introduction to Java applications.
 *PURPOSE OF PROJECT: Practice Java programming language.
 *VERSION or DATE: week 6, 09/28/23
 *HOW TO START THIS PROJECT:visit the following websites https://www.bluej.org/ or any IDE you Desire.
 */

/*
*3.Third question:
* Write a java program, using the while loop, that:
•	Ask the user to give a positive number less than 100.
•	Print all the numbers from the given number to 200.
*
*/
public class ascendingNumber {
    Scanner scan = new Scanner(System.in);
    public void ascendingNum() {

        System.out.println("Enter A Positive Number between 0-100");
        int num = scan.nextInt();
        if(num >= 0 && num <= 100) {
            while (num <= 200) {
                System.out.println(num);
                num++;
            }
        }else{
            System.out.println("The Given Number must be between 0 and 100");
        }
    }
}
