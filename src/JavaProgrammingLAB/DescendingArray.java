package JavaProgrammingLAB;

/*
|----------------------------------|
|DATE: week 9 | 2023 oct 26 | LAB 6|
|----------------------------------|
*/

/*
* 6.Sixth question
* Write a java program that:
* Create an array of 20 integers.
* Initialize the first element with 20, the second element with 19…the last element with 1.
* Print the content of each array.
* Change the value of the first element to 3 (1*3),
* the second element to 6 (2*3)… the last element to 60 (20*3).
* Print the content of the array.
*/
public class DescendingArray {
    public void descendingArray() {

        int arrLength = 20;
        int[] array = new int[arrLength];
        System.out.print("{");
        for(int i = 0; i < array.length; i++)
        {
            array[i] = arrLength;
            System.out.print(array[i] + ", ");
            arrLength--;
        }
        System.out.print("}\n{");
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (i+1)*3;
            System.out.print(array[i] + ", ");
        }
        System.out.println("}");
    }
}
