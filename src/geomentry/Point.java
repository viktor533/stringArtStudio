package geomentry;

public class Point {
    private int x;
    private int y;
    public static final double EPS = 0.0001;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
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


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
