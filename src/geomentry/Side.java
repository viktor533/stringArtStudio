package geomentry;

import java.util.Iterator;

public abstract class Side {

    protected Point A;
    protected Point B;

    public abstract double getLength();

    public abstract Iterator<Point> getIterator(int distance);

    public Point getFirst() {
        return A;
    }

    public Point getLast() {
        return B;
    }

    public void setFirst(int x, int y) {
        A.setX(x);
        A.setY(y);
    }

    public void setLast(int x, int y) {
        B.setX(x);
        B.setY(y);
    }
}
