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
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(5, 2, 3, 5);
        // creating menu
        HashMap<String, String> criteria = new HashMap<String, String>();
        criteria.clear();
        criteria.put("Thin", "$1.75");
        criteria.put("Thick", "$3");

        // adding component to layout
        c.gridx = 0;
        c.gridy = 0;
        PanelCreator crust = new PanelCreator(criteria, "Crust");
        this.add(crust, c);

        criteria.clear();
        criteria.put("Small", "$2");
        criteria.put("Medium", "$3.2");
        criteria.put("Large", "$4.27");
        c.gridx = 1;
        c.gridy = 0;

        PanelCreator size = new PanelCreator(criteria, "Size");
        this.add(size, c);

        criteria.clear();
        criteria.put("Hawaiian", "$12.50");
        criteria.put("Pepperoni", "$13.75");
        criteria.put("Ham & Cheese", "$10");
        criteria.put("Vegan", "$12");
        criteria.put("Cheese", "$9");

        c.gridx = 2;
        c.gridy = 0;
        c.gridheight = 2;
        c.gridwidth = 1;

        PanelCreator variation = new PanelCreator(criteria, "Variation");
        this.add(variation, c);

        criteria.clear();
        criteria.put("Take-Out", "$1.75");
        criteria.put("Dine-In", "$.25");

        c.gridx = 0;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 1;

        PanelCreator dine = new PanelCreator(criteria, "Dine");
        this.add(dine, c);

        criteria.clear();
        criteria.put("Coke", "$2.99");
        criteria.put("Sprite", "$2.79");

        c.gridx = 1;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 1;

        PanelCreator drinks = new PanelCreator(criteria, "Drinks");
        this.add(drinks, c);

        createCostPanel();
        // atlast setting visibility
        this.setVisible(true);
    }

    public void createCostPanel() {
        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(5, 2, 3, 5);
        c.gridx = 0;
        c.gridy = 2;
        c.weighty = 1;
        c.weightx = 0;
        c.anchor = GridBagConstraints.NORTHWEST;
        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = 2;
        c.gridheight = 1;

        costpanel costpanel = new costpanel();
        this.add(costpanel, c);

        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 2;
        c.gridy = 2;

        this.add(new transaction(), c);

    }
}