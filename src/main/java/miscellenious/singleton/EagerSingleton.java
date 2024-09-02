package miscellenious.singleton;

public class EagerSingleton {
    private EagerSingleton() {

    }

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "Eager singleton";
    }
}
