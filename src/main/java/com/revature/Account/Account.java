package com.revature.Account;

public class Account implements AccountInterface{
    private int accountID;
    private int balance;
    private short pin;
    private String firstName;
    private String lastName;
    private String address;

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

    public void withdraw(int amount) {

    }

    public void deposit(int amount) {
        
    }
}