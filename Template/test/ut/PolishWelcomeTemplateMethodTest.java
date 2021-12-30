package test.ut;

import MessagingTemplateMethods.AbstractMessagingTemplateMethod;
import MessagingTemplateMethods.PolishWelcomeTemplateMethod;

import org.junit.Assert;
import org.junit.Test;

public class PolishWelcomeTemplateMethodTest {
    @Test
    public void createHead_ShouldReturn_PolishWelcome() {
        AbstractMessagingTemplateMethod msg = new PolishWelcomeTemplateMethod();
        Assert.assertEquals("Czesc! ", msg.createHead());
    }
    @Test
    public void createBody_ShouldReturn_PolishWelcome() {
        AbstractMessagingTemplateMethod msg = new PolishWelcomeTemplateMethod();
        Assert.assertEquals("Mam na imie Asia. ", msg.createBody());
    }

    @Test
    public void createFooter_ShouldReturn_PolishWelcome() {
        AbstractMessagingTemplateMethod msg = new PolishWelcomeTemplateMethod();
        Assert.assertEquals("Do zobaczenia!", msg.createFooter());
    }

}