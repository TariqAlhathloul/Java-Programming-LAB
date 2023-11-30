package JavaProgrammingLAB.LAB9;
import java.util.Scanner;
/*
|----------------------------------|
|DATE: week 13 | 2023 Nov30 | LAB 9|
|----------------------------------|
*/

public class Palindrome {
    Scanner scan = new Scanner(System.in);
    public void checkPalindrome() {
        System.out.println("Please Enter A String: ");
        String original = scan.next();
        String reverse = reverseString(original);
        if(original.equals(reverse)) {
            System.out.println("Entered string is a palindrome");
        }else {
            System.out.println("Entered string isn't a palindrome");
        }
    }
      String reverseString(String str) {
        StringBuilder reversedStr = new StringBuilder(str);
        reversedStr.reverse();
        System.out.println(reversedStr);
        return reversedStr.toString();
    }
    public static void main(String[] args) {
        Palindrome check = new Palindrome();
        check.checkPalindrome();
    }
}