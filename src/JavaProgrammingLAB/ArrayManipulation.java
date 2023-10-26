package JavaProgrammingLAB;

import java.util.Scanner;
import java.util.random.RandomGenerator;

/*
|----------------------------------|
|DATE: week 9 | 2023 oct 26 | LAB 6|
|----------------------------------|
*/

/*
* 4.Fourth question:
* Write java program that:
* Ask the user to give a positive number between 10 and 20.
* Create an array of integer. The length of the array is the given number by the user.
* Print the content of the array
* Fill the array with numbers from 0 to the given number -1.
* Print the content of the array
* Fill the array with positive random numbers less than 200.
* Print the content of the array.
* Find and print :
* The odd numbers, the maximum and the minimum numbers.
* The sum and the average.
*/

public class ArrayManipulation {
    Scanner scan = new Scanner(System.in);
    public void arrayManipulation() {
        int arrSize, random;
        do {
            System.out.println("Enter The Array Length \"Must Be Between 10 and 20\" ");
            arrSize = scan.nextInt();
        } while (arrSize < 10 || arrSize > 20);
        scan.close();

        int[] orderedArray = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            orderedArray[i] = i;
        }
        printArray(orderedArray);

        int[] randomArr = new int[arrSize];
        for(int i = 0; i < arrSize; i++) { // generate random values in the array less than 200
            random = RandomGenerator.getDefault().nextInt(200)+1;
            randomArr[i] = random;
        }
        printArray(randomArr);

        int max = randomArr[0], min = randomArr[0], sum = 0;

        for(int i = 0; i < randomArr.length; i++) {
            if(randomArr[i] > max){ // find the max value in the array
                max = randomArr[i];
            }
            if(randomArr[i] < min){ // find the min value in the array
                min = randomArr[i];
            }
            sum += randomArr[i]; // sum of all the elements in the array
        }
        System.out.println("Max = " + max + "\nMin = " + min + "\nSum = " + sum);
        double average = sum / randomArr.length;
        System.out.println("Average Of The Array: " + average);

        System.out.print("Odds Values In The Array ");
        for(int j : randomArr)
            if(j % 2 != 0)
                System.out.print(j + ", ");
    }
    public void printArray(int[] arr) {

        System.out.print("Array = {");
        for (int index : arr) {
            System.out.print(index + ",");
        }
        System.out.println("}");
    }
}
