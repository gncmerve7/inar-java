package week_08.assignments;

public class Question_08_07 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3},
                {-1, -1, -1},
                {4, 1, 1},
                {2, 0.5, 9},
                {3.5, 2, -1},
                {3, 1.5, 3},
                {-1.5, 4, 2},
                {5.5, 4, -0.5}};
        formula(points);
    }


    public static double formula(double[][] arr) {
        //Math.pow(Math.pow((arr[1][0] - arr[0][0]), 2) + Math.pow((arr[1][1] - arr[0][1]), 2) + Math.pow((arr[1][2] - arr[0][2]), 2), 0.5);
        double minDistance = Math.pow(Math.pow((arr[1][0] - arr[0][0]), 2) + Math.pow((arr[1][1] - arr[0][1]), 2) + Math.pow((arr[1][2] - arr[0][2]), 2), 0.5);
        double distance = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                distance = Math.pow(Math.pow((arr[j][0] - arr[i][0]), 2) + Math.pow((arr[j][1] - arr[i][1]), 2) + Math.pow((arr[j][2] - arr[i][2]), 2), 0.5);
                if (distance < minDistance) {
                    minDistance = distance;
                }
                System.out.println("The closest two points are (" + arr[i][0] + "," + arr[i][1] + "," + arr[i][2] + ") and (" + arr[j][0] + "," + arr[j][1] + "," + arr[j][2] + ")");

                System.out.println(" The distance is: " + distance);
                System.out.println(" The closest is: " + minDistance);
            }
        }
        return minDistance;

    }

}
