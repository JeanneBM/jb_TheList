package MessagingTemplateMethods;

public class PolishWelcomeTemplateMethod extends AbstractMessagingTemplateMethod {
    @Override
    public String createHead() {       System.out.print ("Czesc! "); return "Czesc! "; }


    @Override
    public String createBody() {       System.out.print("Mam na imie Asia. "); return "Mam na imie Asia. "; }

    @Override
    public String createFooter() {     System.out.println("Do zobaczenia!"); return "Do zobaczenia!";    }
}