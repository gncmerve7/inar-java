package week_06.live_class;

public class Practice_002 {

public static int f(int n) {
   System.out.println("value of n: " + n);
   if (n <1) {
        return 1;
    }
   int result=f(n-1)+1;
    System.out.println("result: "+result);

    return result;}


public static void main(String[] args) {
f(5);
    System.out.println("===================");
    System.out.println(f(3));
    }
}
