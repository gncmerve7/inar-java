package week_06.assignments;

public class Question_06_09 {
    public static void main(String[] args) {
        System.out.printf("%-7s %17s %17s  %17s %16s\n", "Feet", "Meters", "|", "Meters", "Feet");
        System.out.println("-----------------------------------------------------------------------------------");
        for (double i = 1, j = 20; i <= 10 && j <= 65; i++, j += 5) {

            System.out.printf("%-7.1f %17.3f %17s %17.1f %17.3f\n", i, convertToMeter(i), "|", j, convertToFeet(j));
        }
    }

    public static double convertToMeter(double foot) {

        double meter = 0.305 * foot;
        return meter;
    }

    public static double convertToFeet(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }
}
