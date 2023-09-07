package week_02.live_class;
import java.util.Scanner;

public class ConditionalExpressions {

    public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            System.out.println("Please enter the amount.");

            int x = input.nextInt();
            String dollars = (x<=1)?"dollar":"dollars";
            System.out.println(x+dollars);

            System.out.println("Please enter the time in minutes");
            int y =input.nextInt();
            String minutes= (y<=1)?"minute":"minutes";
            System.out.println(y+minutes);

            System.out.println(y+((y<=1)?"minute":"minute"));
        }
    }

