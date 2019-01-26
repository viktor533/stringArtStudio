package windows;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class GraphicPanel extends JPanel {
    //    private final Timer timer = new Timer(20, this);  // Create a timer that will go off every 20 ms
    Line2D horizontalLine; // Declare your variables here, but don't initialize them
    Line2D verticalLine;   // That way, they can be accessed later in actionPerformed and repaint

    // You might want to try frame.setResizable(false) if you want your frame
    // and your panel to stay the same size.
    private final Dimension prefPanelSize = new Dimension(450, 450);

    public GraphicPanel(){
        super();    // Call the constructor of JPanel, the class this subclasses.
        this.setSize(prefPanelSize);
        horizontalLine = new Line2D.Float(0, 40, prefPanelSize.width, 40);
        verticalLine = new Line2D.Float(prefPanelSize.width / 2, 0,
                prefPanelSize.width / 2, prefPanelSize.height);

//        timer.start();  // Start the timer
    }


    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);  // fixes the immediate problem.
        Graphics2D g2 = (Graphics2D) g;

        g2.draw(horizontalLine);
        g2.draw(verticalLine);
    }
}
