package miscellenious.singleton;

public class Client {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton);

        LazySingletonDoubleCheckLocking lazySingletonDoubleCheckLocking = LazySingletonDoubleCheckLocking.getInstance();
        System.out.println(lazySingletonDoubleCheckLocking);

        LazySingletonByInnerClass lazySingletonByInnerClass = LazySingletonByInnerClass.getInstance();
        System.out.println(lazySingletonByInnerClass);

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton);
    }
}
