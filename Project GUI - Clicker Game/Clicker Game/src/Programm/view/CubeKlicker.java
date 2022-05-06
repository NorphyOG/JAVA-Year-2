package Programm.view;

////                                                  
///
// Creator: Jerome Weber                                 
// Project: Clicker Game                               
// Date: 22.03.2022 - 08:47                                   
// Info: For questions or similar contact me on Discord. 
// Discord: Ɲorphy#1164                               
///
////                                               

import javax.swing.*;
import java.awt.*;

public class CubeKlicker extends JFrame {

    //Info Bereich
    private JTextArea taInfoBereich;

    //Load & Save
    private JButton bLoad;
    private JButton bSave;

    //Klicker Bereich
    private JButton bKlicker; //KLICKER_BUTTON
    private JLabel lCPS;
    private JLabel lCubes;

    //Farmer
    private JButton bMultiBuy; //MULTYBUY_BUTTON

    //FARMER_number
    private Farmer[] farmerList = {
            new Farmer("Farmer 1", 1),
            new Farmer("Farmer 2", 2),
            new Farmer("Farmer 3", 3),
            new Farmer("Farmer 4", 4),
            new Farmer("Farmer 5", 5)
    };

    //Prestige Button
    private JButton bPrestige; //PRESTIGE
    private JLabel lPrestige;


    public Farmer[] getFarmerList() {
        return farmerList;
    }

    public CubeKlicker() {
        super("Cube Klicker");
        setSize(800, 600);
        setResizable(false);

        String IMG_FOLDER = "src/Assets/";

        Container container = getContentPane();


        //Multi Buy
        bMultiBuy = new JButton("Switch to Buy 10x");
        bMultiBuy.setActionCommand("MULTYBUY_BUTTON");

        //Farmer
        JPanel jFarmer = new JPanel();
        jFarmer.setLayout(new BoxLayout(jFarmer, BoxLayout.Y_AXIS));
        int imgNum = 1;
        for (Farmer farmer : farmerList) {
            jFarmer.add(farmer.setUp(IMG_FOLDER + "Farmer/ICON_" + imgNum + ".png"));
            imgNum++;
        }

        //Load
        bLoad = new JButton("Load");

        //Save
        bSave = new JButton("Save");

        //L & S Panel
        JPanel jLoadSavePanel = new JPanel();
        jLoadSavePanel.setLayout(new BorderLayout());
        jLoadSavePanel.add(bSave, BorderLayout.WEST);
        jLoadSavePanel.add(bLoad, BorderLayout.EAST);

        //Buy Panel
        JPanel jBuy = new JPanel();
        jBuy.setLayout(new BorderLayout());
        jBuy.add(bMultiBuy, BorderLayout.NORTH);
        jBuy.add(jFarmer, BorderLayout.CENTER);
        jBuy.add(jLoadSavePanel, BorderLayout.SOUTH);

        //Klicker Button
        bKlicker = new JButton();
        bKlicker.setActionCommand("KLICKER_BUTTON");
        bKlicker.setIcon(new ImageIcon(IMG_FOLDER + "ICON_1.1.png"));
        bKlicker.setBounds(200, 200, 200, 200);
        bKlicker.setBorder(BorderFactory.createEmptyBorder());
        bKlicker.setContentAreaFilled(true);//todo
        bKlicker.setFocusable(false);

        //Cube Label
        lCubes = new JLabel("Cubes: 0⊡");
        lCubes.setFont(new Font("Josefin Sans", Font.BOLD, 25));

        //CPS Label
        lCPS = new JLabel("CPS: 0⊡");
        lCPS.setFont(new Font("Josefin Sans", Font.BOLD, 15));

        //Info Text Area
        taInfoBereich = new JTextArea(40, 40);
        taInfoBereich.setEditable(false);
        taInfoBereich.setFont(new Font("Josefin Sans", Font.PLAIN, 10));

        //Klick Panel
        JPanel jKlick = new JPanel();
        jKlick.setLayout(new FlowLayout(FlowLayout.CENTER, 0 , 50));
        jKlick.add(bKlicker);

        //Prestige Buttons Panel
        JPanel jPButtons = new JPanel();
        jPButtons.setLayout(new BorderLayout());
        bPrestige = new JButton("Prestige");
        bPrestige.setActionCommand("PRESTIGE");
        lPrestige = new JLabel("$$$");
        lPrestige.setFont(new Font("Josefin Sans", Font.BOLD, 12));
        jPButtons.add(bPrestige, BorderLayout.SOUTH);
        jPButtons.add(lPrestige, BorderLayout.CENTER);

        //Left Klick Panel
        JPanel jLKlickPanel = new JPanel();
        jLKlickPanel.setLayout(new BorderLayout());
        jLKlickPanel.add(jKlick, BorderLayout.NORTH);
        jLKlickPanel.add(jPButtons, BorderLayout.SOUTH);


        //Center Panel
        JPanel jCenter = new JPanel();
        jCenter.setLayout(new BorderLayout());
        jCenter.add(jLKlickPanel, BorderLayout.CENTER);
        jCenter.add(taInfoBereich, BorderLayout.EAST);

        //Klick Panel
        JPanel jKlickerPanel = new JPanel();
        jKlickerPanel.setLayout(new BorderLayout());
        jKlickerPanel.add(lCubes, BorderLayout.NORTH);
        jKlickerPanel.add(jCenter, BorderLayout.CENTER);
        jKlickerPanel.add(lCPS, BorderLayout.SOUTH);


        //All Panel
        JPanel jAll = new JPanel();
        jAll.setLayout(new BorderLayout());
        jAll.add(jKlickerPanel, BorderLayout.CENTER);
        jAll.add(jBuy, BorderLayout.EAST);

        container.add(jAll);

        setVisible(true);

    }


    public JButton getbLoad() {
        return bLoad;
    }

    public JButton getbSave() {
        return bSave;
    }

    public JLabel getlCPS() {
        return lCPS;
    }

    public JLabel getlCubes() {
        return lCubes;
    }

    public JButton getbMultiBuy() {
        return bMultiBuy;
    }

    public JButton getbKlicker() {
        return bKlicker;
    }

    public JTextArea getTaInfoBereich() {
        return taInfoBereich;
    }

    public JButton getbPrestige() {
        return bPrestige;
    }

    public JLabel getlPrestige() {
        return lPrestige;
    }
}

