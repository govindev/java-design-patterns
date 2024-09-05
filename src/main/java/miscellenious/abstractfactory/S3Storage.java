package miscellenious.abstractfactory;

public class S3Storage implements Storage {
    private long memBytes;

    public S3Storage(long memBytes) {
        this.memBytes = memBytes;
        System.out.println("s3 storage created");
    }

    public String getId() {
        return "s3 storage";
    }
}
