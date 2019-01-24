package geomentry;

public class Point {
    private double x;
    private double y;
    public static final double EPS = 0.0001;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Point X) {
        return ((Math.abs(X.getX() - this.x) < EPS) && (Math.abs(X.getY() - this.y) < EPS));
    }

    public void moveByVector(double x, double y) {
        this.x += x;
        this.y += y;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
