package JavaProgrammingLAB;
import java.util.Scanner;


/*
|----------------------------------|
|DATE: week 4 | 2023 sep 14 | LAB 1|
|----------------------------------|
*/

/*
* Simple program that print hello followed by the name to the user.
*/
public class HelloProgram {

    public void Hello(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello " + name);
        scan.close();

    }
}
