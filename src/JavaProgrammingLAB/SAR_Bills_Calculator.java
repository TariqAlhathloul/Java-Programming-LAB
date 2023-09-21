package JavaProgrammingLAB;
import java.util.Scanner;
/*
* program that ask the user to enter an amount in Saudi Riyal.
*Then print the minimum number of bills required to get the given amount.
*/

/*
 * PROJECT TITLE: Introduction to Java applications.
 *PURPOSE OF PROJECT: Practice Java programming language.
 *VERSION or DATE: week 4, 09/14/23
 *HOW TO START THIS PROJECT:visit the following websites https://www.bluej.org/ or any IDE you Desire.
 */
public class SAR_Bills_Calculator {
    public void SAR_BILLs_CALCULATOR() {
        Scanner scan = new Scanner(System.in);

        int $1 = 0, $5 = 0, $10 = 0, $50 = 0, $100 = 0, $500 = 0;
        int remainder = 0, bill;
        System.out.println("Enter an amount in Saudi Riyal: ");
        bill = scan.nextInt();

        if (bill >= 500) {
            $500 = bill / 500;
            remainder = bill % 500;
        }

        if (remainder < 500 && remainder >= 100) {
            $100 = remainder / 100;
            remainder = bill % 100;
        }

        if (remainder < 100 && remainder >= 50) {
            $50 = remainder / 50;
            remainder %= 50;
        }

        if (remainder < 50 && remainder >= 10) {
            $10 = remainder / 10;
            remainder %= 10;
        }

        if (remainder < 10 && remainder > 5) {
           $5 = remainder / 5;
            remainder %= 5;
        }

        if (remainder < 5 && remainder >= 1) {
            $1 = remainder;
        }

        else if(bill <= 0){
            System.out.println("The amount Cannot be less than 0.");
        }
        int min_number = $500 + $100 + $50 + $10 + $5 + $1;
        System.out.println("The minimum number required for the amount: " + bill + " is = " + min_number);
        System.out.printf("500 SR: %d\n100 SR: %d\n50 SR: %d\n10 SR: %d\n5 SR: %d\n1 SR: %d\n", $500, $100, $50, $10, $5, $1);
        //System.out.printf("500SR: %.2f\n100SR: %.2f\n50SR: %.2f\n10SR: %.2f\n5SR: %.2f\n1SR: %.2f\n", $500, $100, $50, $10, $5, $1);
        scan.close();
    }

}
