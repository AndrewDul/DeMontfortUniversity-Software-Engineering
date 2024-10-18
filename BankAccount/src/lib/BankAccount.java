package lib;

/**
 * Represents a simple bank account.
 * Money can be deposited and withdrawn.
 * The account can only withdraw money if there are sufficient funds.
 * 
 * @author Andrew
 * @version 1.0
 */
public class BankAccount {
    private String accountNo; // Account number
    private int balance; // Balance in pence (1 pound = 100 pence)

    // Constructor
    public BankAccount(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance; // Balance in pence
    }

    // Method to get the balance
    public int getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money (only if there are enough funds)
    public boolean withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Optional: Get the account number
    public String getAccountNo() {
        return accountNo;
    }

    @Override
    public String toString() {
        return "Account No: " + accountNo + ", Balance: " + balance / 100.0 + " GBP";
    }
}
