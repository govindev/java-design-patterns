package miscellenious.abstractfactory;

public class GoogleCloudComputeEngine implements Instance {
    private Type type;
    private Storage storage;

    public GoogleCloudComputeEngine(Type type) {
        this.type = type;
    }

    public void attachStorage(Storage storage) {
        this.storage = storage;
        System.out.println("Attached storage to the google cloud compute engine");
    }


    public void start() {
        System.out.println("Google cloud compute engine instance started");
    }

    public void stop() {
        System.out.println("Google cloud compute engine instance is stopped");
    }
}
