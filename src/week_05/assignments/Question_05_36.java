package week_05.assignments;

import java.util.Scanner;

public class Question_05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first digit of ISBN: ");
        String isbn = input.nextLine();
        /*  Question_04_19
        int d1=Integer.valueOf(isbn.substring(0,1));
        int d2=Integer.valueOf(isbn.substring(1,2));
        int d3=Integer.valueOf(isbn.substring(2,3));
        int d4=Integer.valueOf(isbn.substring(3,4));
        int d5=Integer.valueOf(isbn.substring(4,5));
        int d6=Integer.valueOf(isbn.substring(5,6));
        int d7=Integer.valueOf(isbn.substring(6,7));
        int d8=Integer.valueOf(isbn.substring(7,8));
        int d9=Integer.valueOf(isbn.substring(8));*/

int count=0;
int d10=0;
        for (int i = 0; i <= 8; i++) {
            int d = Integer.valueOf(isbn.substring(i, i + 1));

 d10+=(d*(i+1));}
        if((d10%11)==10)
            System.out.println(isbn+"X");
        else
            System.out.println(isbn+(d10%11));
    }
}