package miscellenious.proxy;

import java.awt.geom.Point2D;

public class Client {
    public static void main(String[] args) {
        Image image = ImageFactory.getImage("nature_background");
        image.setLocation(new Point2D.Double());
        System.out.println("Location of the image : " + image.getLocation());
        image.render();
    }
}
