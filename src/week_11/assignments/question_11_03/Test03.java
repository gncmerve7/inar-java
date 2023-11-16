package week_11.assignments.question_11_03;

import week_09.assignments.Question_09_07.Account;

public class Test03 {
    public static void main(String[] args) {

        Account check = new CheckingAccount(11, 20000, 11450, 30000);
        Account save = new SavingsAccount(16, 20000, 3820, 19000);

        System.out.println(check.toString());
        System.out.println("----------------------------");
        System.out.println(save.toString());
    }
}
