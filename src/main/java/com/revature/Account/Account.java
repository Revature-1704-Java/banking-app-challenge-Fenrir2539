package com.revature.Account;

public class Account implements AccountInterface{
    private int accountID;
    private int balance;
    private short pin;
    private String firstName;
    private String lastName;
    private String address;
    private boolean isLocked;

    public Account () {}

    public Account(String firstName, String lastName, String address) {
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

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
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

    public void withdraw(int amount) {
        if (amount > 0) {
            this.balance = this.balance - amount;
            if (balance <= 0) {
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

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
            System.out.println("Your new balance is: "+balance);
        }
        else {
            System.out.println("Cannot deposit a negative number: "+amount);
        }
        
    }
}