package Programm.model;

////
///
// Creator: Jerome Weber
// Project: Clicker Game
// Date: 24.03.2022 - 10:23
// Info: For questions or similar contact me on Discord.
// Discord: Ɲorphy#1164
///
////

import Programm.view.CubeKlicker;
import Programm.view.Farmer;

import java.math.BigInteger;
import java.util.Timer;
import java.util.TimerTask;

public class InfoUpdate {
    private final Model model;
    public BigInteger cps1Sec = BigInteger.valueOf(0);

    public BigInteger getCps1Sec() {
        return cps1Sec;
    }

    public void setCps1Sec(BigInteger cps1Sec) {
        this.cps1Sec = cps1Sec;
    }

    public int timeWithZero = 0;

    public int getTimeWithZero() {
        return timeWithZero;
    }

    public void setTimeWithZero(int timeWithZero) {
        this.timeWithZero = timeWithZero;
    }

    public InfoUpdate(Model model) {
        this.model = model;
    }

    public void updateCubes(CubeKlicker cubeKlicker) {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            private boolean switch1 = false;

            @Override
            public void run() {

                cubeKlicker.getlCubes().setText("Cubes: " + getNummerFormart(model.getCubes()) + "⊡");
                cubeKlicker.getlCPS().setText("CPS: " + getNummerFormart(model.getCps()) + "⊡");

                updateInfoPanel(cubeKlicker);
                updatePrestigeInfo(cubeKlicker);

                if (switch1) {
                    updateCPS();
                    switch1 = false;
                } else {
                    switch1 = true;
                }

            }
        }, 0, 500);
    }

    public void updatePrestigeInfo(CubeKlicker cubeKlicker) {
        cubeKlicker.getlPrestige().setText(
                " All Farmers Level " + model.getPrLevel()
        );
    }

    public void updateCPS() {
        if (cps1Sec.equals(0)) {
            timeWithZero++;
        } else {
            timeWithZero = 0;
        }

        if (timeWithZero != 0) {
            model.setCps(cps1Sec.divide(BigInteger.valueOf(timeWithZero)));
        } else {
            model.setCps(cps1Sec);
        }
        if (!cps1Sec.equals(0)) {
            cps1Sec = BigInteger.valueOf(0);
        }
    }

    public void updateInfoPanel(CubeKlicker cubeKlicker) {

        Farmer[] farmersA = cubeKlicker.getFarmerList();

        cubeKlicker.getTaInfoBereich().setText(
                ">> INFORMATIONEN <<" +
                        "\n------------------------------------" +
                        "\n" +
                        "\n < < Farmer > >" +
                        "\n> " + farmersA[0].getNameFarmer() + " | Lvl:" + getNummerFormart(model.getFarmerModels()[0].getLevel()) + " | CPS:" + getNummerFormart(model.getFarmerModels()[0].getCubesPerSec()) + " | Speed: " + model.getFarmerModels()[0].getTimeBetweenCashoutInMs() +
                        "\n> " + farmersA[1].getNameFarmer() + " | Lvl:" + getNummerFormart(model.getFarmerModels()[1].getLevel()) + " | CPS:" + getNummerFormart(model.getFarmerModels()[1].getCubesPerSec()) + " | Speed: " + model.getFarmerModels()[1].getTimeBetweenCashoutInMs() +
                        "\n> " + farmersA[2].getNameFarmer() + " | Lvl:" + getNummerFormart(model.getFarmerModels()[2].getLevel()) + " | CPS:" + getNummerFormart(model.getFarmerModels()[2].getCubesPerSec()) + " | Speed: " + model.getFarmerModels()[2].getTimeBetweenCashoutInMs() +
                        "\n> " + farmersA[3].getNameFarmer() + " | Lvl:" + getNummerFormart(model.getFarmerModels()[3].getLevel()) + " | CPS:" + getNummerFormart(model.getFarmerModels()[3].getCubesPerSec()) + " | Speed: " + model.getFarmerModels()[3].getTimeBetweenCashoutInMs() +
                        "\n> " + farmersA[4].getNameFarmer() + " | Lvl:" + getNummerFormart(model.getFarmerModels()[4].getLevel()) + " | CPS:" + getNummerFormart(model.getFarmerModels()[4].getCubesPerSec()) + " | Speed: " + model.getFarmerModels()[4].getTimeBetweenCashoutInMs() +
                        "" +
                        ""
        );

    }

    public static String getNummerFormart(BigInteger number) {

        String stringNumber = String.valueOf(number);

        if (number.compareTo(new BigInteger("1000000")) < 1 || number.equals(new BigInteger("1000000"))) {

        }

        if (number.compareTo(new BigInteger("1000")) < 1 || number.equals(new BigInteger("1000"))) {

        }

        return String.valueOf(number);

    }

    private String toFormat(String syntax, BigInteger number, BigInteger slotsOfNumber) {

//TODO
        return "TODO";
    }
}