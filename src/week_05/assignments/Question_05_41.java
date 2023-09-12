package week_05.assignments;

import java.util.Scanner;

public class Question_05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numMax = 0;
        int numMin = 0;
         int num=1;
         int count=0;
        System.out.print("Enter integers (it ends with input of 0) : ");
        while(num!=0){
            num = input.nextInt();
            count++;
            {
                if (num < numMax) {
                    numMin = num;

                } if (num > numMax)
                    numMax = num;

            }
        }
        System.out.println("The largest count is "+ numMax+" and the occurrence of the count is ");
//occurrencecount!
    }
}