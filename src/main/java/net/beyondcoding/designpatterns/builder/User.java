/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package net.beyondcoding.designpatterns.builder;

import java.util.Objects;

/**
 *
 * @author michaeljenkins
 */
public class User
{
    /**
     *
     */
    private String firstName;

    /**
     *
     */
    private String lastName;

    /**
     *
     */
    private String phoneNumber;

    /**
     *
     */
    private String address;

    /**
     *
     */
    private String dateOfBirth;

    /**
     *
     * @param firstName
     * @param lastName
     * @param dateOfBirth
     */
    public User( final String firstName, final String lastName, final String dateOfBirth )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     *
     * @return
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     *
     * @return
     */
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    /**
     *
     * @return
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber
     */
    public void setPhoneNumber( String phoneNumber )
    {
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @return
     */
    public String getAddress()
    {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress( String address )
    {
        this.address = address;
    }

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode( this.firstName );
        hash = 11 * hash + Objects.hashCode( this.lastName );
        hash = 11 * hash + Objects.hashCode( this.phoneNumber );
        hash = 11 * hash + Objects.hashCode( this.address );
        hash = 11 * hash + Objects.hashCode( this.dateOfBirth );
        return hash;
    }

    @Override
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }
        if ( obj == null )
        {
            return false;
        }
        if ( getClass() != obj.getClass() )
        {
            return false;
        }
        final User other = ( User ) obj;
        if ( !Objects.equals( this.firstName, other.firstName ) )
        {
            return false;
        }
        if ( !Objects.equals( this.lastName, other.lastName ) )
        {
            return false;
        }
        if ( !Objects.equals( this.phoneNumber, other.phoneNumber ) )
        {
            return false;
        }
        if ( !Objects.equals( this.address, other.address ) )
        {
            return false;
        }
        return Objects.equals( this.dateOfBirth, other.dateOfBirth );
    }
}
