package test;

import MessagingTemplateMethods.SpanishWelcomeTemplateMethod;
import MessagingTemplateMethods.AbstractMessagingTemplateMethod;
import MessagingTemplateMethods.DeutschWelcomeTemplateMethod;
import MessagingTemplateMethods.PolishWelcomeTemplateMethod;

public class TemplatePatternDemo {
    public static void main (String[] args){
        AbstractMessagingTemplateMethod msg = new DeutschWelcomeTemplateMethod();
        msg.execute();
        msg = new SpanishWelcomeTemplateMethod();
        msg.execute();
        msg = new PolishWelcomeTemplateMethod();
        msg.execute();
    }
}
