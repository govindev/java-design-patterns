package miscellenious.factorymethod;

public class JsonMessage extends Message {
    @Override
    public String getContent() {
        return "{\"message\" : \"json message\"}";
    }
}
