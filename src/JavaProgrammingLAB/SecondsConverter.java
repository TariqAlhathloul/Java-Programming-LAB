package JavaProgrammingLAB;
import java.util.Scanner;
/*
 * PROJECT TITLE: Introduction to Java applications.
 *PURPOSE OF PROJECT: Practice Java programming language.
 *VERSION or DATE: week 4, 09/14/23
 *HOW TO START THIS PROJECT:visit the following websites https://www.bluej.org/ or any IDE you Desire.
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
