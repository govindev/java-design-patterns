package miscellenious.factorymethod;

public class TextMessageCreator extends MessageCreator {
    @Override
    public Message getMessage() {
        return new TextMessage();
    }
}
