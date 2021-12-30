package test.ut;

import MessagingTemplateMethods.SpanishWelcomeTemplateMethod;
import MessagingTemplateMethods.AbstractMessagingTemplateMethod;

import org.junit.Assert;
import org.junit.Test;

public class SpanishWelcomeTemplateMethodTest {
    @Test
    public void createHead_ShouldReturn_SpanishWelcome() {
        AbstractMessagingTemplateMethod msg = new SpanishWelcomeTemplateMethod();
        Assert.assertEquals("Hola! ", msg.createHead());
    }
    @Test
    public void createBody_ShouldReturn_SpanishWelcome() {
        AbstractMessagingTemplateMethod msg = new SpanishWelcomeTemplateMethod();
        Assert.assertEquals("Mi nombre es Asia. ", msg.createBody());
    }

    @Test
    public void createFooter_ShouldReturn_SpanishWelcome() {
        AbstractMessagingTemplateMethod msg = new SpanishWelcomeTemplateMethod();
        Assert.assertEquals("Hasta La Vista!", msg.createFooter());
    }

}