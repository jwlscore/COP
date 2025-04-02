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

public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(20000, 0.045);

        account1.withdraw(2500);

        account1.deposit(3000);

        System.out.printf("Account ID: %d\n", account1.getAccountId());
        System.out.printf("Balance: $%.2f\n", account1.getAccountBalance());
        System.out.printf("Monthly Interest Rate: %.3f%%\n", account1.getMonthlyInterestRate() * 100);
        System.out.printf("Monthly Interest: $%.2f\n", account1.getMonthlyInterest());
        System.out.printf("Number of Withdrawals: %d\n", account1.getNumberofWithdrawals());
        System.out.printf("Number of Deposits: %d\n", account1.getNumberOfDeposits());
        System.out.println("Created On: " + account1.getDateCreated());
    }
}
