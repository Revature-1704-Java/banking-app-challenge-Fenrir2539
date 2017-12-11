package com.revature;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import com.revature.Account.Account;

/**
 * Unit test for simple App.
 */
public class AccountTest extends TestCase
{
    @Test
    public void testConstructor() {
        Account a = new Account("Alex", "Swanson", "123 Fake St.");
        assertEquals("Alex", a.getFirstName());
        assertEquals("Swanson", a.getLastName());
        assertEquals("123 Fake St.", a.getAddress());
    }
}
