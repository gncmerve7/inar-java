package week_09.assignments.Question_09_07;

import javax.print.DocFlavor;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    public double withdraw;
    public double deposit;

    protected Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
        this.withdraw = 0;
        this.deposit = 0;
    }

    protected Account(int id, double deposit, double withdraw, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance + deposit - withdraw;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    protected Account(int id, int balance,double deposit, double withdraw) {
        this.id = id;
        this.balance = balance + deposit - withdraw;
    }

    protected Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 1200;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "Account  ID   : " + getId() + "\nBalance       : $" + getBalance();

    }
}
