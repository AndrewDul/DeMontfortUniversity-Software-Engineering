package lib;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit tests for the BankAccount class.
 * It tests deposit, withdrawal, and balance functionalities.
 * 
 * @author Andrew
 */
public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("123456", 5000); // Initial balance £50
        account.deposit(2000); // Deposit £20
        assertEquals("Balance should be £70 after deposit", 7000, account.getBalance());
    }

    @Test
    public void testWithdrawSuccess() {
        BankAccount account = new BankAccount("123456", 5000); // Initial balance £50
        boolean success = account.withdraw(2000); // Withdraw £20
        assertTrue("Withdrawal of £20 should succeed", success);
        assertEquals("Balance should be £30 after withdrawal", 3000, account.getBalance());
    }

    @Test
    public void testWithdrawFail() {
        BankAccount account = new BankAccount("123456", 5000); // Initial balance £50
        boolean success = account.withdraw(6000); // Try to withdraw £60 (should fail)
        assertFalse("Withdrawal of £60 should fail", success);
        assertEquals("Balance should remain £50 after failed withdrawal", 5000, account.getBalance());
    }

    @Test
    public void testGetBalance() {
        BankAccount account = new BankAccount("123456", 10000); // Initial balance £100
        assertEquals("Initial balance should be £100", 10000, account.getBalance());
    }
}
