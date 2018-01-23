/*
 * File: EmailSignatureDecoratorTest
 * User: michaeljenkins 
 * Date: Apr 17, 2015
 *
 * Copyright Mike Jenkins 2014
 */
package uk.co.mikejenkins.designpatterns.decorator;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmailSignatureDecoratorTest
{
    @Test
    public void shouldAppendDefaultEmailSignature()
    {
        Email email = new BasicEmail( "A test email" );
        assertEquals( "A test email", email.getContents() );
        
        EmailSignatureDecorator emailWithSignature = 
                new EmailSignatureDecorator( email );

        String expectedMsg = "A test email/n/nSave paper! Please do not "
                + "print unless you really need to.";
        
        assertEquals( expectedMsg, emailWithSignature.getContents() );
    }
}
