package JavaProgrammingLAB;
import java.util.Scanner;


/*
|---------------------------------|
|DATE: week 5, 2023 sep 21 | LAB 3|
|---------------------------------|

*/
/*
* Write a Java program to get a number from the user and print whether
*  it is positive or negative and if it is odd or even.
*/

public class NumberCheck {
    Scanner scan = new Scanner(System.in);
    public void numCheck(){
        System.out.println("Enter a Number: ");
        int num = scan.nextInt();

        if(num > 0){
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {

            System.out.println(num + " is a negative number.");
        }else{
            System.out.println(num + " is neither negative nor positive.");
        }
        if(num % 2 == 0){
            System.out.println(num + " is an even number.");
        }else{
            System.out.println(num + " is an odd number.");
        }
        scan.close();
    }

}
