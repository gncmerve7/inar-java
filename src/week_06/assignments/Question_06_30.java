package week_06.assignments;

public class Question_06_30 {

    public static void main(String[] args) {

        int dice1 = (int) (Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);
        int sum1 = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum1);

        if (sum1 == isCraps(dice1, dice2)) ;
        if (sum1 == isNatural(dice1, dice2)) ;


        if (sum1 == otherValue(dice1, dice2)) {

            dice1 = (int) (Math.random() * 6 + 1);
            dice2 = (int) (Math.random() * 6 + 1);
            int sum2 = dice1 + dice2;
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum2);

            if (dice1 + dice2 == 7) {
                System.out.println("You lose");
            } else if (dice1 + dice2 == sum1) {
                System.out.println("You win");
            } else {
                dice1 = (int) (Math.random() * 6 + 1);
                dice2 = (int) (Math.random() * 6 + 1);
                int sum3 = dice1 + dice2;
                if (dice1 + dice2 == 7) {
                    System.out.println("You lose");
                } else if (dice1 + dice2 == sum3) {
                    System.out.println("You win");
                } else
                    System.out.println("You lose");
            }
        }
    }

    public static int isNatural(int d1, int d2) {
        int sum = d1 + d2;
        switch (sum) {
            case 7:
                System.out.println("You win");
                break;
            case 11:
                System.out.println("You win");
                break;
            default:
        }
        return sum;
    }

    public static int isCraps(int d1, int d2) {
        int sum = d1 + d2;
        switch (sum) {
            case 2:
                System.out.println("You lose");
                break;
            case 3:
                System.out.println("You lose");
                break;
            case 12:
                System.out.println("You lose");
                break;
            default:
        }
        return sum;
    }

    public static int otherValue(int d1, int d2) {
        int sum = d1 + d2;
        switch (sum) {
            case 4:
                System.out.println("Point is " + sum);
                break;
            case 5:
                System.out.println("Point is " + sum);
                break;
            case 6:
                System.out.println("Point is " + sum);
                break;
            case 8:
                System.out.println("Point is " + sum);
                break;
            case 9:
                System.out.println("Point is " + sum);
                break;
            case 10:
                System.out.println("Point is " + sum);
                break;
            default:
        }
        return sum;
    }


}
