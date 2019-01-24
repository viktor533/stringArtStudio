package geomentry;

import java.util.Iterator;

public class Line extends Side {
    private Point A;
    private Point B;

    public Line() {
        A = new Point();
        B = new Point();
    }

    public Line(double x1, double y1, double x2, double y2) {
        A = new Point(x1, y1);
        B = new Point(x2, y2);
    }

    public Line(Point A, Point B) {
        this.A = A;
        this.B = B;
    }

    @Override
    public double getLength() {
        return Math.sqrt((this.B.getX() - this.A.getX()) * (this.B.getX() - this.A.getX()) +
                (this.B.getY() - this.A.getY()) * (this.B.getY() - this.A.getY()));

    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    public Iterator<Point> getIterator(int count) {
        return new LineIterator(this.A, this.B, count);
    }


    class LineIterator implements Iterator {
        private Point current;
        private Point end;
        private double count;
        private double incrementX;
        private double incrementY;
        private boolean isFirst;


        public LineIterator(Point start, Point end, int count) {
            this.current = start;
            this.end = end;
            calcIncrements(count);
            isFirst = true;
        }

        private void calcIncrements(double count) {
            incrementX = (this.end.getX() - this.current.getX())/count;
            incrementY = (this.end.getY() - this.current.getY())/count;
        }

        @Override
        public boolean hasNext() {
            return !(current.equals(end));
        }

        @Override
        public Point next() {
            if (isFirst) {
                isFirst = false;
                return current;
            }
            this.current.moveByVector(incrementX, incrementY);
            return current;
        }
    }


}