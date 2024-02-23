import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class Frame extends JFrame {
    // method to generate a frame
    public void init() {
        // config of the frame
        this.setBackground(Color.lightGray);
        this.setDefaultCloseOperation(3);
        this.setTitle("Pizzeria");
        this.setLocationRelativeTo(null);
        this.setSize(680, 720);
        this.setResizable(false);
        // frame layout set up
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);

        // adding component to layout

        // atlast setting visibility
        this.setVisible(true);
    }
}