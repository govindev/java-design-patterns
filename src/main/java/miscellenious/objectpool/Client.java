package miscellenious.objectpool;

import javafx.geometry.Point2D;

public class Client {
    public static final ObjectPool<Bitmap> bitmapObjectPool = new ObjectPool<>(() -> new Bitmap("image.bmp"), 5);
    public static void main(String[] args) {
        Bitmap bitmap1 = bitmapObjectPool.get();
        bitmap1.setLocation(new Point2D(10,20));
        Bitmap bitmap2 = bitmapObjectPool.get();
        bitmap2.setLocation(new Point2D(30, 40));

        bitmap1.draw();
        bitmap2.draw();

        bitmapObjectPool.release(bitmap1);
        bitmapObjectPool.release(bitmap2);
    }
}
