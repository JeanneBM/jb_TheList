package test.mt;

import MessagingTemplateMethods.SpanishWelcomeTemplateMethod;
import MessagingTemplateMethods.AbstractMessagingTemplateMethod;
import MessagingTemplateMethods.DeutschWelcomeTemplateMethod;
import MessagingTemplateMethods.PolishWelcomeTemplateMethod;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessagingTemplateMethodTests {
    @Test
    public void DeutschWelcomeTemplateMethod_execute_shouldReturn_AllWelcomes() {
        AbstractMessagingTemplateMethod msg = new DeutschWelcomeTemplateMethod();
        assertEquals("Guten Tag! " + "Ich heiße Asia. " + "Auf Wiedersehen!", msg.execute());
    }

    @Test
    public void PolishWelcomeTemplateMethod_execute_shouldReturn_AllWelcomes() {
        AbstractMessagingTemplateMethod msg = new PolishWelcomeTemplateMethod();
        assertEquals("Czesc! " + "Mam na imie Asia. " + "Do zobaczenia!", msg.execute());
    }

    @Test
    public void SpanishWelcomeTemplateMethod_execute_shouldReturn_AllWelcomes() {
        AbstractMessagingTemplateMethod msg = new SpanishWelcomeTemplateMethod();
        assertEquals("Hola! " + "Mi nombre es Asia. " + "Hasta La Vista!", msg.execute());
    }
}