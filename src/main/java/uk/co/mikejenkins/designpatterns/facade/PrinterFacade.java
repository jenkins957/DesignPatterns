/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package uk.co.mikejenkins.designpatterns.facade;

import java.util.List;

/**
 *
 * @author michaeljenkins
 */
public interface PrinterFacade
{
    boolean printDocument( final List<String> lines );
}
