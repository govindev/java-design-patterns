package miscellenious.factorymethod;

public abstract class MessageCreator {
    public Message getMessage() {
        Message message = createMessage();

        message.addDefaulthHeaders();
        message.encrypt();

        return message;
    }

    protected abstract Message createMessage();
}
