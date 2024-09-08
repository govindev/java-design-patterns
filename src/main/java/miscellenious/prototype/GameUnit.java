package miscellenious.prototype;

import javafx.geometry.Point3D;

public abstract class GameUnit implements Cloneable  {
    Point3D position;

    public GameUnit() {
        this.position = Point3D.ZERO;
    }

    public GameUnit(float x, float y, float z) {
        this.position = new Point3D(x, y, z);
    }

    public Point3D getPosition() {
        return position;
    }

    public void move(Point3D direction, float distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }


    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit gameUnit = (GameUnit) super.clone();
        gameUnit.initialize();
        return gameUnit;
    }

    private void initialize() {
        this.position = Point3D.ZERO;
        reset();
    }

    protected abstract void reset();

}
