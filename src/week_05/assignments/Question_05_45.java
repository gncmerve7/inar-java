package week_05.assignments;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double deviation = 0;
        double deviationn = 0;
        int sumOfnum = 0;
        int countOfnum = 0;
        double mean = 0;
        System.out.print("Enter ten numbers: ");
        do {
            int num = input.nextInt();
            countOfnum++;
            sumOfnum += num;
            mean = sumOfnum / countOfnum;
            deviation += (Math.pow(num - mean, 2));
            deviationn = Math.sqrt(deviation / (countOfnum - 1));
        } while (countOfnum <= 10);


        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + deviationn);
    }
}