package week_05.assignments;

public class Question_05_07 {

    public static void main(String[] args) {

        double tuition = 10000;
        double tuitionInTen = 0;
        double totalCost = 0;

        for (int year = 1; year <= 14; year++) {
            tuition += tuition * 5 / 100;
            if (year == 10)
                tuitionInTen = tuition;
            if (year > 10)
                totalCost += tuition;
        }
        System.out.printf("Tuition in ten years:  $%1.0f\n",tuitionInTen);
        System.out.printf("Total cost for four years' worth of tuition after the tenth year:  $%1.0f\n",totalCost);
    }

}
