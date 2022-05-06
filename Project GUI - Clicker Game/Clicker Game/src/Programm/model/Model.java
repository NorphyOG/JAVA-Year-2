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


import Programm.model.Econemy_System.Buy;
import Programm.model.Econemy_System.Klicker;
import Programm.model.Econemy_System.Prestige;
import Programm.view.CubeKlicker;
import Programm.view.Farmer;

import java.math.BigInteger;

public class Model {

    //Classes
    private final InfoUpdate infoUpdate = new InfoUpdate(this);
    private final Buy buy = new Buy(this);
    private final Klicker klicker = new Klicker(this);
    private final Prestige prestigeClass = new Prestige(this);

    //Start Stats
    private BigInteger cubes = BigInteger.valueOf(0);
    private BigInteger cps = BigInteger.valueOf(0);
    private int prestige = 0;

    //Farmer Model Array
    private FarmerModel[] farmerModels;

    //Multi Button
    private int mbCount = 0;
    private int buyCount = 1;

    //Prestige
    private long prLevel = 100;


    public void setup(CubeKlicker cubeKlicker, Model model) {
        setupFarmer(model, cubeKlicker);
        infoUpdate.updateCubes(cubeKlicker);
        infoUpdate.updateInfoPanel(cubeKlicker);
        infoUpdate.updatePrestigeInfo(cubeKlicker);
    }

    private void setupFarmer(Model model, CubeKlicker cubeKlicker) {
        farmerModels = new FarmerModel[]{
                new FarmerModel(5000, BigInteger.valueOf(1), BigInteger.valueOf(100), model), //5000ms cps1 p100
                new FarmerModel(4000, BigInteger.valueOf(10), BigInteger.valueOf(1000), model), //4000ms cps10 p1000
                new FarmerModel(2000, BigInteger.valueOf(50), BigInteger.valueOf(10000), model), //2000ms cps50 p10000
                new FarmerModel(1000, BigInteger.valueOf(250), BigInteger.valueOf(100000), model), //1000ms cps250 p100000
                new FarmerModel(500, BigInteger.valueOf(1000), BigInteger.valueOf(1000000), model), //500ms cps1000 p1000000
        };

        for (FarmerModel farmerModel : farmerModels) {
            for (Farmer farmer : cubeKlicker.getFarmerList()) {
                if (farmer.getlFarmerPreis().getText().equals("$$$")) {
                    farmer.getlFarmerPreis().setText(InfoUpdate.getNummerFormart(farmerModel.getPreis()) + "⊡");
                    break;
                }
            }
        }
    }







    public long getPrLevel() {
        return prLevel;
    }

    public void setPrLevel(long prLevel) {
        this.prLevel = prLevel;
    }

    public FarmerModel[] getFarmerModels() {
        return farmerModels;
    }

    public int getMbCount() {
        return mbCount;
    }

    public void setMbCount(int mbCount) {
        this.mbCount = mbCount;
    }

    public int getBuyCount() {
        return buyCount;
    }
    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    public void klick(CubeKlicker cubeKlicker) {
        klicker.klick(cubeKlicker);
    }

    public Prestige getPrestigeClass() {
        return prestigeClass;
    }

    /*TODO
    public void buyFarmer(int pos, CubeKlicker cubeKlicker) {
        buy.buyFarmer(pos, cubeKlicker, infoUpdate);
    }*/

    public void updateInfoPanel(CubeKlicker cubeKlicker) {
        infoUpdate.updateInfoPanel(cubeKlicker);
    }

    public void multiButton(CubeKlicker cubeKlicker) {
        buy.multiButton(cubeKlicker);
    }

    public BigInteger getCubes() {
        return cubes;
    }

    public void setCubes(BigInteger cubes) {
        this.cubes = cubes;
    }

    public BigInteger getCps() {
        return cps;
    }

    public void setCps(BigInteger cps) {
        this.cps = cps;
    }

    public int getPrestige() {
        return prestige;
    }

    public void setPrestige(int prestige) {
        this.prestige = prestige;
    }

    public BigInteger getCps1Sec() {
        return infoUpdate.getCps1Sec();
    }

    public void setCps1Sec(BigInteger cps1Sec) {
        this.infoUpdate.setCps1Sec(cps1Sec);
    }


}

