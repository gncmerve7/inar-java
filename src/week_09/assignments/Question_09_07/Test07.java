package week_09.assignments.Question_09_07;

public class Test07 {
    public static void main(String[] args) {
        Account account = new Account(1122, 3000, 2500, 20000, 4.5);

        System.out.println("\t\tAccount statement :");
        System.out.println("--------------------------------");
        System.out.println("Account  ID   : " + account.getId());
        System.out.println("Date created  : " + account.getDateCreated());
        System.out.println("Balance       : " + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());

    }
}
