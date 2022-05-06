package controller;

import model.Model;
import view.CheckBox;
import view.RGBFenster;
import view.Uebersetzer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private Uebersetzer uebersetzer;
    private RGBFenster rgbFenster;
    private CheckBox checkBox;
    private Model model;


    public static void main(String[] args) {
        new Controller();
    }

    public Controller() {
        //Fenster
        uebersetzer = new Uebersetzer();
        rgbFenster = new RGBFenster();
        checkBox = new CheckBox();
        model = new Model();


        //Listener
        uebersetzer.getButton1().addActionListener(this);
        uebersetzer.getSprache1_text().addActionListener(this);
        uebersetzer.getSprache2_text().addActionListener(this);
        uebersetzer.getStatus_text().addActionListener(this);

        rgbFenster.getField1().addActionListener(this);
        rgbFenster.getField2().addActionListener(this);
        rgbFenster.getField3().addActionListener(this);
        rgbFenster.getButton1().addActionListener(this);
        rgbFenster.getButton2().addActionListener(this);

        checkBox.getCheckBox1().addActionListener(this);
        checkBox.getCheckBox2().addActionListener(this);
        checkBox.getCheckBox3().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            if (e.getActionCommand().equals("BUTTON") || e.getActionCommand().equals("TXT_DEUTSCH") || e.getActionCommand().equals("TXT_ENGLISH")) {
                uebersetzer.getSprache2_text().setText(model.uPrufe(uebersetzer.getSprache1_text().getText()));
            }

            if (e.getActionCommand().equals("B1") || e.getActionCommand().equals("ROT") || e.getActionCommand().equals("GRÜN") || e.getActionCommand().equals("BLAU")) {
                rgbFenster.getjAllCollors().setBackground(new Color(Integer.parseInt(rgbFenster.getField1().getText()), Integer.parseInt(rgbFenster.getField2().getText()), Integer.parseInt(rgbFenster.getField3().getText())));
                rgbFenster.getjButtons().setBackground(new Color(Integer.parseInt(rgbFenster.getField1().getText()), Integer.parseInt(rgbFenster.getField2().getText()), Integer.parseInt(rgbFenster.getField3().getText())));
                rgbFenster.getjPanel().setBackground(new Color(Integer.parseInt(rgbFenster.getField1().getText()), Integer.parseInt(rgbFenster.getField2().getText()), Integer.parseInt(rgbFenster.getField3().getText())));
            }
            if (e.getActionCommand().equals("B2")) {
                System.exit(0);
            }

            if (e.getActionCommand().equals("C1")) {
                checkBox.getStatus().setText(checkBox.getStatus().getText() + " " + checkBox.getCheckBox1().getText());
            } else if (e.getActionCommand().equals("C2")) {
                checkBox.getStatus().setText(checkBox.getStatus().getText() + " " + checkBox.getCheckBox2().getText());
            } else if (e.getActionCommand().equals("C3")) {
                checkBox.getStatus().setText(checkBox.getStatus().getText() + " " + checkBox.getCheckBox2().getText());
            }

        } catch (Exception exception) {
            uebersetzer.getStatus_text().setText(exception.getMessage());
        }
    }
}
