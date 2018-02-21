/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package net.beyondcoding.designpatterns.facade;

/**
 *
 * @author michaeljenkins
 */
public class SerialPrinter
{
    public void print( final char character )
    {
        // Do some complex work with serial communications
        System.out.print( character );
    }
}
