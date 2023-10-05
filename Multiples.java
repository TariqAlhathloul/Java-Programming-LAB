package JavaProgrammingLAB;
import java.util.Scanner;


/*
|----------------------------------|
|DATE: week 6 | 2023 sep 28 | LAB 3|
|----------------------------------|
*/

/*
* 4.Fourth question:
* Write a java program that asks the user to enter a number between 50 and 100
* then print all the multiple of 5 from zero to the given number.
* */
public class Multiples {
    Scanner scan = new Scanner(System.in);
    public void MultiplesOfNumber() {
        int number,result = 0, i=1;
        System.out.println("Enter A Positive Number Between 50-100.");
        number = scan.nextInt();

        if(number >=50 && number <=100) {
            while (result < number) {
                result += 5;
                System.out.print(result + ", ");
                ++i;
            }
        }else{
            System.out.println("Wrong Number, Enter The Number Again.");
            System.out.println("\"The Given Number Must Be Between 50-100\".");
        }

    }

}
