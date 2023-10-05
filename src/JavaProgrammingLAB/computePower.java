package JavaProgrammingLAB;
import java.util.Scanner;


/*
|----------------------------------|
|DATE: week 7 | 2023 oct 5 | LAB 4 |
|----------------------------------|
*/

/*
* 1.First question:
* Create a Java method to compute the power of an integer number and print it to the screen.
* The integer number and the power are received as parameter. Call this method from main().
* The header of the method is as follows:
* public static void Compute Power (int x, int y)
* */



public class computePower {
    public void start (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base");
        int base = scan.nextInt();
        System.out.println("Enter the exponent");
        int exponent = scan.nextInt();
        scan.close();
        computePower comp = new computePower();
        comp.pow(base,exponent);
    }
    public void pow(int x, int y){
        /*
        * x = base
        * y = exponent
        */
        long result = 1;

        for(int i = 0; i < y; i++)
            result *= x;

        System.out.println(x + "^" + y + " = " + result);
    }
}