package week_13;

public class math {
    public static void main(String[] args) {


        int num = 2, power = 66;

        long result = 1;

        while (power != 0) {
            result *= num;
            --power;
        }

        System.out.println("answer: " + result);
    }

}
