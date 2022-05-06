package Programm.controller;

////                                                  
///
// Creator: Jerome Weber                                 
// Project: Clicker Game                               
// Date: 22.03.2022 - 08:04                                   
// Info: For questions or similar contact me on Discord. 
// Discord: Ɲorphy#1164                               
///
////                                               

import Programm.model.Model;
import Programm.view.CubeKlicker;
import Programm.view.Farmer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private CubeKlicker cubeKlicker;
    private Model model;

    public static void main(String[] args) {
        new Controller();
    }

    public Controller() {
        //Fenster
        cubeKlicker = new CubeKlicker();

        //Model
        model = new Model();

        //ActionListener
        cubeKlicker.getbKlicker().addActionListener(this);
        for (Farmer farmer : cubeKlicker.getFarmerList()) {
            farmer.getbFarmer().addActionListener(this);
        }
        cubeKlicker.getbMultiBuy().addActionListener(this);
        cubeKlicker.getbPrestige().addActionListener(this);

        //Metoden
        model.setup(cubeKlicker, model);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            if (e.getActionCommand().equals("KLICKER_BUTTON")) {
                model.klick(cubeKlicker);
            }

            if (e.getActionCommand().equals("MULTYBUY_BUTTON")) {
                model.multiButton(cubeKlicker);
            }

            /*
            if (e.getActionCommand().equals("FARMER_1")) {
                model.buyFarmer(0, cubeKlicker);
            }

            if (e.getActionCommand().equals("FARMER_2")) {
                model.buyFarmer(1, cubeKlicker);
            }

            if (e.getActionCommand().equals("FARMER_3")) {
                model.buyFarmer(2, cubeKlicker);
            }

            if (e.getActionCommand().equals("FARMER_4")) {
                model.buyFarmer(3, cubeKlicker);
            }

            if (e.getActionCommand().equals("FARMER_5")) {
                model.buyFarmer(4, cubeKlicker);
            }*/

            if (e.getActionCommand().equals("PRESTIGE")) {
                model.getPrestigeClass().prLevelUp(cubeKlicker);
            }

            model.updateInfoPanel(cubeKlicker);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
