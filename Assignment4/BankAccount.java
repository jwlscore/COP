/*---------------------------------------------------
Name: Juliette Perez
Student ID: 4000366015
COP 2800 – Java Programming
Spring 2025 – Th 5:30 PM – 8:50 PM
Assignment # 4
Plagiarism Statement
I certify that this assignment is my own work and that I have not
copied in part or whole or otherwise plagiarized the work of other
students, persons, Generative Pre-trained Generators (GPTs) or any other AI tools.
I understand that students involved in academic dishonesty will face
disciplinary sanctions in accordance with the College's Student Rights
and Responsibilities Handbook (https://www.mdc.edu/rightsandresponsibilities)
01234567890123456789012345678901234567890123456789012345678901234567890123456789
----------------------------------------------------------*/

import java.util.Date;
import java.util.Random;

public class BankAccount {

    private int accountId;
    private double accountBalance;
    static private double annualInterestRate;
    private Date dateCreated;
    private int numberOfDeposits;
    private int numberofWithdrawals;

    public BankAccount() {
        Random random = new Random();
        this.accountId = random.nextInt(9999 - 1000 + 1) + 1000;
        this.accountBalance = 0;
        this.numberofWithdrawals = 0;
        this.dateCreated = new Date();
    }

    public BankAccount(double accountBalance, double annualInterest) {
        Random random = new Random();
        this.accountId = random.nextInt(9999 - 1000 + 1) + 1000;
        this.accountBalance = accountBalance;
        this.numberofWithdrawals = 0;
        this.dateCreated = new Date();
        annualInterestRate = annualInterest;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return this.accountBalance * this.getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if (amount > this.accountBalance) {
            System.out.printf("Withdrawal amount ($%.2f) larger than account balance ($%.2f)!\n", amount, this.accountBalance);
        } else if (amount <= 0) {
            System.out.println("Cannot withdraw a non-positive amount from balance!");
        } else {
            this.accountBalance -= amount;
            this.numberofWithdrawals++;
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot deposit a non-positive amount!");
        } else {
            this.accountBalance += amount;
            this.numberOfDeposits++;
        }
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        BankAccount.annualInterestRate = annualInterestRate;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public int getNumberOfDeposits() {
        return numberOfDeposits;
    }

    public int getNumberofWithdrawals() {
        return numberofWithdrawals;
    }
}
