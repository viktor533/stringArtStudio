package geomentry;

public class Layer {
    private Segment[] segments;

    public Layer() {

    }

    public void generateAll() throws CalculateGeometryException {
        for (int i = 0; i < segments.length; i++) {
            segments[i].generateLines();
        }
    }

    public Segment[] getSegments() {
        return segments;
    }

    public void setSegments(Segment[] segments) {
        this.segments = segments;
    }


}
