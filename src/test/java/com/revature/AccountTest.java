package com.revature;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;

import java.math.BigDecimal;

import com.revature.Account.Account;

/**
 * Unit test for simple App.
 */
public class AccountTest extends TestCase
{
    @Test
    public void testJunk() {
        assertTrue(true);
    }
    
    /*
    @Test
    public void testConstructor() {
        Account a = new Account(1, "Alex", "Swanson", "123 Fake St.");
        assertEquals("Alex", a.getFirstName());
        assertEquals("Swanson", a.getLastName());
        assertEquals("123 Fake St.", a.getAddress());
    }

    @Test
    public void testWithdraw() {
        Account a = new Account(1, "Alex", "Swanson", "123 Fake St.");
        BigDecimal aHundredDollars = new BigDecimal("100.00");
        BigDecimal fiftyDollars = new BigDecimal("50.00");
        a.setBalance(aHundredDollars);
        assertEquals(aHundredDollars, a.getBalance());
        a.withdraw(fiftyDollars);
        assertEquals(0, fiftyDollars.compareTo(a.getBalance()));
    }

    @Test
    public void testDeposit() {
        Account a = new Account(1, "Alex", "Swanson", "123 Fake St.");
        BigDecimal fiftyDollars = new BigDecimal("50.00");
        a.deposit(fiftyDollars);
        assertEquals(0, fiftyDollars.compareTo(a.getBalance()));
    }
    */

}
