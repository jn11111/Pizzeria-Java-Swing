import java.awt.Color;
import java.awt.Font;

import javax.swing.JRadioButton;

public class radiobutton extends JRadioButton {
    radiobutton(String title) {
        this.setText(title);
        this.setFont(new Font("Arial", Font.PLAIN, 16));
        this.setOpaque(false);
        this.setForeground(Color.white);
    }
}
