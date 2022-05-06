package view;

import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import java.awt.*;

public class RGBFenster extends JFrame {

    private JLabel ueberstschrift;

    private JLabel t1;
    private JTextField field1;

    private JLabel t2;
    private JTextField field2;

    private JLabel t3;
    private JTextField field3;

    private JButton button1;
    private JButton button2;

    private JPanel jPanel;
    private JPanel jAllCollors;
    private JPanel jButtons;


    public RGBFenster() {
        super("Hintergrund");

        setSize(300, 300);

        Container container = getContentPane();

        //Überschrift
        ueberstschrift = new JLabel("Hintergrundfaben");
        ueberstschrift.setFont(new Font("Ubuntu", Font.BOLD, 20));

        jAllCollors = new JPanel();

        //ROT
        JPanel jRot = new JPanel();
        jRot.setLayout(new BoxLayout(jRot, BoxLayout.Y_AXIS));
        t1 = new JLabel("Rot");
        field1 = new JTextField("255", 4);
        field1.setActionCommand("ROT");
        jRot.add(t1, BorderLayout.NORTH);
        jRot.add(field1, BorderLayout.SOUTH);

        //Grün
        JPanel jGruen = new JPanel();
        jGruen.setLayout(new BoxLayout(jGruen, BoxLayout.Y_AXIS));
        t2 = new JLabel("Grün");
        field2 = new JTextField("255",4);
        field2.setActionCommand("GRÜN");
        jGruen.add(t2, BorderLayout.NORTH);
        jGruen.add(field2, BorderLayout.SOUTH);

        //Blau
        JPanel jBlau = new JPanel();
        jBlau.setLayout(new BoxLayout(jBlau, BoxLayout.Y_AXIS));
        t3 = new JLabel("Blau");
        field3 = new JTextField("255",4);
        field3.setActionCommand("BLAU");
        jBlau.add(t3, BorderLayout.NORTH);
        jBlau.add(field3, BorderLayout.SOUTH);

        jAllCollors.add(jRot, BorderLayout.WEST);
        jAllCollors.add(jGruen, BorderLayout.CENTER);
        jAllCollors.add(jBlau, BorderLayout.EAST);

        //Buttons
        jButtons = new JPanel();
        button1 = new JButton("Refresh");
        button1.setActionCommand("B1");
        button2 = new JButton("Beenden");
        button2.setActionCommand("B2");
        jButtons.add(button1, BorderLayout.WEST);
        jButtons.add(button2, BorderLayout.EAST);

        jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        jPanel.add(ueberstschrift, BorderLayout.NORTH);
        jPanel.add(jAllCollors, BorderLayout.SOUTH);


        JPanel all = new JPanel();
        all.setLayout(new BoxLayout(all, BoxLayout.Y_AXIS));
        all.add(jPanel, BorderLayout.NORTH);
        all.add(jButtons, BorderLayout.SOUTH);

        container.add(all);

        setVisible(true);
    }

    public JPanel getjPanel() {
        return jPanel;
    }

    public void setjPanel(JPanel jPanel) {
        this.jPanel = jPanel;
    }

    public JPanel getjAllCollors() {
        return jAllCollors;
    }

    public void setjAllCollors(JPanel jAllCollors) {
        this.jAllCollors = jAllCollors;
    }

    public JPanel getjButtons() {
        return jButtons;
    }

    public void setjButtons(JPanel jButtons) {
        this.jButtons = jButtons;
    }

    public JTextField getField1() {
        return field1;
    }

    public void setField1(JTextField field1) {
        this.field1 = field1;
    }

    public JTextField getField2() {
        return field2;
    }

    public void setField2(JTextField field2) {
        this.field2 = field2;
    }

    public JTextField getField3() {
        return field3;
    }

    public void setField3(JTextField field3) {
        this.field3 = field3;
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }

}
