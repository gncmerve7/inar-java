package week_06.assignments;


public class Question_06_15 {
    public static void main(String[] args) {
        System.out.printf("%13s %13s %13s %13s %20s\n", "Taxable income", "Single(0)", "Married Joint or Qualifying Widow(1)", "Married Separate(2)", "Head of a House(3)");
        for (double i = 50000; i <= 60000; i += 50) {
            System.out.printf("%-13s ", (int) i);

            for (int j = 0; j <= 3; j++) {
                System.out.printf("%5s %-20d ", j, Math.round(computeTax(j, i)));
            }
            System.out.print("\n");
        }
    }

    public static double computeTax(int status, double income) {
        double taxAmount = 0;
        if (status == 0) {
            if (income <= 8350) {
                taxAmount = income * 0.10;
            } else if (income <= 33950) {
                taxAmount = (8350 * 0.10) + (income - 8350) * 0.15;
            } else if (income <= 82250) {
                taxAmount = (8350 * 0.10) + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            } else if (income <= 171550) {
                taxAmount = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            } else if (income <= 372950) {
                taxAmount = (8350 * 0.10) + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
            } else
                taxAmount = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((82250 - 33950) * 0.25) + ((171550 - 82250) * 0.28) + ((372950 - 171550) * 0.33) + ((income - 372950) * 0.35);
        }
        if (status == 1) {
            if (income <= 16700) {
                taxAmount = income * 0.10;
            } else if (income <= 67900) {
                taxAmount = (16700 * 0.10) + (income - 16700) * 0.15;
            } else if (income <= 137050) {
                taxAmount = (16700 * 0.10) + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
            } else if (income <= 208850) {
                taxAmount = (16700 * 0.10) + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
            } else if (income <= 372950) {
                taxAmount = (16700 * 0.10) + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (income - 208850) * 0.33;
            } else
                taxAmount = (16700 * 0.10) + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
        }
        if (status == 2) {
            if (income <= 8350) {
                taxAmount = income * 0.10;
            } else if (income <= 33950) {
                taxAmount = (8350 * 0.10) + ((income - 8350) * 0.15);
            } else if (income <= 68525) {
                taxAmount = (8350 * 0.10) + (33950 - 8350) * 0.15 + ((income - 33950) * 0.25);
            } else if (income <= 104425) {
                taxAmount = (8350 * 0.10) + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
            } else if (income <= 186475) {
                taxAmount = (8350 * 0.10) + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (income - 104425) * 0.33;
            } else
                taxAmount = (8350 * 0.10) + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
        }
        if (status == 3) {
            if (income <= 11950) {
                taxAmount = income * 0.10;
            } else if (income <= 45500) {
                taxAmount = (11950 * 0.10) + (income - 11950) * 0.15;
            } else if (income <= 117450) {
                taxAmount = (11950 * 0.10) + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
            } else if (income <= 190200) {

                taxAmount = (11950 * 0.10) + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;

            } else if (income <= 372950) {
                taxAmount = (11950 * 0.10) + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (income - 190200) * 0.33;
            } else
                taxAmount = (11950 * 0.10) + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
        }
        return taxAmount;
    }
}

