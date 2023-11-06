package week_08.live_class;

public class Reverse {

    public static void main(String[] args) {

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("====================================");


        for (int i = arr2.length - 1; i >= 0; i--) {
            for (int each : arr2[i]) {
                System.out.print(each + " ");
            }
            System.out.println();
        }

        System.out.println("====================================");
/*
                3 2 1
            	8 7 6 5 4
            	13 12 11 10 9
 */
        for (int[] each1DArray : arr2) {

            for (int i = each1DArray.length - 1; i >= 0; i--) {
                System.out.print(each1DArray[i] + " ");
            }
            System.out.println();
        }
    }
}
