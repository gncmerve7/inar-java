package week_06.live_class;

public class Practice_001 {
    public static int sum(int a, int b) {
        System.out.println(a + b);
        return (a + b);
    }

    public static String sum(String a, String b) {
        System.out.println((a + " " + b));
        return (a + " " + b);
    }

    public static void score(String name, int score) {
        System.out.println("Name:" + name + " Score:" + score);
    }

    public static void nelly(int a) {
        System.out.println(a);
    }

    public static int abigail(int d) {
        return d;
    }

    public static int kate(int b) {//recursive
        System.out.println(b);
        if (b == 1) {
            return 1;
        }
        return kate(b - 1);

    }

    public static void main(String[] args) {
        sum("hello", "world");
        sum(3, 5);
        score("Ryan", 5);
        nelly(10);
        kate(10);
        System.out.println(abigail(10));
    }
}
