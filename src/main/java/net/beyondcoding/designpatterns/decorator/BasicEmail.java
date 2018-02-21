/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package net.beyondcoding.designpatterns.decorator;

/**
 *
 * @author michaeljenkins
 */
public class BasicEmail implements Email
{

    /**
     *
     */
    protected String contents;

    /**
     *
     * @param contents
     */
    public BasicEmail( String contents )
    {
        this.contents = contents;
    }

    /**
     *
     * @return
     */
    @Override
    public String getContents()
    {
        return contents;
    }
}
