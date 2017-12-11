package com.revature;

import com.revature.Parser.Parser;

/**
 * Hello world!
 *
 */
public class App 
{
    private Parser parser;

    public static void main( String[] args )
    {
        App bankingTerminal = new App();
        bankingTerminal.run();
    }

    public App() {
        //init();
        parser = new Parser();
    }

    public void run() {

    }
}
