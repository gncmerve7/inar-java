package week_05.live_class;

public class PatternA_18 {
    public static void main(String[] args) {
        // Pattern A
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
