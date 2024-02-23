import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class label extends JLabel {
    label(String title) {
        this.setText(title);
        this.setFont(new Font("Arial", Font.BOLD, 16));
        this.setForeground(Color.white);
        this.setHorizontalAlignment(SwingConstants.LEADING);
    }
}
