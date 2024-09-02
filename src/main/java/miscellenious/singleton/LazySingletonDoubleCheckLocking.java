package miscellenious.singleton;

public class LazySingletonDoubleCheckLocking {
    private LazySingletonDoubleCheckLocking() {

    }

    private volatile static LazySingletonDoubleCheckLocking INSTANCE;

    public static LazySingletonDoubleCheckLocking getInstance() {
        if (null == INSTANCE) {
            synchronized (LazySingletonDoubleCheckLocking.class) {
                if (null == INSTANCE) {
                    INSTANCE = new LazySingletonDoubleCheckLocking();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "Lazy singleton with double checking";
    }
}
