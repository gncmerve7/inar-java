package week_08.live_class;

public class MaxMinForEach {

        public static void main(String[] args) {

            int[][] arr2 = {{1, 2, 3, 4}, {5, 600}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15, 16, 17}};
            int max = arr2[0][0];
            int min = arr2[0][0];

            for (int[] eachArr1 : arr2) {
                for (int eachElement : eachArr1) {
                    if (eachElement > max)
                        max = eachElement;
                    if (eachElement < min)
                        min = eachElement;
                }
            }
            System.out.println("min = " + min);
            System.out.println("max = " + max);
    }
}
