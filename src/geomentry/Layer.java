package geomentry;

import java.util.ArrayList;
import java.util.List;

public class Layer {
    private ArrayList<Segment> segments;

    public Layer() {
        segments = new ArrayList<Segment>();
    }

    public void generateAll() throws CalculateGeometryException {
        for (Segment segment : segments) {
            segment.generateLines();
        }
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void addSegment(Segment segment) {
        segments.add(segment);
    }

    public int getCountOfSegments() {
        return segments.size();
    }

    public ArrayList<Side> getAllSides() {
        ArrayList<Side> allSides = new ArrayList<Side>();
        for (Segment segment : segments) {
            allSides.add(segment.getSide1());
            allSides.add(segment.getSide2());
        }
        return allSides;
    }

//    public void setSegments(List<Segment> segments) {
//        this.segments = segments
//    }


}
