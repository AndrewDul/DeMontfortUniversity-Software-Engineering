package main;

import lib.BankAccount;

/**
 * A demonstration application for the BankAccount class.
 * This program will create BankAccount objects and perform some basic operations.
 * 
 * @author Andrew
 * @version 1.0
 */
public class BankAccountApp {

    public static void main(String[] args) {
        // Create a new bank account with account number "123456" and initial balance £100.00 (10000 pence)
        BankAccount account1 = new BankAccount("123456", 10000);
        
        // Create another bank account with account number "789012" and initial balance £50.00 (5000 pence)
        BankAccount account2 = new BankAccount("789012", 5000);
        
        // Display initial balances
        System.out.println("Account 1 balance: £" + account1.getBalance() / 100.0);
        System.out.println("Account 2 balance: £" + account2.getBalance() / 100.0);
        
        // Deposit £20.00 (2000 pence) into account1
        account1.deposit(2000);
        System.out.println("After depositing £20.00, Account 1 balance: £" + account1.getBalance() / 100.0);
        
        // Withdraw £30.00 (3000 pence) from account2
        if (account2.withdraw(3000)) {
            System.out.println("After withdrawing £30.00, Account 2 balance: £" + account2.getBalance() / 100.0);
        } else {
            System.out.println("Insufficient funds to withdraw £30.00 from Account 2.");
        }
        
        // Attempt to withdraw £120.00 (12000 pence) from account1
        if (account1.withdraw(12000)) {
            System.out.println("After withdrawing £120.00, Account 1 balance: £" + account1.getBalance() / 100.0);
        } else {
            System.out.println("Insufficient funds to withdraw £120.00 from Account 1.");
        }
    }
}
