/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package uk.co.mikejenkins.designpatterns.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class UserBuilderTest
{
    private UserBuilder builder;
    private User user;

    @Before
    public void setup()
    {
        builder = new UserBuilder();
        user = builder.create( "Joe", "Bloggs", "1970-01-01" );
    }

    @Test
    public void shouldCreateUserWithRequiredFields()
    {
        assertEquals( "Joe", user.getFirstName() );
        assertEquals( "Bloggs", user.getLastName() );

        assertEquals( "", user.getAddress() );
        assertEquals( "", user.getPhoneNumber() );
        assertEquals( "1970-01-01", user.getDateOfBirth() );
    }

    @Test
    public void shouldCreateUserWithOptionalFields()
    {
        user = builder.setAddress( "Address" ).
                setPhoneNumber( "1234567" ).
                create( "Joe", "Bloggs", "1970-01-01" );

        assertEquals( "Joe", user.getFirstName() );
        assertEquals( "Bloggs", user.getLastName() );

        assertEquals( "Address", user.getAddress() );
        assertEquals( "1234567", user.getPhoneNumber() );
        assertEquals( "1970-01-01", user.getDateOfBirth() );
    }
}
