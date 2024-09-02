package miscellenious.singleton;

public class LazySingletonByInnerClass {

    private LazySingletonByInnerClass() {

    }

    private static class LazySingletonHolder {
        final static LazySingletonByInnerClass INSTANCE = new LazySingletonByInnerClass();
    }

    public static LazySingletonByInnerClass getInstance() {
        return LazySingletonHolder.INSTANCE;
    }

    @Override
    public String toString() {
        return "Lazy singleton by inner class holder";
    }
}
