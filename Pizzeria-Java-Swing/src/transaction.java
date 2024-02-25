import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JPanel;

public class transaction extends JPanel {
    transaction() {
        this.setBackground(Color.gray);

        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.BASELINE;
        c.ipady = 20;
        c.weighty = 0;
        c.weightx = 1;

        label label = new label("Cost: $");
        c.gridy = 0;
        c.gridx = 0;
        this.add(label);
        DecimalFormat dFormat = new DecimalFormat("#.##");
        JButton cost = new JButton("Cost");
        cost.getModel().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Cost: $" + dFormat.format(costpanel.calculateCost()));
            }
        });
        c.gridy = 1;
        c.gridx = 0;

        this.add(cost, c);

        JButton clear = new JButton("Clear");
        clear.getModel().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                costpanel.clear();
                label.setText("Cost: $");
            }
        });
        c.gridy = 2;
        c.gridx = 0;
        this.add(clear, c);

        JButton checkout = new JButton("Checkout");
        checkout.getModel().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                costpanel.createReceipt();
            }
        });
        c.gridy = 3;
        c.gridx = 0;
        this.add(checkout, c);

    }
}
