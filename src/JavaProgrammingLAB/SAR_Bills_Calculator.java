package JavaProgrammingLAB;
import java.util.Scanner;
/*
*A program that asks the user to enter an amount in Saudi Riyal.
*Then prints the minimum number of bills required to get the given amount.
*/

/*
 * PROJECT TITLE: Introduction to Java applications.
 *PURPOSE OF PROJECT: Practice Java programming language.
 *VERSION or DATE: week 4, 09/14/23
 *HOW TO START THIS PROJECT:visit the following websites https://www.bluej.org/ or any IDE you Desire.
 */
public class SAR_Bills_Calculator {
    public void SAR_BILLs_CALCULATOR() {

    Scanner in=new Scanner(System.in);
      System.out.print("Enter an amount in Saudi Riyal: ");
      int sar=in.nextInt();
      int amount=sar;
        
      int r500=amount/500;
      amount=amount-r500*500;
        
      int r200=amount/200;
      amount=amount-r200*200;
        
      int r100=amount/100;
      amount=amount-r100*100;
        
      int r50=amount/50;
      amount=amount-r50*50;
        
      int r20=amount/20;
      amount=amount-r20*20;
        
      int r10=amount/10;
      amount=amount-r10*10;
        
      int r5=amount/5;
      amount=amount-r5*5;
        
      int r1=amount;
        
      int total=r500+r200+r100+r50+r20+r10+r5+r1;
        
      System.out.println("The minimum number of bills required for " + sar + " SAR is " + total);
      System.out.println("500 SAR: "+r500);
      System.out.println("200 SAR: "+r200);
      System.out.println("100 SAR: "+r100);
      System.out.println("50 SAR: "+r50);
      System.out.println("20 SAR: "+r20);
      System.out.println("10 SAR: "+r10);
      System.out.println("5 SAR: "+r5);
      System.out.println("1 SAR: "+r1);
=======
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
