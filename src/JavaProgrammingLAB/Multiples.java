package JavaProgrammingLAB;
import java.util.Scanner;

/*
 * PROJECT TITLE: Introduction to Java applications.
 *PURPOSE OF PROJECT: Practice Java programming language.
 *VERSION or DATE: week 6, 09/28/23
 *HOW TO START THIS PROJECT:visit the following websites https://www.bluej.org/ or any IDE you Desire.
 */


/*
*
* Write a java program that asks the user to enter a number between 50 and 100
* then print all the multiple of 5 from zero to the given number.
*
* */
public class Multiples {
    Scanner scan = new Scanner(System.in);
    public void MultiplesOfNumber() {
        int number,result = 1, i=1;
        System.out.println("Enter A Positive Number Between 50-100.");
        number = scan.nextInt();

        if(number >=50 && number <=100) {
            while (result < number) {
                result = i * 5;
                System.out.print(result + ", ");
                ++i;
            }
        }else{
            System.out.println("Wrong Number, Enter The Number Again.");
            System.out.println("\"The Given Number Must Be Between 50-100\".");
        }

    }

}
