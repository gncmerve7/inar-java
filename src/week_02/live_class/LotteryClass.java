package week_02.live_class;

import java.util.Scanner;

public class LotteryClass {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lotteryNumber = (int) (Math.random() * 100);
        System.out.println("Enter two digit number.");
        int number = input.nextInt();
        int firstDigit = number/10;
        int secondDigit= number%10;
        int lotteryDigit1=lotteryNumber/10;
        int lotteryDigit2=lotteryNumber%10;
        System.out.println("Lottery number is: " + lotteryNumber);
        if (firstDigit==lotteryNumber/10 && secondDigit == lotteryNumber%10){
            System.out.println("You won $10.000");}
        else if(firstDigit==lotteryDigit1 || firstDigit==lotteryDigit2||secondDigit==lotteryDigit2||secondDigit==lotteryDigit1){
            System.out.println("You won $5.000");}
        else if (firstDigit==lotteryDigit1 ^ secondDigit == lotteryDigit2) { //yukaridaki esitligin kisa yolu
            System.out.println("You won $3.000");}
        else
            System.out.println("Sorry! no match! You lost");
    }
}
