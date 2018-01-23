/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package uk.co.mikejenkins.designpatterns.strategy;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import uk.co.mikejenkins.designpatterns.strategy.ShoppingCart.Item;

public class ShoppingCartTest
{

    private ShoppingCart cart = null;

    @Before
    public void init()
    {
        cart = new ShoppingCart();
        cart.addItem( new ShoppingCart.Item( "Chocolate bar", 52 ) );
    }

    @Test
    public void shouldProcessCashPayment()
    {
        assertTrue( cart.processPayment( new CashPayment() ) );
    }

    @Test
    public void shouldProcessVoucherPayment()
    {
        assertTrue( cart.processPayment( new VoucherPayment( "123" ) ) );
    }

    @Test
    public void shouldNotProcessVoucherPaymentForInvalidVoucher()
    {
        VoucherPayment nullVoucherRef = new VoucherPayment(null );
        VoucherPayment emptyVoucherRef = new VoucherPayment("" );

        assertNull( nullVoucherRef.getVoucherReference() );
        assertTrue( emptyVoucherRef.getVoucherReference().length() == 0 );

        assertFalse( cart.processPayment( nullVoucherRef ) );
        assertFalse( cart.processPayment( emptyVoucherRef ) );
    }

    @Test
    public void shouldStoreItemDetails()
    {
        Item item = new ShoppingCart.Item("item name", 12345L );

        assertEquals( "item name", item.getItemDescription() );
        assertEquals( 12345L, item.getPriceInPence() );
    }
}
