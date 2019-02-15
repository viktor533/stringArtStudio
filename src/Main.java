import geomentry.*;
import windows.MainWindow;

public class Main {
    public static void main(String[] args) {
        Side line = new Line();
        Side circle = new CircleSector();
        Segment segment1 = new Segment(line, circle);
        try {
            segment1.generateLines();
        } catch (CalculateGeometryException e) {
            System.out.println(e.getMessage());
        }

        MainWindow s = new MainWindow();
        s.setVisible(true);

    }
}
