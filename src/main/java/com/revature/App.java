package com.revature;

import com.revature.Parser.Parser;
import com.revature.Account.Account;
import com.revature.Commands.Command;
import com.revature.Commands.CommandWords;
import java.math.BigDecimal;
import com.revature.FileIO.FileIO;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    private Parser parser;
    private ArrayList<String> accountStrings;
    private HashMap<Integer, Account> accounts;
    private FileIO file;
    private CommandWords commandWords;
    private boolean isQuit;
    private Account currentAccount;

    public static void main( String[] args )
    {
        App bankingTerminal = new App();
        bankingTerminal.run();
    }

    public App() {
        init();
        parser = new Parser();

        /*
        Account test = new Account(1, "Alex", "Swanson", "123 Fake St.");
        test.setBalance(new BigDecimal("100"));
        test.setPIN((short)1111);

        Account test2 = new Account(2, "Joe", "Swanson", "123 Fake St.");
        test2.setBalance(new BigDecimal("100"));
        test2.setPIN((short)1111);
        */
        

        //file.writeAccount(test.getString());
        
        
        
        //for (String s : accounts) {
       //     System.out.println(s);
        //}
        
    }

    public void init() {
        //Read Accounts store in DS
        file = new FileIO();
        accountStrings = new ArrayList<String>();
        accounts = new HashMap<Integer, Account>();
        accountStrings = file.readAccounts();
        String[] accountArgs;
        for (String st : accountStrings) {
            accountArgs = st.split(":");
            int acctID = Integer.parseInt(accountArgs[0]);
            BigDecimal bal = new BigDecimal(accountArgs[1]);
            short pin = Short.parseShort(accountArgs[2]);
            String fname = accountArgs[3];
            String lname = accountArgs[4];
            String addr = accountArgs[5];
            Account tempAccount = new Account(acctID, bal, pin, fname, lname, addr);
            accounts.put(acctID, tempAccount);

        }
        commandWords = new CommandWords();
        
    }

    public void run() {
        System.out.println("Type open to make an account");
        boolean finished = false;
		while(!finished) {
            Command command = parser.parseInput();
            finished = processCommand(command);
            if (isQuit) {break;}
        }
        file.writeAccount(currentAccount.getString());
    }

    public void openAccount() {
        Account newAccount = new Account();
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.print("Choose an account ID <a number>: ");
        userInput = scanner.nextLine();
        //Validate ID
        newAccount.setAccountID(Integer.parseInt(userInput));
        System.out.print("Choose a pin <a 4 digit number>: ");
        userInput = scanner.nextLine();
        newAccount.setPIN(Short.parseShort(userInput));
        System.out.print("What is your first name>: ");
        userInput = scanner.nextLine();
        newAccount.setFirstName(userInput);
        System.out.print("What is your last name>: ");
        userInput = scanner.nextLine();
        newAccount.setLastName(userInput);
        System.out.print("What is your Address>: ");
        userInput = scanner.nextLine();
        newAccount.setAddress(userInput);
        newAccount.setBalance(new BigDecimal("0"));
        accounts.put(newAccount.getAccountID(), newAccount);
        currentAccount = newAccount;
        System.out.println("deposit, withdraw, or quit?");
    }

    public boolean processCommand (Command command) {
        boolean wantToQuit = false; 
        if(!commandWords.isCommand(command.getString())) {
            System.out.println("Garbage In, Garbage Out");
            return false;
        }

        if (command.getString().equals("help")) {
            printHelp();
        }
        else if (command.getString().equals("open")) {
            openAccount();
        }
        else if (command.getString().equals("login")) {
            login();
        }
        //If logged in block?
        else if (command.getString().equals("deposit")) {
            deposit();
        }
        else if (command.getString().equals("withdraw")) {
            withdraw();
        }
        else if (command.getString().equals("quit")) {
            isQuit = true;
        }

        return wantToQuit;
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.print("Enter Account ID: ");
        userInput = scanner.nextLine();
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.print("How much to deposit: ");
        userInput = scanner.nextLine();
        BigDecimal deposit = new BigDecimal(userInput);
        currentAccount.deposit(deposit);

    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.print("How much to withdraw: ");
        userInput = scanner.nextLine();
        BigDecimal withdraw = new BigDecimal(userInput);
        currentAccount.withdraw(withdraw);
    }

    public void printHelp() {
        System.out.println();
        commandWords.showAll();
        System.out.println();
    }
}
