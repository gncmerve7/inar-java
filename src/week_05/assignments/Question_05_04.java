package week_05.assignments;

public class Question_05_04 {

    public static void main(String[] args) {

        System.out.println("Miles" + "\tKilometers");
           for (int i = 1; i <= 10; i++) {
            double kilometersPerMiles = i * 1.6;
            System.out.println(" " + i + "  " + "\t\t" + (kilometersPerMiles * 100) / 100);
        }
    }
}
