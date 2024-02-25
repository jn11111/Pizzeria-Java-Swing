import java.awt.Color;
import java.awt.Dimension;
import java.util.Stack;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class costpanel extends JPanel {
    static label[] labels = new label[5];
    static Stack<Float> costs = new Stack<>();
    static Stack<String> names = new Stack<>();
    static float total = 0;

    costpanel() {
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(175, 200));

        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        this.setLayout(layout);
        for (int i = 0; i < 5; i++) {
            labels[i] = new label("");
            this.add(labels[i]);
        }
    }

    public static void updateCost(String name, String cost, int index) {
        if (labels[index].getText() != "") {
            String[] getPrev = labels[index].getText().split(":::");
            costs.remove(Float.parseFloat(getPrev[1].toString().replace("$", "")));
            names.remove(getPrev[0].toString().replaceAll(" ", ""));
            for (String n : names) {
                System.out.println(n);
            }
            cost = cost.replace("$", "");
            costs.add(Float.parseFloat(cost));
            names.add(name);
        } else {
            cost = cost.replace("$", "");
            costs.add(Float.parseFloat(cost));
            names.add(name);
        }
        labels[index].setText("  " + name + ":::" + cost);
        labels[index].setForeground(Color.black);
    }

    public static float calculateCost() {
        total = 0;
        for (float f : costs) {
            total += f;
        }
        return total;
    }

    public static void clear() {
        total = 0;
        costs.clear();
        names.clear();
        for (label l : labels) {
            l.setText("");
        }
    }

    public static void createReceipt() {
        for (float f : costs) {
            System.out.println(f);
        }
        for (String f : names) {
            System.out.println(f);
        }
        new joptionpane(names, costs);
    }

}
