package JavaProgrammingLAB;
import java.util.Scanner;


/*
|---------------------------------|
|DATE: week 4, 2023 sep 14 | LAB 1|
|---------------------------------|
*/


public class HelloProgram {

    public void Hello(){
        /*
        * Simple program that print hello to the user.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello " + name);
        scan.close();

    }
}
