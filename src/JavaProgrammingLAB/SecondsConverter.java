package JavaProgrammingLAB;
import java.util.Scanner;

public class SecondsConverter {

    private double hours, minutes, seconds;
    private int dir = 0;
    SecondsConverter(){
        hours = 1;
        minutes = 1;
        seconds = 1;
        dir = 0;
    }
    Scanner scan = new Scanner(System.in);
    public void InputSeconds(double num){
        double h = num / 60 / 60;
        double m = num / 60;
        System.out.printf("%.3fs =  %.3fm\n", num, m);
        System.out.printf("%.3fs = %.3fh\n", num,h);
    }
    public void InputMinutes(double num){
        double s = num * 60;
        double h = num / 60;

        System.out.printf("%.3fm =  %.3fs\n", num, s);
        System.out.printf("%.3fm = %.3fh\n", num,h);
    }
    public void InputHours(double num){
        double s = num * 3600;
        double m = num * 60;

        System.out.printf("%.3fh =  %.3fm\n", num, m);
        System.out.printf("%.3fh = %.3fs\n", num,s);
    }

    public void takeInput() {
        while(true){
        System.out.println("Choose from the list");
        System.out.print("1-number of seconds\n" + "2-number of minutes\n" + "3-number of hours\n");
        dir = scan.nextInt();
        switch (dir) {
            case 1:
                System.out.println("Enter the amount of Seconds");
                seconds = scan.nextDouble();
                InputSeconds(seconds);
                break;
            case 2:
                System.out.println("Enter the amount of Minutes ");
                minutes = scan.nextDouble();
                InputMinutes(minutes);
                break;
            case 3:
                System.out.println("Enter the amount of Hours");
                hours = scan.nextDouble();
                InputHours(hours);
                break;
            default:
                System.out.println("Error out of range!");
                break;
        }
        }
    }
}