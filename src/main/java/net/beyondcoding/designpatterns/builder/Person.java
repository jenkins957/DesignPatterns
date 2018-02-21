/*
 * Copyright 2018 http://www.beyondcoding.net
 */
package net.beyondcoding.designpatterns.builder;

/**
 * Person with static inner builder class.
 * Using an inner class it's possible to have a private constructor
 * for Person and only create instances from the builder.
 *
 * @author michaeljenkins
 */
public class Person
{
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;

    /**
     * Builder Pattern (inner static class)
     * Can have a private constructor and force creation
     * via the builder.
     */
    private Person( final PersonBuilder builder )
    {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public static class PersonBuilder
    {
        private final String firstName;
        private String lastName;
        private String phoneNumber;

        /**
         * Force any required parameters in Constructor.
         * @param firstName
         */
        public PersonBuilder( final String firstName )
        {
            this.firstName = firstName;
        }

        public PersonBuilder setLastName( final String lastName )
        {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setPhonenumber( final String phoneNumber )
        {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build()
        {
            return new Person( this );
        }
    }
}
