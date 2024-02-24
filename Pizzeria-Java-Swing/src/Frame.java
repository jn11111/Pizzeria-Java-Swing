import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.HashMap;

import javax.swing.JFrame;

public class Frame extends JFrame {
    // method to generate a frame
    public void init() {
        // config of the frame
        this.setBackground(Color.lightGray);
        this.setDefaultCloseOperation(3);
        this.setTitle("Pizzeria");
        this.setSize(680, 720);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        // frame layout set up
        GridBagLayout layout = new GridBagLayout();
        layout.maximumLayoutSize(this.getContentPane());
        this.setLayout(layout);

        GridBagConstraints c = new GridBagConstraints();

        c.anchor = GridBagConstraints.NORTHWEST;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(5, 2, 3, 5);
        // creating menu
        HashMap<String, String> criteria = new HashMap<String, String>();
        criteria.clear();
        criteria.put("Thin", "1,75$");
        criteria.put("Thick", "3$");

        // adding component to layout
        c.gridx = 0;
        c.gridy = 0;
        this.add(new PanelCreator(criteria, "Crust"), c);

        criteria.clear();
        criteria.put("Small", "2$");
        criteria.put("Medium", "3.2$");
        criteria.put("Large", "4.27$");
        c.gridx = 1;
        c.gridy = 0;
        this.add(new PanelCreator(criteria, "Size"), c);

        criteria.clear();
        criteria.put("Hawaiian", "7$");
        criteria.put("Pepperoni", "7$");
        criteria.put("Ham & Cheese", "7$");
        criteria.put("Vegan", "7$");
        criteria.put("Cheese", "7$");
        c.gridx = 2;
        c.gridy = 0;
        this.add(new PanelCreator(criteria, "Variation"), c);

        // atlast setting visibility
        this.setVisible(true);
    }
}