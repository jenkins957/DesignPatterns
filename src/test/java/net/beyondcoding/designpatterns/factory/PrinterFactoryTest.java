/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package net.beyondcoding.designpatterns.factory;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrinterFactoryTest
{
    @Test
    public void shouldGetConsolePrinter()
    {
        Printer printer = PrinterFactory.getPrinter( PrinterType.CONSOLE );
        assertTrue( printer instanceof ConsolePrinter );
    }

    @Test
    public void shouldGetFilePrinter()
    {
        Printer printer = PrinterFactory.getPrinter( PrinterType.FILE );
        assertTrue( printer instanceof FilePrinter );
    }

    @Test
    public void shouldGetSerialPrinter()
    {
        Printer printer = PrinterFactory.getPrinter( PrinterType.SERIAL );
        assertTrue( printer instanceof SerialPrinter );
    }

    @Test( expected = IllegalArgumentException.class )
    public void shouldNotGetUnsupportedPrinter()
    {
        PrinterFactory.getPrinter( PrinterType.USB_PRINTER );
    }
}
