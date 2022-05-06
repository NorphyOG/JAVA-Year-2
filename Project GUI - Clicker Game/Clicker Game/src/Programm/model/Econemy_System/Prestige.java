package Programm.model.Econemy_System;

////
///
// Creator: Jerome Weber
// Project: Clicker Game
// Date: 23.03.2022 - 10:23
// Info: For questions or similar contact me on Discord.
// Discord: Ɲorphy#1164
///
////

import Programm.model.FarmerModel;
import Programm.model.InfoUpdate;
import Programm.model.Model;
import Programm.view.CubeKlicker;
import Programm.view.Farmer;

import java.math.BigInteger;

public class Prestige {
    private final Model model;

    public Prestige(Model model) {
        this.model = model;
    }

    public void prLevelUp(CubeKlicker cubeKlicker) {
        boolean prSwitch = false;
        for (FarmerModel farmerModel : model.getFarmerModels()) {
            if (farmerModel.getLevel().compareTo(BigInteger.valueOf(model.getPrLevel())) < 1) {
                prSwitch = true;
            }
        }

        if (prSwitch) {
            model.setPrestige(model.getPrestige() + 1);

            setPrFarmer(cubeKlicker, 0, 5000, BigInteger.valueOf(1), BigInteger.valueOf(100), BigInteger.valueOf(0));
            setPrFarmer(cubeKlicker, 1, 4000, BigInteger.valueOf(10), BigInteger.valueOf(1000), BigInteger.valueOf(0));
            setPrFarmer(cubeKlicker, 2, 2000, BigInteger.valueOf(50), BigInteger.valueOf(10000), BigInteger.valueOf(0));
            setPrFarmer(cubeKlicker, 3, 1000, BigInteger.valueOf(250), BigInteger.valueOf(100000), BigInteger.valueOf(0));
            setPrFarmer(cubeKlicker, 4, 500, BigInteger.valueOf(1000), BigInteger.valueOf(1000000), BigInteger.valueOf(0));
            model.setCubes(BigInteger.valueOf(0));
            model.setCps(BigInteger.valueOf(0));

            model.setPrLevel((long) (model.getPrLevel() * 1.5));
        }

    }

    private void setPrFarmer(CubeKlicker cubeKlicker, int pos, int timeBetweenCashoutInMs, BigInteger cubesPerSec, BigInteger preis, BigInteger level) {
        model.getFarmerModels()[pos].setTimeBetweenCashoutInMs(timeBetweenCashoutInMs);
        model.getFarmerModels()[pos].setCubesPerSec(cubesPerSec);
        model.getFarmerModels()[pos].setPreis(preis);
        model.getFarmerModels()[pos].setLevel(level);
        model.getFarmerModels()[pos].stop();
        for (Farmer farmer : cubeKlicker.getFarmerList()) {
            if (!farmer.getbFarmer().getText().equals("Unlock")) {
                farmer.getbFarmer().setText("Unlock");
                farmer.getlFarmerPreis().setText(InfoUpdate.getNummerFormart(model.getFarmerModels()[pos].getPreis()) + "⊡");
                break;
            }
        }
    }
}