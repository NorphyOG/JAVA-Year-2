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

    private JTextField status;

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
        checkBox1.setActionCommand("C1");
        pBoxen.add(checkBox1, BorderLayout.NORTH);

        //Checkbox 2
        checkBox2 = new JCheckBox("Sahne");
        checkBox2.setActionCommand("C2");
        pBoxen.add(checkBox2, BorderLayout.CENTER);

        //Checkbox 3
        checkBox3 = new JCheckBox("Zucker");
        checkBox3.setActionCommand("C3");
        pBoxen.add(checkBox3, BorderLayout.SOUTH);

        pCheck.add(pBoxen, BorderLayout.CENTER);

        //Text 2
        text2 = new JLabel("Der Cappuccino wurde gewählt mit");
        pCheck.add(text2, BorderLayout.SOUTH);

        //Text 3
        text3 = new JLabel("");
        text3.setFont(new Font("Arial", Font.BOLD, 12));

        JPanel all = new JPanel();
        all.setLayout(new BoxLayout(all, BoxLayout.Y_AXIS));
        all.add(pCheck, BorderLayout.NORTH);
        all.add(text3, BorderLayout.CENTER);

        //Stauts
        status = new JTextField("");
        all.add(status, BorderLayout.SOUTH);

        container.add(all);

        setVisible(true);
    }

    public JCheckBox getCheckBox1() {
        return checkBox1;
    }

    public void setCheckBox1(JCheckBox checkBox1) {
        this.checkBox1 = checkBox1;
    }

    public JCheckBox getCheckBox2() {
        return checkBox2;
    }

    public void setCheckBox2(JCheckBox checkBox2) {
        this.checkBox2 = checkBox2;
    }

    public JCheckBox getCheckBox3() {
        return checkBox3;
    }

    public void setCheckBox3(JCheckBox checkBox3) {
        this.checkBox3 = checkBox3;
    }

    public JTextField getStatus() {
        return status;
    }

    public void setStatus(JTextField status) {
        this.status = status;
    }
}
