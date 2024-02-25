import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class gridbag extends JPanel {

    gridbag(JRadioButton jRadioButton, JLabel jLabel) {
        this.setPreferredSize(new Dimension(180, 38));

        GridBagLayout layout = new GridBagLayout();

        this.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.WEST;
        c.fill = GridBagConstraints.BASELINE;
        c.insets = new Insets(5, 0, 5, 10);
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 0;
        this.add(jRadioButton, c);
        c.anchor = GridBagConstraints.EAST;
        c.gridy = 0;
        c.gridx = 1;

        this.add(jLabel, c);
        this.setOpaque(false);
    }
}