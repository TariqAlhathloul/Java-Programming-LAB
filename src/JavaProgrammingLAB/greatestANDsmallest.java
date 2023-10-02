package JavaProgrammingLAB;
import java.util.Scanner;

/*
   * Take three numbers from the user and print the greatest number and the smaller number
*/

/*
 * PROJECT TITLE: Introduction to Java applications.
 *PURPOSE OF PROJECT: Practice Java programming language.
 *VERSION or DATE: week 5, 09/21/23
 *HOW TO START THIS PROJECT:visit the following websites https://www.bluej.org/ or any IDE you Desire.
 */
public class greatestANDsmallest {
    public void greatestAndSmallest() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers followed by \"Enter\" ");
        int num1=scan.nextInt(), num2=scan.nextInt(), num3=scan.nextInt();
        int arr[] = {num1,num2,num3};
        int greates = num1, smallest = num2;

        for (int j : arr) { // loop through all the numbers
            if (j > greates)
                greates = j;
            else if (j < smallest)
                smallest = j;
        }
        System.out.println(greates + " is the greatest number");
        System.out.println(smallest + " is the smallest number");
        scan.close();
    }
}
