/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package net.beyondcoding.designpatterns.factory;

/**
 * Prints text to console (std out)
 * @author michaeljenkins
 */
public class ConsolePrinter implements Printer
{
    @Override
    public void printLine( final String line )
    {
        System.out.println( line );
    }
}
