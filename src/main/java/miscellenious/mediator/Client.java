package miscellenious.mediator;

public class Client {
    public static void main(String[] args) {
        UIMediator uiMediator = new UIMediator();
        UIControl uiControl = new UITextBox(uiMediator);
        UILabel uiLabel = new UILabel(uiMediator);
        // by doing this we have set up the mediator pattern in place
        // Now when these are loaded in Java swing screen, on update of text box all the controls will be notified
        // of the change by the mediator
    }
}
