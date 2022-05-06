package view;

import javax.swing.*;
import java.awt.*;

public class TestFenster extends JFrame {

    private JLabel label;
    private JTextField textField;
    private JButton button;

    public TestFenster() {
        super("TestFenster");

        setSize(500, 500);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        label = new JLabel("Hallo ich bin ein Fenster", SwingConstants.CENTER);
        label.setFont(new Font("Verdana", Font.BOLD, 24));
        container.add(label, BorderLayout.NORTH);

        textField = new JTextField("Text Field", 30);
        JPanel pEingabe = new JPanel();
        pEingabe.add(textField);
        container.add(pEingabe, BorderLayout.CENTER);

        button = new JButton("LOS!");
        JPanel pButton = new JPanel();
        pButton.add(button);
        container.add(pButton, BorderLayout.SOUTH);


        setVisible(true);
    }

}
