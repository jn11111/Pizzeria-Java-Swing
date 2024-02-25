import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Stack;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class joptionpane extends JOptionPane {
    joptionpane(Stack<String> names, Stack<Float> cost) {
        Float total = costpanel.calculateCost();
        JPanel panel = new JPanel(new FlowLayout());
        panel.setPreferredSize(new Dimension(150, 180));
        panel.setBackground(Color.DARK_GRAY);
        System.out.println(names.size() + "" + cost.size());
        for (int i = 0; i < names.size(); i++) {
            panel.add(new label(names.elementAt(i) + " ::::::: " + "$" + cost.elementAt(i) + "\n"));
        }
        panel.add(new label("\n\nTotal $" + total.toString()));
        this.showMessageDialog(null, panel, "Checkout", 1);
    }
}
