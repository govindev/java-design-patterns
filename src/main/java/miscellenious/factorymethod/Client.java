package miscellenious.factorymethod;

public class Client {
    public static void main(String[] args) {
        MessageCreator textMessageCreator = new TextMessageCreator();
        printMessage(textMessageCreator);
        MessageCreator jsonMessageCreator = new JsonMessageCreator();
        printMessage(jsonMessageCreator);
    }

    public static void printMessage(MessageCreator messageCreator) {
        System.out.println("Message is : " + messageCreator.getMessage().getContent());
    }
}
