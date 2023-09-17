package JavaProgrammingLAB;
import java.util.Scanner;
/*
* program that ask the user to enter an amount in Saudi Riyal.
*Then print the minimum number of bills required to get the given amount.
*/
public class SAR_Bills_Calculator {
    public void SAR_BILLs_CALCULATOR() {
        Scanner scan = new Scanner(System.in);

        int $1 = 0, $5 = 0, $10 = 0, $50 = 0, $100 = 0, $500 = 0;
        int reminder = 0, bill, counter = 0;
        System.out.println("Enter an amount in Saudi Riyal: ");
        bill = scan.nextInt();

        if (bill >= 500) {
            $500 = bill / 500;
            reminder = bill % 500;
        }

        if (reminder < 500 && reminder >= 100) {
            $100 = reminder / 100;
            reminder = bill % 100;
        }

        if (reminder < 100 && reminder >= 50) {
            $50 = reminder / 50;
            reminder %= 50;
        }

        if (reminder < 50 && reminder >= 10) {
            $10 = reminder / 10;
            reminder %= 10;
        }

        if (reminder < 10 && reminder > 5) {
           $5 = reminder / 5;
            reminder %= 5;
        }

        if (reminder < 5 && reminder >= 1) {
            $1 = reminder;
        }

        else if(bill <= 0){
            System.out.println("The amount Cannot be less than 0.");
        }
        int min_number = $500 + $100 + $50 + $10 + $5 + $1;
        System.out.println("The minimum number required for the amount: " + bill + " is = " + min_number);
        System.out.printf("500 SR: %d\n100 SR: %d\n50 SR: %d\n10 SR: %d\n5 SR: %d\n1 SR: %d\n", $500, $100, $50, $10, $5, $1);
        //System.out.printf("500SR: %.2f\n100SR: %.2f\n50SR: %.2f\n10SR: %.2f\n5SR: %.2f\n1SR: %.2f\n", $500, $100, $50, $10, $5, $1);
    }
}
