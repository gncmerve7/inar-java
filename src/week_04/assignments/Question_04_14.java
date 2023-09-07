package week_04.assignments;

import java.util.Scanner;

public class Question_04_14 { public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a letter grade: ");
    String gradeT=input.nextLine();
    char grade= gradeT.charAt(0);

    switch(Character.toUpperCase(grade)){

        case'A':System.out.println("Your numeric value for grade "+grade+" is 4");break;
        case'B': System.out.println("Your numeric value for grade "+grade+" is 3");break;
        case'C': System.out.println("Your numeric value for grade "+grade+" is 2");break;
        case'D': System.out.println("Your numeric value for grade "+grade+" is 1");break;
        case'F': System.out.println("Your numeric value for grade "+grade+" is 0");break;
        default:
            System.out.println(grade+" is an invalid grade.");

    }
}
}
