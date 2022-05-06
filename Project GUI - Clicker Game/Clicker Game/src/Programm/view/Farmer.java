package Programm.view;

////                                                  
///
// Creator: Jerome Weber                                 
// Project: Clicker Game                               
// Date: 23.03.2022 - 13:22                                   
// Info: For questions or similar contact me on Discord. 
// Discord: Ɲorphy#1164                               
///
////                                               

import javax.swing.*;
import java.awt.*;

public class Farmer {

    private String nameFarmer;
    private JLabel lFarmer;
    private JLabel lFarmerPreis;
    private JButton bFarmer;
    private int number;

    public Farmer(String FarmerName, int number) {
        nameFarmer = FarmerName;
        this.number = number;
    }

    public JPanel setUp(String iconPath) {


        //Farmer 1
        JPanel jFarmer1 = new JPanel();
        jFarmer1.setLayout(new BoxLayout(jFarmer1, BoxLayout.Y_AXIS));

        //Farmer 1 - Text Panel
        JPanel jFarmer1_TEXT = new JPanel();
        lFarmer = new JLabel(nameFarmer);
        lFarmerPreis = new JLabel("$$$");
        jFarmer1_TEXT.add(lFarmer, BorderLayout.WEST);
        jFarmer1_TEXT.add(lFarmerPreis, BorderLayout.EAST);

        //Farmer 1 - Buy Panel
        JPanel jFarmer1_BUY = new JPanel();
        bFarmer = new JButton("Unlock");
        bFarmer.setActionCommand("FARMER_" + number);
        JButton bFarmer1_IMG = new JButton();
        bFarmer1_IMG.setIcon(new ImageIcon(iconPath));
        bFarmer1_IMG.setContentAreaFilled(false);
        bFarmer1_IMG.setFocusable(false);
        bFarmer1_IMG.setBorder(BorderFactory.createEmptyBorder());
        jFarmer1_BUY.add(bFarmer, BorderLayout.WEST);
        jFarmer1_BUY.add(bFarmer1_IMG, BorderLayout.EAST);

        //Farmer 1 - Add Farmer Panel
        jFarmer1.add(jFarmer1_TEXT, BorderLayout.NORTH);
        jFarmer1.add(jFarmer1_BUY, BorderLayout.SOUTH);
        jFarmer1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        return jFarmer1;
    }

    public JLabel getlFarmerPreis() {
        return lFarmerPreis;
    }

    public JButton getbFarmer() {
        return bFarmer;
    }

    public String getNameFarmer() {
        return nameFarmer;
    }
}
