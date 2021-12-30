package MessagingTemplateMethods;

public abstract class AbstractMessagingTemplateMethod {
    public abstract String createHead();

    public abstract String createBody();

    public abstract String createFooter();

    public final String execute() {
        return  createHead()
                + createBody()
                + createFooter();
    }
}