/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package uk.co.mikejenkins.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author michaeljenkins
 */
public final class ShoppingCart
{
    private List<Item> items = new ArrayList<>();

    /**
     *
     * @param item
     */
    public void addItem( Item item )
    {
        items.add( item );
    }

    /**
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
