package com.revature.Account;

import java.io.Serializable;
import java.math.BigDecimal;

public class Account implements AccountInterface{
    private int accountID;
    private BigDecimal balance;
    private short pin;
    private String firstName;
    private String lastName;
    private String address;
    private boolean isLocked;

    public Account () {}

    public Account(int accountID, BigDecimal balance, short pin, String firstName, String lastName, String address) {
        this.accountID = accountID;
        this.balance = balance;
        this.pin = pin;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public int getAccountID() {
        return this.accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public short getPIN() {
        return this.pin;
    }

    public void setPIN(short pin) {
        this.pin = pin;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean getIsLocked() {
        return this.isLocked;
    }

    public void setIsLocked(boolean lock) {
        this.isLocked = lock;
    }

    public void withdraw(BigDecimal amount) {
        BigDecimal zero = new BigDecimal("0");
        if (amount.compareTo(zero) == 1) {
            this.balance = this.balance.subtract(amount);
            if (this.balance .compareTo(zero) != 1) {
                this.isLocked = true;
                System.out.println("You have overdrawn your account! It is now locked");
                System.out.println("Prepare for FEEEEEESS!!!!!");
            }
            System.out.println("Your new balance is: "+balance);
        }
        else {
            System.out.println("Cannot withdraw a negative number: "+amount);
        }
    }

    public void deposit(BigDecimal amount) {
        BigDecimal zero = new BigDecimal("0");
        if (amount.compareTo(zero) == 1) {
            this.balance = this.balance.add(amount);
            System.out.println("Your new balance is: "+balance);
            if (amount.compareTo(zero) == 1) {
                this.isLocked = false;
                System.out.println("Account balance is positive. It is now unlocked");
            }
        }
        else {
            System.out.println("Cannot deposit a negative number: "+amount);
        }
        
    }

    public String getString() {
        String accountInfo = this.accountID + ":" + balance.toString() + ":" + this.pin + ":" + this.firstName + ":" + this.lastName+ ":" + address;
        return accountInfo;
    }
}