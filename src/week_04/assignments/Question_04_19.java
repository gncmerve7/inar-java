package week_04.assignments;

import java.util.Scanner;

public class Question_04_19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first digit of ISBN: ");
        String isbn=input.nextLine();


        int d1=Integer.valueOf(isbn.substring(0,1));
        int d2=Integer.valueOf(isbn.substring(1,2));
        int d3=Integer.valueOf(isbn.substring(2,3));
        int d4=Integer.valueOf(isbn.substring(3,4));
        int d5=Integer.valueOf(isbn.substring(4,5));
        int d6=Integer.valueOf(isbn.substring(5,6));
        int d7=Integer.valueOf(isbn.substring(6,7));
        int d8=Integer.valueOf(isbn.substring(7,8));
        int d9=Integer.valueOf(isbn.substring(8));

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5
                + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        System.out.println("The ISBN-10 number is " +isbn+ d10);


    }
}
