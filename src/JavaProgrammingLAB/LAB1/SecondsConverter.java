package JavaProgrammingLAB.LAB1;
import java.util.Scanner;



/*
|----------------------------------|
|DATE: week 4 | 2023 sep 14 | LAB 1|
|----------------------------------|
*/

public class SecondsConverter {

    public static void Sconverter(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int s=input.nextInt();
        System.out.print("Enter the number of minutes: ");
        int m=input.nextInt();
        System.out.print("Enter the number of hours: ");
        int h=input.nextInt(), mConv=m*60, hConv=h*3600, sTotal=s+mConv+hConv;
        System.out.print("The total number of seconds is " + sTotal);
        input.close();

    }

}
