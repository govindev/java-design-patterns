package miscellenious.abstractfactory;

public class GoogleCloudResourceFactory implements ResourceFactory {
    public Instance createInstance(Instance.Type type) {
        return new GoogleCloudComputeEngine(type);
    }

    public Storage createStorage(long memBytes) {
        return new GoogleCloudStorage(memBytes);
    }
}
