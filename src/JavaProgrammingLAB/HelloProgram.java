package JavaProgrammingLAB;
import java.util.Scanner;
public class HelloProgram {
    /*
    * PROJECT TITLE: Introduction to Java applications.
    *PURPOSE OF PROJECT: Practice Java programming language.
    *VERSION or DATE: week 4, 09/14/23
    *HOW TO START THIS PROJECT:visit the following websites https://www.bluej.org/ or any IDE you Desire.
    */

    public void Hello(){
        /*
        * Simple program that print hello to the user.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello " + name);

    }
}
