package week_12.live_class;

class DivisionExceptions extends Exception {
    public void printStackTrace() {
        System.out.println("it can't be divise by zero");
    }
}
class InvalidInputExceptions extends Exception{
    public void printStackTrace(){
        System.out.println("Invalid input");
    }
}
public class Exceptions00 {
    public static void main(String[] args) {


        try {
            int x[] = {1, 2, 3};
            System.out.println(x[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("the index out of bounds for length ");
        }

        try {
            int a = 0;
            int b = 20 / a;
            System.out.println(b);

        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }

        System.out.println("it still works");
    }
}
