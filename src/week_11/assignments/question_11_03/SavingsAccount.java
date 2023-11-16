package week_11.assignments.question_11_03;

import week_09.assignments.Question_09_07.Account;

public class SavingsAccount extends Account {
    SavingsAccount() {
    }

    protected SavingsAccount(int id,int balance, double deposit, double withdraw) {
        super(id, balance,deposit, withdraw);
    }

    public String toString() {
        return super.toString();
    }
}
