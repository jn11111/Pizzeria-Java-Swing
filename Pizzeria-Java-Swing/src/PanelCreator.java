import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelCreator extends JPanel {
    // Constructor
    PanelCreator(HashMap<String, String> criteria, String title) {
        // panel configurations
        this.setBackground(Color.CYAN);
        this.setPreferredSize(new Dimension(190, 200));
        this.setBackground(Color.DARK_GRAY);

        // panel layout configuration
        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);

        // adding initial component
        JLabel jLabel = new label(title);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(layout);
        jPanel.add(jLabel);
        jPanel.setOpaque(false);
        jPanel.setPreferredSize(new Dimension(190, 30));
        this.add(jPanel);

        JRadioButton[] jRadioButton = new JRadioButton[criteria.size()];
        JLabel[] jLabelforjRadioButton = new JLabel[criteria.size()];
        ButtonGroup buttonGroup = new ButtonGroup();

        // set loops hashmap index
        int x = 0;
        // instantiating radio button and labels
        for (String i : criteria.keySet()) {
            jRadioButton[x] = new radiobutton(i);
            buttonGroup.add(jRadioButton[x]);

            jLabelforjRadioButton[x] = new label(criteria.get(i).toString());
            this.add(new gridbag(jRadioButton[x], jLabelforjRadioButton[x]));
            x++;
        }

    }

}