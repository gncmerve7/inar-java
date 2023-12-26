package week_12.assignments;

import java.util.ArrayList;

public class Question_12_10 {
    public static void main(String[] args) {
        try {
            int size = Integer.MAX_VALUE;
            ArrayList<Integer> num = new ArrayList<>(size);

            for (int i = 1; i > 0; i++) {
                num.add(i);
            }
            System.out.println(num.get(num.size() - 1));
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryException occurs! : Java heap space");
        }
    }
}