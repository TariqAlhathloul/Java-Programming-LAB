package JavaProgrammingLAB;

/*
|---------------------------------|
|DATE: week 7, 2023 oct 5 | LAB 5 |
|---------------------------------|
*/

/*
* 3.Third question:
*Create a Java method that return True if the number passed as a parameter is positive
*or False if the number passed as parameter is negative.
*Call this method from main().
*The header of the method is as follows:
*public static boolean isPositive (int x)
* */
public class IsPositive {

    public static boolean isPositive(int x){
        boolean result = x >= 0 ? true : false;
        return result;
    }
}
