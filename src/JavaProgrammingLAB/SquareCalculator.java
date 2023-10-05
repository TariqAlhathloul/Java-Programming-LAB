package JavaProgrammingLAB;


/*
|----------------------------------|
|DATE: week 7 | 2023 oct 5 | LAB 4 |
|----------------------------------|
*/

/*
*
* 5.Fifth question:
* Create a java method which will take an integer and return the square of that integer.
* Call this method from main(). The header of the method is as follows:
* public int getSquare (int x).
* */

import java.util.Scanner;
public class SquareCalculator {
    
    public int getSquare(int x){
        int result=x*x;
        return result;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        SquareCalculator obj=new SquareCalculator();
        System.out.print("Enter a number: ");
        int x=in.nextInt();
        int result=obj.getSquare(x);
        System.out.print(x+" squared is "+result);
    }
}
