package miscellenious.objectpool;

import javafx.geometry.Point2D;

public interface Image extends Poolable {
    void draw();
    void setLocation(Point2D location);
    Point2D getLocation();

}
