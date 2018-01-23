/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package uk.co.mikejenkins.designpatterns.strategy;

/**
 *
 * @author michaeljenkins
 */
public final class VoucherPayment implements Payment
{
    private final String voucherReference;

    /**
     *
     * @param voucherReference
     */
    public VoucherPayment( final String voucherReference )
    {
        this.voucherReference = voucherReference;
    }

    /**
     *
     * @return
     */
    public String getVoucherReference()
    {
        return voucherReference;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean processPayment()
    {
        // check voucher id is for a valid voucher
        return isVoucherValid();
    }

    private boolean isVoucherValid()
    {
        // we are happy with any voucher id thats not an empty string
        return ( voucherReference != null && voucherReference.length() > 0 );
    }
}
