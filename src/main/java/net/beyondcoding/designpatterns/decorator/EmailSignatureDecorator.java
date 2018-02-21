/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package net.beyondcoding.designpatterns.decorator;

/**
 *
 * @author michaeljenkins
 */
public final class EmailSignatureDecorator implements Email
{
    private final Email email;

    /**
     *
     * @param email
     */
    public EmailSignatureDecorator( final Email email )
    {
        this.email = email;
    }

    /**
     *
     * @return
     */
    @Override
    public String getContents()
    {
        return email.getContents() + getDefaultEmailSignature();
    }

    private String getDefaultEmailSignature()
    {
        return "/n/nSave paper! Please do not print unless you really need to.";
    }

}
