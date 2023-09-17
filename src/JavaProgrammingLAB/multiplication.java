package JavaProgrammingLAB;
import java.util.*;

/*
* simple Java program that prints the multiplication table for a given number.
*/
class multiplication {
    private int number, result;
    multiplication() {
        number = 1;//The number for which you want to print the multiplication table.
        result = 0;// the result of the multiplication.
    }
    public void mul() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number: ");
        number = scan.nextInt();
        System.out.printf("the multiplication table of %d\n", number);

        for (int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.printf("%d * %d = %d\n", i, number, result);
            System.out.println();
        }

    }

}
