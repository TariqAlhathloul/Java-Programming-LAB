package JavaProgrammingLAB.LAB2;
import java.util.Scanner;

/*
|----------------------------------|
|DATE: week 4 | 2023 sep 28 | LAB 2|
|----------------------------------|
*/


/*
* simple Java program that prints the multiplication table for a given number.
*/

class multiplication {
    Scanner scan = new Scanner(System.in);
    private int number, result;
    multiplication() {
        number = 1;//The number for which you want to print the multiplication table.
        result = 0;// the result of the multiplication.
    }
    public void mul() {
        System.out.println("Input a number: ");
        number = scan.nextInt();
        System.out.printf("the multiplication table of %d\n", number);

        for (int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.printf("%d * %d = %d\n", i, number, result);
            System.out.println();
        }
        scan.close();

    }

}
