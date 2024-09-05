package miscellenious.abstractfactory;

public class AwsResourceFactory implements ResourceFactory {
    public Instance createInstance(Instance.Type type) {
        return new Ec2Instance(type);
    }

    public Storage createStorage(long memBytes) {
        return new S3Storage(memBytes);
    }
}
