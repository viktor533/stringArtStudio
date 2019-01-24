package geomentry;

import java.util.Iterator;

public abstract class Side {

    public abstract double getLength();

    public abstract Iterator<Point> getIterator(int distance);
}
