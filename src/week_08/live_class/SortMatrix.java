package week_08.live_class;

public class SortMatrix {
    public static void main(String[] args) {
        double[][] matrix = {{3,4},{5,7},{2,1},{8,9},{10,5}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                for (int k = i; k < matrix.length; k++) {
                    for (int l = j + 1; l < matrix[k].length; l++) {
                        if (matrix[i][j] > matrix[k][l]) {
                            double temp = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = temp;
                        }

                    }

                }
            }
        }
        display(matrix);
    }
    public static void display(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
