package week_01.assignments;

public class Question_01_11 {
    public static void main(String[] arg) {

        System.out.println("One birth every 7 seconds: 600 birth for every 60 minutes ");
        System.out.println("One birth every 7 seconds: 14400 person in a day ");
        System.out.println("1 year has 365days ");
        System.out.println("365*14400= 525600" + " births in a year");
        System.out.println("5256000 birth for 1 year ");

        System.out.println("                            ");
        System.out.println("One death every 13 seconds: 5 death for every minute");
        System.out.println("One death every 13 seconds: 7200 person in a day ");
        System.out.println("1 year has 365days ");
        System.out.println("365*7200= 2628000" + " deaths for in a year");
        System.out.println("2628000 death for 1 year ");

        System.out.println("                            ");


        System.out.println("One immigrant every 45 seconds: 60 immigrant for every 60 minutes ");
        System.out.println("One immigrant every 45 seconds: 1440 person in a day ");
        System.out.println("1 year has 365days ");
        System.out.println("365*1440= 525600" + " immigrant in a year");


        System.out.println("Current population: 312032486");
        System.out.println("Yearly Population projection formula: ");
        System.out.println("Current population + ((births per year)");
        System.out.println("                   - (deaths per year)");

        System.out.println("Year 1 projection:");
        System.out.println(312032486 + 5256000 - 2628000 + 525600);

        System.out.println("Year 2 projection:");
        System.out.println((312032486 + (5256000 - 2628000 + 525600) * 2));

        System.out.println("Year 3 projection:");
        System.out.println((312032486 + (5256000 - 2628000 + 525600) * 3));

        System.out.println("Year 4 projection:");
        System.out.println((312032486 + (5256000 - 2628000 + 525600) * 4));

        System.out.println("Year 5 projection:");
        System.out.println((312032486 + (5256000 - 2628000 + 525600) * 5));


    }

}
