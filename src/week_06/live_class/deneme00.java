package week_06.live_class;

public class deneme00 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print((int) (Math.random() * (100-10) + 10) + " "); //10~99
            if (i % 20 == 0) {
                System.out.println();
            }

        }
    }
}

