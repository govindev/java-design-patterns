package miscellenious.factorymethod;

public abstract class Message {

    public abstract String getContent();

    public void addDefaulthHeaders() {
        //Add some default headers;
    }

    public void encrypt() {
        // Add some encryption logic
    }

}
