package miscellenious.abstractfactory;

public interface ResourceFactory {
    Instance createInstance(Instance.Type type);
    Storage createStorage(long memBytes);
}
