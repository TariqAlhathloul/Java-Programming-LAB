package JavaProgrammingLAB;


/*
|----------------------------------|
|DATE: week 9 | 2023 oct 26 | LAB 6|
|----------------------------------|
*/

/*
* 1.First question:
* Write a java program that:
* Create an array of 10 integers.
* Create an array of 5 Boolean.
* Create an array of 3 String.
* Print the content of each array.
*/

/*
* 2.Second question
* Write a java program that:
* Create an array of 10 integers.
* Print the content of the array.
* Change the value of the first element to 11.
* Change the value of the last element to 1.
* Print the content of the array.
*/

/*
* 3.Third question
*  Write a java program that:
*	Create an array of 3 String.
*	Initialize the first element with your firs name.
*	Initialize the second element with your last name.
*	Initialize the third element with your father name.
*	Print the content of the array using enhanced for loop.
*/


public class arrays {
    public void array() {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean[] boolArray = new boolean[]{true, false, true, true, false};
        String[] stringArray = new String[]{"First name", "Last Name", "Father Name"};
        printArray(intArray);
        printArray(boolArray);
        printArray(stringArray);
        intArray[0] = 11;
        intArray[9] = 1;
        printArray(intArray);
    }
    public void printArray(int[] arr) {

        System.out.print("int array = {");
        for (int index : arr) {
            System.out.print(index + ",");
        }
        System.out.println("}");
    }
    public void printArray(String[] arr) {

        System.out.print("String array = {");
        for (String index: arr) {
            System.out.print(index + ",");
        }
        System.out.println("}");
    }
    public void printArray(boolean[] arr) {

        System.out.print("boolean array = {");
        for (boolean index: arr) {
            System.out.print(index + ",");
        }
        System.out.println("}");
    }
}