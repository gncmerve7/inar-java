package week_06.live_class;

public class Practice_003 {

    public static void main(String[] args) {
        callTheNumberSelf(20);
        System.out.println(factorialRecursive(5));
    }


    public static void callTheNumberSelf(int n) {     //  recursive
        if (n < 1) {
            return;
        }
        System.out.print(" " + n);
        n = n - 1;
        if (n % 10 == 0)
            System.out.println(" ");
        callTheNumberSelf(n);
    }

    public static int factorialRecursive(int n) {
        if (n < 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

}


