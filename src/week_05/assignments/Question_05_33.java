package week_05.assignments;

public class Question_05_33 {
    public static void main(String[] args) {
        System.out.println("The perfect numbers are:");

        int perfect=1;
        while (perfect<=10000)
        {
            int sum = 0;
            for (int divisor = 1 ; divisor < perfect ; divisor++) {
                if(perfect %divisor == 0)
                    sum += divisor;
            }

            if (sum == perfect)
                System.out.println(perfect);
            perfect++;
        }}}