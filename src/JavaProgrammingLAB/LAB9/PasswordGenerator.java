package JavaProgrammingLAB.LAB9;
import java.util.Scanner;
/*
|----------------------------------|
|DATE: week 13 | 2023 Nov30 | LAB 9|
|----------------------------------|
*/

/*
-The second letter will be the length of the first name. If the length is greater than 9 then only the ones digit will be considered.
-The fifth letter will be the reminder of the division of the age by 9.
*/
public class PasswordGenerator {
     private String firstName;
     private String lastName;
     private String passWord;
    Scanner scan = new Scanner(System.in);

    public void passwordGenerator() {
        System.out.println("Please Enter Your First Name: ");
        firstName = scan.next();

         System.out.println("Please Enter Your Last Name: ");
         lastName = scan.next();

         System.out.println("Please Enter Your Age : ");
         double age = scan.nextDouble();

         generatePassword(firstName, lastName, age);
         System.out.println("Please Enter Your PassWord: ");
         String enteredPassword = scan.next();
         scan.close();
         checkPassWord(enteredPassword);
    }
    private  boolean checkPassWord(String enteredPassword) {
        if(enteredPassword.equals(passWord)) {
            System.out.println("Welcome Mr."+  firstName +" "+lastName+". Your password is correct");
        }else {
            System.out.println("Wrong Welcome Mr."+  firstName +" "+lastName+". The correct password is " + passWord);
        }
        return enteredPassword.equals(passWord);
    }
    private String generatePassword(String firstName, String lastName, double age) {
         char first = firstName.charAt(0);
         int second = firstName.length();
         char third = lastName.charAt(lastName.length()-1);
         int fourth = lastName.length();
         double fifth = age % 9;
         passWord = ("" + first + second + third + fourth + fifth).toLowerCase();
         System.out.println(passWord);
         return passWord;
    }

    public static void main(String[] args) {
        PasswordGenerator generate = new PasswordGenerator();
        generate.passwordGenerator();
    }
}
