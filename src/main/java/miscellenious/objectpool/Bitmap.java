package miscellenious.objectpool;

import javafx.geometry.Point2D;

public class Bitmap implements Image {
    private final String name;
    private Point2D location;


    public Bitmap(String name) {
        this.name = name;
    }

    public void setLocation(Point2D location) {
        this.location = location;
    }

    public Point2D getLocation() {
        return location;
    }

    public void draw() {
        System.out.println("Drawing " + name + " @ " + location);
    }

    public void reset() {
        location = null;
        System.out.println("Bitmap is reset");
    }
}
