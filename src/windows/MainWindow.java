package windows;

import geomentry.Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

public class MainWindow extends JFrame {
    public MainWindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JPanel mainPanel = new JPanel(new FlowLayout());
//        setContentPane(mainPanel);
        setSize(450,450);

        Project project = new Project();
        GraphicPanel graphicPanel = new GraphicPanel(project);
        setContentPane(graphicPanel);
//        mainPanel.add(graphicPanel);
//
        JButton button = new JButton("press");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                graphicPanel.addSegment();
            }
        });
        add(button);
//
//        mainPanel.updateUI();


    }

//    public void paint(Graphics g) {
//        super.paint(g);  // fixes the immediate problem.
//        Graphics2D g2 = (Graphics2D) g;
//        Line2D lin = new Line2D.Float(100, 100, 250, 260);
//        g2.draw(lin);
//    }

//    public static void main(String []args){
//        MainWindow s = new MainWindow();
//        s.setVisible(true);
//    }
}
