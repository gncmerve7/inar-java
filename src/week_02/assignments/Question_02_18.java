package week_02.assignments;

import java.util.Scanner;

public class Question_02_18 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = 1;
        int b = 2;
        System.out.println("a         b        pow(a,b) ");

        System.out.println(a + "         " + b + "        " + Math.pow((int) a, (int) b));
        System.out.println(++a + "         " + (++b) + "        " + Math.pow(a, b));
        System.out.println(++a + "         " + (++b) + "        " + Math.pow(a, b));
        System.out.println(++a + "         " + (++b) + "        " + Math.pow(a, b));
        System.out.println(++a + "         " + (++b) + "        " + Math.pow(a, b));


    }

}
