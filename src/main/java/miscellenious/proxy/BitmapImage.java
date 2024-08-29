package miscellenious.proxy;

import java.awt.geom.Point2D;

public class BitmapImage implements Image {
    private Point2D location;
    private final String name;


    public BitmapImage(String name) {
        this.name = name;
    }

    @Override
    public void setLocation(Point2D point2D) {
        this.location = point2D;
    }

    @Override
    public Point2D getLocation() {
        return this.location;
    }

    @Override
    public void render() {
        System.out.println("Rendering the image "+ name + " from the bitmap image class");
    }
}
