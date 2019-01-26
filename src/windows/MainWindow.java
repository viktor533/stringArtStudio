package windows;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class MainWindow extends JFrame {
    private final Dimension prefPanelSize = new Dimension(450, 450);

    public MainWindow() {
        this.setSize(prefPanelSize);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("press");
        GraphicPanel graphicPanel = new GraphicPanel();
        this.add(graphicPanel);
//        this.add(button);

    }
}
