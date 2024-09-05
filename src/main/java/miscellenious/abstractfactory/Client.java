package miscellenious.abstractfactory;

public class Client {
    public void createResource(ResourceFactory resourceFactory) {
        Storage storage = resourceFactory.createStorage(982398);
        Instance instance = resourceFactory.createInstance(Instance.Type.LARGE);
        instance.start();
        instance.attachStorage(storage);
        instance.stop();
    }

    public static void main(String[] args) {
        Client client = new Client();
        ResourceFactory aws = new AwsResourceFactory();
        client.createResource(aws);

        ResourceFactory googleCloud = new GoogleCloudResourceFactory();
        client.createResource(googleCloud);
    }
}
