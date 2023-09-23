package week_06.assignments;

public class Question_06_30 {
    public static void main(String[] args) {

    int dice1 = (int) (Math.random() * 6 + 1);
    int dice2 = (int) (Math.random() * 6 + 1);
    int sum = dice1 + dice2;

game( dice1, dice2);
if (isNatural(sum)) {
            return;
        }
        if (isCraps(sum)) {
            return;
        }
        if(otherValue(sum)){
            return;
        }
    }

    public static int game(int dice1,int dice2) {
        int sum = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
        return sum;
    }

    public static boolean isNatural(int sum){
switch (sum){
    case 7:  System.out.println("You win");break;
    case 11: System.out.println("You win");break;
    default:
} return isCraps(sum);
    }
    public static boolean isCraps(int num){
        switch (num){
        case 2:   System.out.println("You lose");break;
        case 3:    System.out.println("You lose");break;
        case 12:   System.out.println("You lose");break;
        default:
    }return false;
}
public static boolean otherValue(int sum){
        switch (sum){
            case 4:   System.out.println("Point is "+sum);break;
            case 5:    System.out.println("Point is "+sum);break;
            case 6:   System.out.println("Point is "+sum);break;
            case 8:   System.out.println("Point is "+sum);break;
            case 9:   System.out.println("Point is "+sum);break;
            case 10:   System.out.println("Point is "+sum);break;
            default:
        }return true;
    }
}