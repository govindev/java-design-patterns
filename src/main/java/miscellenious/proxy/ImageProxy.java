package miscellenious.proxy;

import java.awt.geom.Point2D;


public class ImageProxy implements Image {
    private Point2D location;
    private String name;
    public ImageProxy(String name) {
        this.name = name;
    }

    private BitmapImage image;


    @Override
    public void setLocation(Point2D point2D) {
        if (null != image) {
            image.setLocation(point2D);
        }
        location = point2D;
    }

    @Override
    public Point2D getLocation() {
        if (null != image) {
            return image.getLocation();
        }
        return location;
    }

    public void render() {
        if (null == image) {
            image = new BitmapImage(name);
            if (null != location) {
                image.setLocation(location);
            }
        }
        image.render();
    }
}
