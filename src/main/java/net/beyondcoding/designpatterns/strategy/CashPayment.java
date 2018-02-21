/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package net.beyondcoding.designpatterns.strategy;

/**
 *
 * @author michaeljenkins
 */
public final class CashPayment implements Payment
{

    /**
     *
     * @return
     */
    @Override
    public boolean processPayment()
    {
        return true;
    }

}
