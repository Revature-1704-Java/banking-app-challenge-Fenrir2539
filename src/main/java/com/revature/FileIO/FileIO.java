package com.revature.FileIO;

import com.revature.Account.*;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class FileIO {

    public static final String filename = "src/main/resources/Accounts.txt";

    
    public FileIO() {}
        
    public ArrayList<String> readAccounts() {
        ArrayList<String> accounts = new ArrayList<String>();
        try(FileReader fr = new FileReader(filename)) {
            //Logic
            BufferedReader buffReader = new BufferedReader(fr);
            String s;
            while((s = buffReader.readLine()) != null){
                accounts.add(s);
            }
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return accounts;
    }
    
    public void writeAccount(String accountInfo) {
        try (FileWriter fw = new FileWriter(filename, true)) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(accountInfo);
            bw.newLine();
            bw.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}