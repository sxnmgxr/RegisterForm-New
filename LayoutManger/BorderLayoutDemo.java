package LayoutManger;
import java.awt.*;
import javax.swing.*;


public class BorderLayoutDemo {

    JFrame f;
    BorderLayoutDemo() {
        f = new JFrame();

        //create buttons
        JButton b1 = new JButton("North");
        JButton b2 = new JButton("south");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("Wast");
        JButton b5 = new JButton("Center");

        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.CENTER);

        f.setSize(700,700);
        f.setVisible(true);

    }



    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
    
}
