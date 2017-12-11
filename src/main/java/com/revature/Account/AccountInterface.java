package com.revature.Account;

import java.math.BigDecimal;

public interface AccountInterface {
    
    public int getAccountID();
    public void setAccountID(int id);
    public BigDecimal getBalance();
    public void setBalance(BigDecimal balance);
    public short getPIN();
    public void setPIN(short pin);
    public String getFirstName();
    public void setFirstName(String firstName);
    public String getLastName();
    public void setLastName(String lastName);
    public String getAddress();
    public void setAddress(String address);
    public void withdraw(BigDecimal amount);
    public void deposit(BigDecimal amount);
    public boolean getIsLocked();
    public void setIsLocked(boolean lock);

}