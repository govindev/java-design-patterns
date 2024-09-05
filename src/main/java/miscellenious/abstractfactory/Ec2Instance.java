package miscellenious.abstractfactory;

public class Ec2Instance implements Instance {
    private Type type;
    private Storage storage;

    public Ec2Instance(Type type) {
        this.type = type;
    }

    public void attachStorage(Storage storage) {
        this.storage = storage;
        System.out.println("Attached storage to the ec2 instance");
    }

    public void start() {
        System.out.println("EC2 Instance is started");
    }

    public void stop() {
        System.out.println("Ec2 Instance is stopped");
    }
}
