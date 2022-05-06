package view;

import javax.swing.*;
import java.awt.*;

public class Uebersetzer extends JFrame{

    private JLabel sprache1;
    private JTextField sprache1_text;
    private JLabel sprache2;
    private JTextField sprache2_text;

    private JButton button1;

    public Uebersetzer() {

        super("Übersetzer");

        setSize(380, 110);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        JPanel pUebersezer = new JPanel();
        pUebersezer.setLayout(new BoxLayout(pUebersezer, BoxLayout.Y_AXIS));

        //Sprache 1
        JPanel pSprache1Feld = new JPanel();
        sprache1 = new JLabel("Englisch: ");
        pSprache1Feld.add(sprache1);
        sprache1_text = new JTextField(15);
        pSprache1Feld.add(sprache1_text);
        pUebersezer.add(pSprache1Feld, BorderLayout.NORTH);

        //Sprache 2
        JPanel pSprache2Feld = new JPanel();
        sprache2 = new JLabel("Deutsch: ");
        pSprache2Feld.add(sprache2);
        sprache2_text = new JTextField(15);
        pSprache2Feld.add(sprache2_text);
        pUebersezer.add(pSprache2Feld, BorderLayout.SOUTH);


        JPanel pButtons = new JPanel();

        //Button 1
        button1 = new JButton("GO");
        pButtons.add(button1, BorderLayout.WEST);

        JPanel all = new JPanel();

        all.add(pUebersezer, BorderLayout.WEST);
        all.add(pButtons, BorderLayout.EAST);


        container.add(all, BorderLayout.NORTH);


        setVisible(true);
    }
}
