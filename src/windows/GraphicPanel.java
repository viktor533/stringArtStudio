package windows;

import geomentry.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class GraphicPanel extends JPanel  {
    private ArrayList<Side> sids;
    private Project project;
    private Layer currentLayer;

    public GraphicPanel(Project project) {
        this.project = project;
        if (project.countOdLayers() == 0) {
            currentLayer = new Layer();
            project.addLayer(currentLayer);
        } else {
            currentLayer = project.getLayer(0);
        }

        if (currentLayer.getCountOfSegments() == 0) {
            sids = new ArrayList<Side>();
        } else {
            sids = currentLayer.getAllSides();
        }
        setSize(300, 300);
        addMouseMotionListener(new GraphicMotionListener());
        addMouseListener(new GraphicMouseListener());
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)(g);
        for (Side side : sids) {
            g2.drawLine(side.getFirst().getX(), side.getFirst().getY(), side.getLast().getX(), side.getLast().getY());
        }

        for (Segment segment : currentLayer.getSegments()) {
            for (Line line : segment.getLines()) {
                g2.drawLine(line.getA().getX(), line.getA().getY(), line.getB().getX(), line.getB().getY());
            }
        }
    }

    public void addSegment() {
        if (sids.size() >= 2) {
            try {
                Segment newSegment = new Segment(sids.get(sids.size() - 1), sids.get(sids.size() - 2));
                newSegment.generateLines();
                currentLayer.addSegment(newSegment);
            } catch (CalculateGeometryException e) {
                System.err.println(e.getMessage());
            }

        }
        repaint();
    }

    class GraphicMouseListener implements MouseListener {
        private int pushX;
        private int pushY;

        @Override
        public void mouseClicked(MouseEvent e) { }

        @Override
        public void mousePressed(MouseEvent me) {
            pushX = me.getX();
            pushY = me.getY();
            sids.add(new Line(pushX, pushY, me.getX(), me.getY()));
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            sids.get(sids.size()-1).setLast(me.getX(), me.getY());
            repaint();
        }

        @Override
        public void mouseEntered(MouseEvent e) { }

        @Override
        public void mouseExited(MouseEvent e) { }
    }

    class GraphicMotionListener implements MouseMotionListener {
        @Override
        public void mouseDragged(MouseEvent me) {
            sids.get(sids.size() - 1).setLast(me.getX(), me.getY());
            repaint();

        }

        public void mouseMoved(MouseEvent me) {
        }
    }
}
