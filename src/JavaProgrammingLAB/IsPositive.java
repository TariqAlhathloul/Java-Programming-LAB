package JavaProgrammingLAB;

/*
|----------------------------------|
|DATE: week 7 | 2023 oct 5 | LAB 4 |
|----------------------------------|
*/

/*
* 3.Third question:
* Create a Java method that return True if the number passed as a parameter is positive
* or False if the number passed as parameter is negative.
* Call this method from main().
* The header of the method is as follows:
* public static boolean isPositive (int x)
* */

import java.util.Scanner;
public class IsPositive {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x=in.nextInt();
        if(isPositive(x)==true)
            System.out.print("The number is positive");
        else
            System.out.print("The number is negative");
    }
    
    public static boolean isPositive(int x){
        if(x>0)
            return true;
        else
            return false;
    }
}
