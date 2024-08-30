package miscellenious.factorymethod;

public class JsonMessageCreator extends MessageCreator {
    @Override
    public Message getMessage() {
        return new JsonMessage();
    }
}
