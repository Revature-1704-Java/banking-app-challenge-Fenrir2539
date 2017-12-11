package com.revature.Commands;

import java.util.Set;
import java.util.HashSet;


public class CommandWords {

    private Set<String> validCommands = new HashSet<String>();

    public CommandWords() {
        validCommands.add("open");
        validCommands.add("access");
        validCommands.add("deposit");
        validCommands.add("withdraw");
        validCommands.add("quit");
    }   

    public boolean isCommand(String str) {
        if (validCommands.contains(str)) {
            return true;
        }
        else {
            return false;
        }
    }

    public void showAll() {
        for(String command: validCommands) {
            System.out.print(command + "   ");
        }
        System.out.println();
    }
}