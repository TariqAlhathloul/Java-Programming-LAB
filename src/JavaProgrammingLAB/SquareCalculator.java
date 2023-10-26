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
public class SquareCalculator {
    public int getSquare (int x) {
        int square = x * x;
        System.out.printf("The Square of %d  is: %d %n", x, square);
        return square;
    }
}
