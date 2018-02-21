/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package net.beyondcoding.designpatterns.builder;

/**
 * Builder Pattern (External Builder). Easy way to create User object with
 * only the parameters of interest.
 * This Builder is a separate class, but could be inner class.
 * @author michaeljenkins
 */
public class UserBuilder
{
    private String phoneNumber = "";
    private String address = "";

    /**
     *
     */
    public UserBuilder()
    {

    }

    /**
     *
     * @param phoneNumber
     * @return
     */
    public UserBuilder setPhoneNumber( final String phoneNumber )
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     *
     * @param phoneNumber
     * @return
     */
    public UserBuilder setAddress( final String address )
    {
        this.address = address;
        return this;
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param dateOfBirth
     * @return user
     */
    public User create( final String firstName, final String lastName, final String dateOfBirth )
    {
        final User user = new User( firstName, lastName, dateOfBirth );
        user.setAddress( address );
        user.setPhoneNumber( phoneNumber );
        return user;
    }
}
