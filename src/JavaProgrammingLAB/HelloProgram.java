package JavaProgrammingLAB;
import java.util.Scanner;
public class HelloProgram {
    public void Hello(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello " + name);

    }
}
