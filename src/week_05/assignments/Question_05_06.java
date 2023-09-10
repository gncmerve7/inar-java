package week_05.assignments;

public class Question_05_06 {
    public static void main(String[] args) {
            System.out.println("Miles" + "\t" + "Kilometers" + "     | " + "\tKilometers" + "\t\tMiles");


            for (int mile = 1, kilometer = 20;mile <= 10 && kilometer <=65;mile++,kilometer+=5){
                double perMile=mile*1.609;
                double perKilometer=kilometer/1.609;

                System.out.printf(" %-7d   %-6.3f      |     \t%-2d    \t\t%-2.3f\n"
                        , mile, perMile, kilometer, perKilometer);
            }

    }
}