/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package uk.co.mikejenkins.designpatterns.facade;

import java.util.List;

/**
 *
 * @author michaeljenkins
 */
public class PrinterFacadeImpl implements PrinterFacade
{
    /**
     *
     * @param lines
     * @return
     */
    @Override
    public boolean printDocument( final List<String> lines )
    {
        final SerialPrinter sp = new SerialPrinter();

        for( final String line : lines )
        {
            for( char c : line.toCharArray() )
            {
                sp.print( c );
            }

            sp.print( '\n' );
            sp.print( '\n' );
        }

        return false;
    }
}
