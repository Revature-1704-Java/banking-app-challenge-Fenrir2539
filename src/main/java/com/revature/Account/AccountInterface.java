package com.revature.Account;

public interface AccountInterface {
    
    public int getAccountID();
    public void setAccountID(int id);
    public int getBalance();
    public void setBalance(int balance);
    public short getPIN();
    public void setPIN(short pin);
    public String getFirstName();
    public void setFirstName(String firstName);
    public String getLastName();
    public void setLastName(String lastName);
    public String getAddress();
    public void setAddress(String address);
    public void withdraw(int amount);
    public void deposit(int amount);

}