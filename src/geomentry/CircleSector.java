package geomentry;

import java.util.Iterator;

public class CircleSector extends Side {
    private Point O;
    private double radius;

    private double angleA;
    private double angleB;

    public CircleSector() {

    }

    public CircleSector(Point O, double radius, Point A, Point B) {
        this.O = O;
        this.radius = radius;
        this.A = A;
        this.B = B;
        this.calcAngels();
    }

    public CircleSector(Point O, double radius, double angleA, double angleB) {
        this.O = O;
        this.radius = radius;
        this.angleA = angleA;
        this.angleB = angleB;
        this.calcPoints();
    }


    private void calcAngels() {
        // TODO:
    }

    private void calcPoints() {
        // TODO:
    }

    public double getLength() {
        return radius*Math.abs(angleB - angleA);
    }

    public Iterator<Point> getIterator(int distance) {
        // TODO:
        return null;
    }


}
