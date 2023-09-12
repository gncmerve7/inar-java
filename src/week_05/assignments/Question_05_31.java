package week_05.assignments;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double initial=input.nextDouble();
        System.out.print("Enter annual percentange yield: ");
        double annual=input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int period=input.nextInt();
        System.out.println("Month "+" \tCD Value");

        for(int month=1;month<=period;month++){

    double cd=initial+((initial*annual)/(1200));
    initial=cd;
    System.out.println(month+"\t\t "+cd);

}

    }
}
