/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package net.beyondcoding.designpatterns.builder;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest
{
    @Test
    public void shouldCreatePerson()
    {
        final Person person = new Person.PersonBuilder( "Joe" ).
                setLastName( "Bloggs" ).
                setPhonenumber( "123" ).
                build();

        assertEquals( "Joe", person.getFirstName() );
        assertEquals( "Bloggs", person.getLastName() );
        assertEquals( "123", person.getPhoneNumber() );
    }
}
