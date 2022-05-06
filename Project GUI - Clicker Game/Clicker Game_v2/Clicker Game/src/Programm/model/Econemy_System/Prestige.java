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

public class Prestige {
    private final Model model;

    public Prestige(Model model) {
        this.model = model;
    }

    public void prLevelUp(CubeKlicker cubeKlicker) {
        boolean prSwitch = false;
        for (FarmerModel farmerModel : model.getFarmerModels()) {
            prSwitch = farmerModel.getLevel() >= model.getPrLevel();
        }

        if (prSwitch) {
            model.setPrestige(model.getPrestige() + 1);

            setPrFarmer(cubeKlicker, 0, 5000, 1, 100, 0);
            setPrFarmer(cubeKlicker, 1, 4000, 10, 1000, 0);
            setPrFarmer(cubeKlicker, 2, 2000, 50, 10000, 0);
            setPrFarmer(cubeKlicker, 3, 1000, 250, 100000, 0);
            setPrFarmer(cubeKlicker, 4, 500, 1000, 1000000, 0);
            model.setCubes(0);
            model.setCps(0);

            model.setPrLevel((long) (model.getPrLevel() * 1.5));
        }

    }

    private void setPrFarmer(CubeKlicker cubeKlicker, int pos, int timeBetweenCashoutInMs, int cubesPerSec, int preis, int level) {
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