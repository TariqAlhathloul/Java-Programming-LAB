package JavaProgrammingLAB;
import java.util.Scanner;

/*
|----------------------------------|
|DATE: week 9 | 2023 oct 26 | LAB 6|
|----------------------------------|
*/

/*
*5.	Fifth question:
* Write java program that:
* Ask the user to give a number between 2 and 5.
* Create an array of int. The length of the array is equal to the given number.
* Ask the user to fill the array element by element.
* Ask the user to enter a position then print the array content of this position.
* If the user enters a wrong number, then an exception occurs
*/
public class ArrayElementAccess {

    Scanner scan = new Scanner(System.in);
    public void Main() {
        int arrSize, index=0;
        do{
            System.out.println("Please Enter The Length Of The Array \" Must Be Between 2 and 5\"");
            arrSize = scan.nextInt();
        }while(arrSize < 2 || arrSize > 5);

        int[] arr = new int[arrSize+1];
        for(int i = 0; i < arr.length; i++){
                System.out.print("Enter The Value For Element [" + i + "] = ");
                arr[i] = scan.nextInt();
                System.out.println();
        }

        for(int i = 0; i < arr.length; i++)
            System.out.println( "[" + i + "] = " + arr[i]);

        do{
            try {
                System.out.print("Choose An Index To Print Its Value: ");
                index = scan.nextInt();
                System.out.println(arr[index]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("The Index Must Be Between 0 and " + (index-1));
                System.out.print(e.getMessage());
            }
       }while(index < 2 || index >5);

        scan.close();
    }
}
