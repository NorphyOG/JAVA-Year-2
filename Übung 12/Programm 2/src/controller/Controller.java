package controller;

import model.Model;
import view.Aufgabe2;
import view.TestFenster;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Controller implements ActionListener {

    private Aufgabe2 aufgabe2;
    private Model model;

    public static void main(String[] args) {
        new Controller();
    }

    public Controller() {
        aufgabe2 = new Aufgabe2();
        model = new Model();
        aufgabe2.getButton1().addActionListener(this);
        aufgabe2.getButton2().addActionListener(this);
        aufgabe2.getEingabe_text().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            if (e.getActionCommand().equals(aufgabe2.getButton1().getText()) || e.getActionCommand().equals("ENTER")) {
                aufgabe2.getAusgabe_text().setText(model.grossSchreiben(aufgabe2.getEingabe_text().getText()));
            }
            if (e.getActionCommand().equals(aufgabe2.getButton2().getText())) {
                System.exit(0);
            }

        } catch (Exception exception) {
            aufgabe2.getStatus_text().setText(exception.getMessage());
        }

    }

}
