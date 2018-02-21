/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package net.beyondcoding.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author michaeljenkins
 */
public final class ShoppingCart
{
    private final List<Item> items = new ArrayList<>();

    /**
     * Note: Strategy Pattern.
     * Any class that implements 'Payment' is supported,
     * this compiles with the Open/Close Principle, as
     * more payment types can be added without changing this class
     *
     * @param paymentType
     * @return
     */
    public boolean processPayment( final Payment paymentType )
    {
        return paymentType.processPayment();
    }

    /**
     *
     * @param item
     */
    public void addItem( final Item item )
    {
        items.add( item );
    }

    /**
     *
     */
    public static final class Item
    {

        private final String itemDescription;
        private final long priceInPence;

        /**
         *
         * @param itemDescription
         * @param priceInPence
         */
        public Item( final String itemDescription, final long priceInPence )
        {
            this.itemDescription = itemDescription;
            this.priceInPence = priceInPence;
        }

        /**
         *
         * @return
         */
        public String getItemDescription()
        {
            return itemDescription;
        }

        /**
         *
         * @return
         */
        public long getPriceInPence()
        {
            return priceInPence;
        }
    }
}
