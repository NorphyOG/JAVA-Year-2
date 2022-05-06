package view;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{

    private JLabel name;
    private JTextField name_text;
    private JLabel password;
    private JTextField password_text;

    private JButton button1;
    private JButton button2;

    public Login() {

        super("Login");

        setSize(300, 170);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        JPanel pNamePassword = new JPanel();
        pNamePassword.setLayout(new BoxLayout(pNamePassword, BoxLayout.Y_AXIS));

        //Username
        JPanel pUsernameFeld = new JPanel();
        name = new JLabel("Username: ");
        pUsernameFeld.add(name);
        name_text = new JTextField(15);
        pUsernameFeld.add(name_text);
        pNamePassword.add(pUsernameFeld, BorderLayout.NORTH);

        //Password
        JPanel pPassowrdFeld = new JPanel();
        password = new JLabel("Password: ");
        pPassowrdFeld.add(password);
        password_text = new JTextField(15);
        pPassowrdFeld.add(password_text);
        pNamePassword.add(pPassowrdFeld, BorderLayout.SOUTH);

        container.add(pNamePassword, BorderLayout.NORTH);

        JPanel pButtons = new JPanel();

        //Button 1
        button1 = new JButton("Login");
        pButtons.add(button1, BorderLayout.WEST);

        //Button 2
        button2 = new JButton("Abbrechen");
        pButtons.add(button2, BorderLayout.EAST);

        container.add(pButtons, BorderLayout.SOUTH);

        setVisible(true);
    }

}
