package geomentry;

import java.util.Iterator;

public class Segment {
    private Side side1;
    private Side side2;
    private int count;
    private Line lines[];
    private int color;

    public Segment() {
    }

    public Segment(Side side1, Side side2) {
        this.side1 = side1;
        this.side2 = side2;
    }


    public void generateLines() throws CalculateGeometryException {
        Iterator<Point> iterator1 = side1.getIterator(count);
        Iterator<Point> iterator2 = side2.getIterator(count);
        Point cur1, cur2;

        lines = new Line[count];
        for (int i = 0; i < count; i++) {
            if (!iterator1.hasNext() || !iterator2.hasNext() ) {
                throw new CalculateGeometryException("Some errors in calculating serment lines!");
            }
            cur1 = iterator1.next();
            cur2 = iterator2.next();
            lines[i] = new Line(cur1, cur2);
        }
    }


    public Side getSide1() {
        return side1;
    }

    public void setSide1(Side side1) {
        this.side1 = side1;
    }

    public Side getSide2() {
        return side2;
    }

    public void setSide2(Side side2) {
        this.side2 = side2;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
