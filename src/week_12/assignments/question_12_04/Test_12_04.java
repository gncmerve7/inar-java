package week_12.assignments.question_12_04;

public class Test_12_04 {
    public static void main(String[] args) throws IllegalArgumentException {
        try {
            Loan_12 ob1 = new Loan_12();
            ob1.setAnnualInterestRate(0);
            ob1.setLoanAmount(0);
            ob1.setNumberOfYears(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("works");
        }
    }
}