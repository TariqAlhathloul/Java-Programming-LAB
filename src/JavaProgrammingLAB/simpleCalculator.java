package JavaProgrammingLAB;
import java.util.Scanner;


/*
|---------------------------------|
|DATE: week 6, 2023 sep 28 | LAB 3|
|---------------------------------|
*/

/*
*5. Fifth question:
*  Write a java program that act as a simple calculator using the switch statement.
*  +,-,*,/
*
* */
public class simpleCalculator {
        public double add(double a, double b) {
            return a + b;
        }

        public double subtract(double a, double b) {
            return a - b;
        }

        public double multiply(double a, double b) {
            return a * b;
        }

        public double divide(double a, double b) {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
        }
        public void calculator() {
            double firstNumber,secondNumber, result=0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter First Number:");
            firstNumber = scanner.nextDouble();
            System.out.println("Enter The Operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);
            System.out.println("Enter Second Number");
            secondNumber = scanner.nextDouble();
            scanner.close();
            switch (operation){
                case '+':
                    result = add(firstNumber, secondNumber);
                    break;
                case '-':
                    result = subtract(firstNumber, secondNumber);
                    break;
                case '*':
                    result =  multiply(firstNumber, secondNumber);
                    break;
                case '/':
                    result = divide(firstNumber, secondNumber);
                default:
                    System.out.println("Choose an operator +, -, *, /.");
                    break;
            }
            System.out.printf("%.2f %c %.2f = %.2f",firstNumber,operation,secondNumber,result);
        }
}
