package week_05.assignments;

public class Question_05_05 {
    public static void main(String[] args) {

        System.out.println("Kilograms" + "\t" + "Pounds" + "    | " + "\tPounds" + "\t\tKilograms");


        for (int kilo = 1, pound = 20; kilo < 200 && pound <= 515; kilo += 2, pound += 5) {

            double poundPerKilo = kilo * 2.2;
            double kiloPerPound = pound / 2.2;

            System.out.printf("%-7d   %6.1f      |     %-6d    %8.2f\n"
                    , kilo, poundPerKilo, pound, kiloPerPound);
        }
    }
}
