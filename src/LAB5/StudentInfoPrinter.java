package JavaProgrammingLAB.LAB5;
import java.util.Scanner;


/*
|----------------------------------|
|DATE: week 7 | 2023 oct 5 | LAB 5 |
|----------------------------------|
*/


/*
* 4.Fourth question:
* Create a Java method that print to the screen the student last, first name and age.
* For example, the Printout should be as (Mohmmed, Abudllah is 32 year(s) old).
* Student Last name, first name and born year is passed as a parameter. Call this method from main().
* The header of the method is as follows:
* public static void StudentAge (string Lname, string Fname, int year)
* */

public class StudentInfoPrinter {

    Scanner studentInfo = new Scanner(System.in);
    public void getStudentINFO () {
        /*get the student first, last name and born year then sent it back to the print function.*/
        System.out.println("Enter Your First Name: ");
        String FName = studentInfo.nextLine();
        System.out.println("Enter Your  Last Name: ");
        String LName = studentInfo.nextLine();
        System.out.println("Enter Your  Born Year: ");
        int BYear = studentInfo.nextInt();

        int currentYear = java.time.Year.now().getValue(); // get the cur year
        int age = currentYear - BYear; // sub the cur year from born year
        printStudentInfo(LName,FName,age); // now send the information
    }
    public static void printStudentInfo(String lastName, String firstName, int age) {

        System.out.println(lastName + ", " + firstName + " is " + age + " year(s) old.");
    }
}
