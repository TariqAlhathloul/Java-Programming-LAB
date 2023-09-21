package JavaProgrammingLAB;
import java.util.Scanner;
/*
*A program that asks the user to enter an amount in Saudi Riyal.
*Then prints the minimum number of bills required to get the given amount.
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
    }
}
