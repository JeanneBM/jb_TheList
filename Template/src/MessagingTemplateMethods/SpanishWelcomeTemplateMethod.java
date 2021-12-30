package MessagingTemplateMethods;

public class SpanishWelcomeTemplateMethod extends AbstractMessagingTemplateMethod {
    @Override
    public String createHead() {
        System.out.print ("Hola! ");
        return "Hola! ";
    }

    @Override
    public String createBody() {

        System.out.print("Mi nombre es Asia. ");
        return "Mi nombre es Asia. ";
    }

    @Override
    public String createFooter() {

        System.out.println("Hasta La Vista!");
        return "Hasta La Vista!";
    }
}