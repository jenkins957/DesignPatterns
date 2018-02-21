/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package net.beyondcoding.designpatterns.factory;

/**
 *
 * @author michaeljenkins
 */
public class PrinterFactory
{
    private PrinterFactory()
    {

    }
    
    public static Printer getPrinter( final PrinterType type )
    {
        switch ( type )
        {
            case CONSOLE:
                return new ConsolePrinter();
            case FILE:
                return new FilePrinter();
            case SERIAL:
                return new SerialPrinter();
        }

        throw new IllegalArgumentException( "Unsupported printer type: " + type );
    }
}
