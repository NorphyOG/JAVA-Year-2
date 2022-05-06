package controller;

import model.Model;
import view.YFoodMaschiene;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private YFoodMaschiene yFoodMaschiene;
    private Model model;

    public static void main(String[] args) {
        new Controller();
    }

    public Controller() {
        //View
        yFoodMaschiene = new YFoodMaschiene();

        //Model
        model = new Model();

        //Action Listener
        yFoodMaschiene.getiEingabe().addActionListener(this);
        yFoodMaschiene.getbYFoodZubereiten().addActionListener(this);
        yFoodMaschiene.getbWasserAuffuellen().addActionListener(this);
        yFoodMaschiene.getbPulverAufuellen().addActionListener(this);
        yFoodMaschiene.getbReinigen().addActionListener(this);
        yFoodMaschiene.getbInfo().addActionListener(this);
        yFoodMaschiene.getbEnde().addActionListener(this);

        //Info First Update
        model.infoUpdate(yFoodMaschiene);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            if (e.getActionCommand().equals("YFOOD_ZUBEREITEN")) {
                model.yFoodZubereitung(yFoodMaschiene);
            }

            if (e.getActionCommand().equals("WASSER_AUFUELLEN")) {
                model.wasserAuffuellen(Integer.parseInt(yFoodMaschiene.getiEingabe().getText()));
            }

            if (e.getActionCommand().equals("PULVER_AUFFUELLEN")) {
                model.pulverAuffuellen(Integer.parseInt(yFoodMaschiene.getiEingabe().getText()));
            }

            if (e.getActionCommand().equals("REINIGEN")) {
                model.reinigung(yFoodMaschiene);
            }

            if (e.getActionCommand().equals("ENDE")) {
                System.exit(0);
            }

            model.infoUpdate(yFoodMaschiene);
            model.reinigung(yFoodMaschiene);

        } catch (Exception exception) {
            yFoodMaschiene.getoStatus().setText(exception.getMessage());
        }


    }
}
