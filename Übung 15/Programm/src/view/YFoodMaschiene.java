package view;

import javax.swing.*;
import java.awt.*;

public class YFoodMaschiene extends JFrame {

    private JTextField iEingabe;
    private JLabel lEingabe;

    private JTextArea oAusgabe;

    private JTextField oStatus;

    private JButton bYFoodZubereiten;
    private JButton bWasserAuffuellen;
    private JButton bPulverAufuellen;
    private JButton bReinigen;
    private JButton bInfo;
    private JButton bEnde;

    public YFoodMaschiene() {
        super("YFood Maschiene");

        setSize(600, 420);
        setResizable(false);

        Container container = getContentPane();

        //Buttons Panel
        JPanel pButtons = new JPanel();
        pButtons.setLayout(new GridLayout(6, 1, 3, 5));

        //Button YFood Zubereiten
        bYFoodZubereiten = new JButton("YFood Zubereiten");
        bYFoodZubereiten.setActionCommand("YFOOD_ZUBEREITEN");
        pButtons.add(bYFoodZubereiten);

        //Button Wasser Aufüllen
        bWasserAuffuellen = new JButton("Wasser auffüllen");
        bWasserAuffuellen.setActionCommand("WASSER_AUFUELLEN");
        pButtons.add(bWasserAuffuellen);

        //Button Pulver Aufüllen
        bPulverAufuellen = new JButton("Pulver auffüllen");
        bPulverAufuellen.setActionCommand("PULVER_AUFFUELLEN");
        pButtons.add(bPulverAufuellen);

        //Button Reinigen
        bReinigen = new JButton("Reinigen");
        bReinigen.setActionCommand("REINIGEN");
        pButtons.add(bReinigen);

        //Button Info
        bInfo = new JButton("Informationen");
        bInfo.setActionCommand("INFO");
        pButtons.add(bInfo);

        //Button Ende
        bEnde = new JButton("Ende");
        bEnde.setActionCommand("ENDE");
        pButtons.add(bEnde);


        //Eingabe Panel
        JPanel pEingabe = new JPanel();

        //Einagbe Text
        lEingabe = new JLabel("Eingabe: ");
        pEingabe.add(lEingabe, BorderLayout.WEST);

        //Eingabe Feld
        iEingabe = new JTextField(18);
        iEingabe.setActionCommand("EINGABE");
        pEingabe.add(iEingabe, BorderLayout.EAST);


        //Ausgabe Feld
        oAusgabe = new JTextArea(20, 40);
        oAusgabe.setEditable(false);


        //Ein & Ausgabe Panel
        JPanel pEinAus = new JPanel();
        pEinAus.setLayout(new BoxLayout(pEinAus, BoxLayout.Y_AXIS));
        pEinAus.add(pEingabe, BorderLayout.NORTH);
        pEinAus.add(oAusgabe, BorderLayout.SOUTH);


        //Status Feld
        oStatus = new JTextField("");
        oStatus.setActionCommand("STATUS");
        oStatus.setEditable(false);

        //All Panel
        JPanel pAll = new JPanel();
        pAll.add(pButtons, BorderLayout.WEST);
        pAll.add(pEinAus, BorderLayout.EAST);

        //Status Panel
        JPanel pStatus = new JPanel();
        pStatus.setLayout(new BoxLayout(pStatus, BoxLayout.Y_AXIS));
        pStatus.add(pAll);
        pStatus.add(oStatus);

        container.add(pStatus);

        setVisible(true);
    }

    public JTextField getoStatus() {
        return oStatus;
    }

    public JTextField getiEingabe() {
        return iEingabe;
    }

    public JTextArea getoAusgabe() {
        return oAusgabe;
    }

    public JButton getbYFoodZubereiten() {
        return bYFoodZubereiten;
    }

    public JButton getbWasserAuffuellen() {
        return bWasserAuffuellen;
    }

    public JButton getbPulverAufuellen() {
        return bPulverAufuellen;
    }

    public JButton getbReinigen() {
        return bReinigen;
    }

    public JButton getbInfo() {
        return bInfo;
    }

    public JButton getbEnde() {
        return bEnde;
    }
}
