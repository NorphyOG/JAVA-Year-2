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

public class Model {

    //Classes
    private final InfoUpdate infoUpdate = new InfoUpdate(this);
    private final Buy buy = new Buy(this);
    private final Klicker klicker = new Klicker(this);
    private final Prestige prestigeClass = new Prestige(this);

    //Start Stats
    private long cubes = 0;
    private long cps = 0;
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
                new FarmerModel(5000, 1, 100, model), //5000ms , p100
                new FarmerModel(4000, 10, 1000, model),
                new FarmerModel(2000, 50, 10000, model),
                new FarmerModel(1000, 250, 100000, model),
                new FarmerModel(500, 1000, 1000000, model),
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

    public void buyFarmer(int pos, CubeKlicker cubeKlicker) {
        buy.buyFarmer(pos, cubeKlicker, infoUpdate);
    }

    public void updateInfoPanel(CubeKlicker cubeKlicker) {
        infoUpdate.updateInfoPanel(cubeKlicker);
    }

    public void multiButton(CubeKlicker cubeKlicker) {
        buy.multiButton(cubeKlicker);
    }

    public long getCubes() {
        return cubes;
    }

    public void setCubes(long cubes) {
        this.cubes = cubes;
    }

    public long getCps() {
        return cps;
    }

    public void setCps(long cps) {
        this.cps = cps;
    }

    public int getPrestige() {
        return prestige;
    }

    public void setPrestige(int prestige) {
        this.prestige = prestige;
    }

    public long getCps1Sec() {
        return infoUpdate.getCps1Sec();
    }

    public void setCps1Sec(long cps1Sec) {
        this.infoUpdate.setCps1Sec(cps1Sec);
    }


}

