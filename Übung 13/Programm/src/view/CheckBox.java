package view;

import javax.swing.*;
import java.awt.*;

public class CheckBox extends JFrame {

    private JLabel text1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JLabel text2;
    private JLabel text3;

    public CheckBox() {
        super("Checkbox");

        setSize(300, 300);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        JPanel pCheck = new JPanel();
        pCheck.setLayout(new BoxLayout(pCheck, BoxLayout.Y_AXIS));

        //Text 1
        text1 = new JLabel("Cappuccino mit: ");
        pCheck.add(text1, BorderLayout.NORTH);

        JPanel pBoxen = new JPanel();
        pBoxen.setLayout(new BoxLayout(pBoxen, BoxLayout.Y_AXIS));

        //Checkbox 1
        checkBox1 = new JCheckBox("Milch");
        pBoxen.add(checkBox1, BorderLayout.NORTH);

        //Checkbox 2
        checkBox2 = new JCheckBox("Sahne");
        pBoxen.add(checkBox2, BorderLayout.CENTER);

        //Checkbox 3
        checkBox3 = new JCheckBox("Zucker");
        pBoxen.add(checkBox3, BorderLayout.SOUTH);

        pCheck.add(pBoxen, BorderLayout.CENTER);

        //Text 2
        text2 = new JLabel("Der Cappuccino wurde gewählt mit");
        pCheck.add(text2, BorderLayout.SOUTH);

        //Text 3
        text3 = new JLabel("Ausgabe");
        text3.setFont(new Font("Arial", Font.BOLD, 12));

        JPanel all = new JPanel();
        all.setLayout(new BoxLayout(all, BoxLayout.Y_AXIS));
        all.add(pCheck, BorderLayout.NORTH);
        all.add(text3, BorderLayout.SOUTH);

        container.add(all);

        setVisible(true);
    }

}
