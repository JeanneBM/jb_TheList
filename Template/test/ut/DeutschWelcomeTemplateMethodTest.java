package test.ut;

import MessagingTemplateMethods.AbstractMessagingTemplateMethod;
import MessagingTemplateMethods.DeutschWelcomeTemplateMethod;

import org.junit.Assert;
import org.junit.Test;

public class DeutschWelcomeTemplateMethodTest {
    @Test
    public void createHead_ShouldReturn_DeutschWelcome() {
        AbstractMessagingTemplateMethod msg = new DeutschWelcomeTemplateMethod();
        Assert.assertEquals("Guten Tag! ", msg.createHead());
    }
    @Test
    public void createBody_ShouldReturn_DeutschWelcome() {
        AbstractMessagingTemplateMethod msg = new DeutschWelcomeTemplateMethod();
        Assert.assertEquals("Ich heiße Asia. ", msg.createBody());
    }

    @Test
    public void createFooter_ShouldReturn_DeutschWelcome() {
        AbstractMessagingTemplateMethod msg = new DeutschWelcomeTemplateMethod();
        Assert.assertEquals("Auf Wiedersehen!", msg.createFooter());
    }

}