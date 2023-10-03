package JavaProgrammingLAB;
import java.util.Scanner;
/*
 * PROJECT TITLE: Introduction to Java applications.
 *PURPOSE OF PROJECT: Practice Java programming language.
 *VERSION or DATE: week 6, 09/28/23
 *HOW TO START THIS PROJECT:visit the following websites https://www.bluej.org/ or any IDE you Desire.
 */


/*
* Write a java program that asks the user to enter his\her grade.
* The grade must be between 0 and 100, and then print if the user succeed or fail.
*  To succeed the grade must be greater than 60.
*/
public class PassOrFail {
    Scanner scanGrade = new Scanner(System.in);
    public void checkPassOrFail(){
        int grade=0;
        System.out.println("Please Enter Your Grade");
        grade = scanGrade.nextInt();
        scanGrade.close();
        if(grade >=0 && grade <=100) {

            if (grade > 60) {
                System.out.println("Pass, Congratulations You Passed The Course");
            } else {
                System.out.println("Fail, You have the potential to succeed in the future");
            }

        }else{
            System.out.println("Please ReEnter Your Grade.\n\"grade must be between 0 and 100\"");
        }
    }
}
