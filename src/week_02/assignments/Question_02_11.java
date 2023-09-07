package week_02.assignments;

import java.util.Scanner;

public class Question_02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double CurrentPopulation = 312032486;
        double birthNumberDaily = (365 * 24 * 60 * 60) / 7;
        double deathNumberDaily = (365 * 24 * 60 * 60) / 13;
        double immigrantNumberDaily = (365 * 24 * 60 * 60) / 45;
        System.out.print("Enter the number of years: ");
        double year = input.nextInt();
        double NewPopulation = CurrentPopulation + (year * (birthNumberDaily - deathNumberDaily + immigrantNumberDaily));

        System.out.println("The population in" + year + "years is:" + NewPopulation);
    }
}
