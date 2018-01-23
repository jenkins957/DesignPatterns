/*
 * File: UserBuilderTest
 * User: michaeljenkins 
 * Date: Apr 17, 2015
 *
 * Copyright Mike Jenkins 2014
 */
package uk.co.mikejenkins.designpatterns.builder;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserBuilderTest
{

    @Test
    public void shouldCreateUserWithRequiredFields()
    {
        UserBuilder builder = new UserBuilder( "Joe", "Bloggs" );
        User user = builder.create();

        assertEquals( "Joe", user.getFirstName() );
        assertEquals( "Bloggs", user.getLastName() );

        assertEquals( "", user.getAddress() );
        assertEquals( "", user.getPhoneNumber() );
        assertEquals( "", user.getDateOfBirth() );
    }

    @Test
    public void shouldCreateUserWithOptionalFields()
    {
        UserBuilder builder = new UserBuilder( "Joe", "Bloggs" );
        User user = builder.setAddress( "Address" ).
                setPhoneNumber( "1234567" ).
                setDateOfBirth( "01/01/1900" ).
                create();

        assertEquals( "Joe", user.getFirstName() );
        assertEquals( "Bloggs", user.getLastName() );

        assertEquals( "Address", user.getAddress() );
        assertEquals( "1234567", user.getPhoneNumber() );
        assertEquals( "01/01/1900", user.getDateOfBirth() );
    }
}
