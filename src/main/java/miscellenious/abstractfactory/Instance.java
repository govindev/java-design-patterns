package miscellenious.abstractfactory;

public interface Instance {
    enum Type {LARGE, MEDIUM, SMALL};
    void attachStorage(Storage storage);

    void start();
    void stop();
}
