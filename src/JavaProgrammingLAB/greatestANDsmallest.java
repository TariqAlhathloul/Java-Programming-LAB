package JavaProgrammingLAB;
import java.util.Scanner;

/*
|---------------------------------|
|DATE: week 6, 2023 sep 28 | LAB 3|
|---------------------------------|
*/



//Take three numbers from the user and print the greatest number and the smaller number

public class greatestANDsmallest {
    public void greatestAndSmallest() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers followed by \"Enter\" ");
        int num1=scan.nextInt(), num2=scan.nextInt(), num3=scan.nextInt();
        int arr[] = {num1,num2,num3};
        int greates = num1, smallest = num2;

        for (int j : arr) { // loop through all the numbers
            if (j > greates)
                greates = j;
            else if (j < smallest)
                smallest = j;
        }
        System.out.println(greates + " is the greatest number");
        System.out.println(smallest + " is the smallest number");
        scan.close();
    }
}
