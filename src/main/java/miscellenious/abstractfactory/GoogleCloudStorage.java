package miscellenious.abstractfactory;

public class GoogleCloudStorage implements Storage {
    private long memBytes;
    public GoogleCloudStorage(long memBytes) {
        this.memBytes = memBytes;
        System.out.println("Google cloud storage created");
    }

    public String getId() {
        return "GoogleCloudComputeStorage";
    }


}
