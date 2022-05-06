package Programm.model.Econemy_System;

////
///
// Creator: Jerome Weber
// Project: Clicker Game
// Date: 24.03.2022 - 10:23
// Info: For questions or similar contact me on Discord.
// Discord: Ɲorphy#1164
///
////

import Programm.model.FarmerModel;
import Programm.model.InfoUpdate;
import Programm.model.Model;
import Programm.view.CubeKlicker;
import Programm.view.Farmer;

public class Buy {
    private final Model model;

    public Buy(Model model) {
        this.model = model;
    }

    private FarmerModel[] farmerModels;
    private long cubes;
    private int prestige;
    private int buyCount;

    public void buyFarmer(int pos, CubeKlicker cubeKlicker, InfoUpdate infoUpdate) {
        infoUpdate.getNummerFormart(999);

        farmerModels = model.getFarmerModels();
        cubes = model.getCubes();
        prestige = model.getPrestige();
        buyCount = model.getBuyCount();

        double multiplikatorStage1;
        double multiplikatorStage2;
        double multiplikatorStage3;
        double multiplikatorStage4;
        double multiplikatorStage5;

        Farmer farmer = cubeKlicker.getFarmerList()[pos];

        if (farmerModels[pos].getLevel() == 0 && farmerModels[pos].getPreis() <= cubes) {
            farmerModels[pos].setLevel(1);
            farmerModels[pos].start();


            if(pos == 0) {
                textFuerStartkauf(pos = 0, cubeKlicker);
                model.getFarmerModels()[pos].setPreis(model.getFarmerModels()[pos].getPreis() * 2);
                farmer.getlFarmerPreis().setText(InfoUpdate.getNummerFormart(model.getFarmerModels()[pos].getPreis()) + "⊡");

            }else if(pos == 1){
                textFuerStartkauf(pos = 1, cubeKlicker);
                model.getFarmerModels()[pos].setPreis(model.getFarmerModels()[pos].getPreis() * 2);
                farmer.getlFarmerPreis().setText(InfoUpdate.getNummerFormart(model.getFarmerModels()[pos].getPreis()) + "⊡");

            }else if(pos == 2) {
                textFuerStartkauf(pos = 2, cubeKlicker);
                model.getFarmerModels()[pos].setPreis(model.getFarmerModels()[pos].getPreis() * 2);
                farmer.getlFarmerPreis().setText(InfoUpdate.getNummerFormart(model.getFarmerModels()[pos].getPreis()) + "⊡");

            }else if(pos == 3) {
                textFuerStartkauf(pos = 3, cubeKlicker);
                model.getFarmerModels()[pos].setPreis(model.getFarmerModels()[pos].getPreis() * 3);
                farmer.getlFarmerPreis().setText(InfoUpdate.getNummerFormart(model.getFarmerModels()[pos].getPreis()) + "⊡");

            }else if(pos == 4) {
                textFuerStartkauf(pos = 4, cubeKlicker);
                model.getFarmerModels()[pos].setPreis(model.getFarmerModels()[pos].getPreis() * 3);
                farmer.getlFarmerPreis().setText(InfoUpdate.getNummerFormart(model.getFarmerModels()[pos].getPreis()) + "⊡");
            }

        } else if (farmerModels[pos].getLevel() <= 10 && farmerModels[pos].getPreis() <= cubes){ //Stage 1 (easy)
            model.getFarmerModels()[pos].setLevel(model.getFarmerModels()[pos].getLevel() + 1);

            multiplikatorStage1 = 4;
            multiplikatorStage2 = 8;
            multiplikatorStage3 = 16;
            multiplikatorStage4 = 24;
            multiplikatorStage5 = 32;

            if(pos == 0) {
                model.getFarmerModels()[0].setCubesPerSec((long) (model.getFarmerModels()[0].getCubesPerSec() + (multiplikatorStage1 + model.getPrestige()) * model.getFarmerModels()[0].getLevel()));
                textFuerInfo(pos = 0, cubeKlicker);
            }else if(pos == 1) {
                model.getFarmerModels()[1].setCubesPerSec((long) (model.getFarmerModels()[1].getCubesPerSec() + (multiplikatorStage2 + model.getPrestige()) * model.getFarmerModels()[1].getLevel()));
                textFuerInfo(pos = 1, cubeKlicker);
            }else if(pos == 2) {
                model.getFarmerModels()[2].setCubesPerSec((long) (model.getFarmerModels()[2].getCubesPerSec() + (multiplikatorStage3 + model.getPrestige()) * model.getFarmerModels()[2].getLevel()));
                textFuerInfo(pos = 2, cubeKlicker);
            }else if(pos == 3) {
                model.getFarmerModels()[3].setCubesPerSec((long) (model.getFarmerModels()[3].getCubesPerSec() + (multiplikatorStage4 + model.getPrestige()) * model.getFarmerModels()[3].getLevel()));
                textFuerInfo(pos = 3, cubeKlicker);
            }else if(pos == 4) {
                model.getFarmerModels()[4].setCubesPerSec((long) (model.getFarmerModels()[4].getCubesPerSec() + (multiplikatorStage5 + model.getPrestige()) * model.getFarmerModels()[4].getLevel()));
                textFuerInfo(pos = 4, cubeKlicker);
            }



        }else if (farmerModels[pos].getLevel() >= 11 &&farmerModels[pos].getLevel() <= 249 && farmerModels[pos].getPreis() <= cubes) { //Stage 2 (Hard)
            model.getFarmerModels()[pos].setLevel(model.getFarmerModels()[pos].getLevel() + 1); //TODO buyCount

            multiplikatorStage1 = 32;
            multiplikatorStage2 = 150;
            multiplikatorStage3 = 1000;
            multiplikatorStage4 = 9200;
            multiplikatorStage5 = 35600;

            if (pos == 0) {
                model.getFarmerModels()[0].setCubesPerSec((long) (model.getFarmerModels()[0].getCubesPerSec() + (multiplikatorStage1 + model.getPrestige()) * model.getFarmerModels()[0].getLevel()));
                textFuerInfo(pos = 0, cubeKlicker);
            } else if (pos == 1) {
                model.getFarmerModels()[1].setCubesPerSec((long) (model.getFarmerModels()[1].getCubesPerSec() + (multiplikatorStage2 + model.getPrestige()) * model.getFarmerModels()[1].getLevel()));
                textFuerInfo(pos = 1, cubeKlicker);
            } else if (pos == 2) {
                model.getFarmerModels()[2].setCubesPerSec((long) (model.getFarmerModels()[2].getCubesPerSec() + (multiplikatorStage3 + model.getPrestige()) * model.getFarmerModels()[2].getLevel()));
                textFuerInfo(pos = 2, cubeKlicker);
            } else if (pos == 3) {
                model.getFarmerModels()[3].setCubesPerSec((long) (model.getFarmerModels()[3].getCubesPerSec() + (multiplikatorStage4 + model.getPrestige()) * model.getFarmerModels()[3].getLevel()));
                textFuerInfo(pos = 3, cubeKlicker);
            } else if (pos == 4) {
                model.getFarmerModels()[4].setCubesPerSec((long) (model.getFarmerModels()[4].getCubesPerSec() + (multiplikatorStage5 + model.getPrestige()) * model.getFarmerModels()[4].getLevel()));
                textFuerInfo(pos = 4, cubeKlicker);
            }
        }else if (farmerModels[pos].getLevel() >= 250 &&farmerModels[pos].getLevel() <= 450 && farmerModels[pos].getPreis() <= cubes) { //Stage 3 mittlersendgame (Extrem)
            model.getFarmerModels()[pos].setLevel(model.getFarmerModels()[pos].getLevel() + 1); //TODO buyCount

            multiplikatorStage1 = 100;
            multiplikatorStage2 = 2500;
            multiplikatorStage3 = 50000;
            multiplikatorStage4 = 100000;
            multiplikatorStage5 = 2500000;

            if (pos == 0) {
                model.getFarmerModels()[0].setCubesPerSec((long) (model.getFarmerModels()[0].getCubesPerSec() + (multiplikatorStage1 + model.getPrestige()) * model.getFarmerModels()[0].getLevel()));
                textFuerInfo(pos = 0, cubeKlicker);
            } else if (pos == 1) {
                model.getFarmerModels()[1].setCubesPerSec((long) (model.getFarmerModels()[1].getCubesPerSec() + (multiplikatorStage2 + model.getPrestige()) * model.getFarmerModels()[1].getLevel()));
                textFuerInfo(pos = 1, cubeKlicker);
            } else if (pos == 2) {
                model.getFarmerModels()[2].setCubesPerSec((long) (model.getFarmerModels()[2].getCubesPerSec() + (multiplikatorStage3 + model.getPrestige()) * model.getFarmerModels()[2].getLevel()));
                textFuerInfo(pos = 2, cubeKlicker);
            } else if (pos == 3) {
                model.getFarmerModels()[3].setCubesPerSec((long) (model.getFarmerModels()[3].getCubesPerSec() + (multiplikatorStage4 + model.getPrestige()) * model.getFarmerModels()[3].getLevel()));
                textFuerInfo(pos = 3, cubeKlicker);
            } else if (pos == 4) {
                model.getFarmerModels()[4].setCubesPerSec((long) (model.getFarmerModels()[4].getCubesPerSec() + (multiplikatorStage5 + model.getPrestige()) * model.getFarmerModels()[4].getLevel()));
                textFuerInfo(pos = 4, cubeKlicker);
            }
        }else if (farmerModels[pos].getLevel() >= 451 &&farmerModels[pos].getLevel() <= 555 && farmerModels[pos].getPreis() <= cubes) { //Stage 4 endgame (nicht möglich)
            model.getFarmerModels()[pos].setLevel(model.getFarmerModels()[pos].getLevel() + 1); //TODO buyCount

            multiplikatorStage1 = 10000;
            multiplikatorStage2 = 250000;
            multiplikatorStage3 = 5000000;
            multiplikatorStage4 = 10000000;
            multiplikatorStage5 = 250000000;

            if (pos == 0) {
                model.getFarmerModels()[0].setCubesPerSec((long) (model.getFarmerModels()[0].getCubesPerSec() + (multiplikatorStage1 + model.getPrestige()) * model.getFarmerModels()[0].getLevel()));
                textFuerInfo(pos = 0, cubeKlicker);
            } else if (pos == 1) {
                model.getFarmerModels()[1].setCubesPerSec((long) (model.getFarmerModels()[1].getCubesPerSec() + (multiplikatorStage2 + model.getPrestige()) * model.getFarmerModels()[1].getLevel()));
                textFuerInfo(pos = 1, cubeKlicker);
            } else if (pos == 2) {
                model.getFarmerModels()[2].setCubesPerSec((long) (model.getFarmerModels()[2].getCubesPerSec() + (multiplikatorStage3 + model.getPrestige()) * model.getFarmerModels()[2].getLevel()));
                textFuerInfo(pos = 2, cubeKlicker);
            } else if (pos == 3) {
                model.getFarmerModels()[3].setCubesPerSec((long) (model.getFarmerModels()[3].getCubesPerSec() + (multiplikatorStage4 + model.getPrestige()) * model.getFarmerModels()[3].getLevel()));
                textFuerInfo(pos = 3, cubeKlicker);
            } else if (pos == 4) {
                model.getFarmerModels()[4].setCubesPerSec((long) (model.getFarmerModels()[4].getCubesPerSec() + (multiplikatorStage5 + model.getPrestige()) * model.getFarmerModels()[4].getLevel()));
                textFuerInfo(pos = 4, cubeKlicker);
            }
        }

        if (pos == 0) {


        } else if (pos == 1) {

        }


        /*
        double multiplikatorStage1 = 1.01;

        Farmer farmer = cubeKlicker.getFarmerList()[pos];

        if (model.getFarmerModels()[pos].getLevel() == 0 && model.getFarmerModels()[pos].getPreis() <= model.getCubes()) {
            model.getFarmerModels()[pos].setLevel(1);
            model.getFarmerModels()[pos].start();
            farmer.getbFarmer().setText("Buy - " + model.getBuyCount() + "x");
            model.setCubes(model.getCubes() - model.getFarmerModels()[pos].getPreis());
            cubeKlicker.getlCubes().setText("Cubes: " + InfoUpdate.getNummerFormart(model.getCubes()) + "⊡");

            model.getFarmerModels()[pos].setPreis(model.getFarmerModels()[pos].getPreis() * 2);
            farmer.getlFarmerPreis().setText(InfoUpdate.getNummerFormart(model.getFarmerModels()[pos].getPreis()) + "⊡");

        } else if (model.getFarmerModels()[pos].getLevel() <= 500 && model.getFarmerModels()[pos].getPreis() <= model.getCubes()) { //Stage 1
            model.getFarmerModels()[pos].setLevel(model.getFarmerModels()[pos].getLevel() + 1); //TODO buyCount

            model.getFarmerModels()[pos].setCubesPerSec((long) (model.getFarmerModels()[pos].getCubesPerSec() + (multiplikatorStage1 + model.getPrestige()) * model.getFarmerModels()[pos].getLevel()));
            model.setCubes(model.getCubes() - model.getFarmerModels()[pos].getPreis());
            cubeKlicker.getlCubes().setText("Cubes: " + InfoUpdate.getNummerFormart(model.getCubes()) + "⊡");

            model.getFarmerModels()[pos].setPreis((long) (model.getFarmerModels()[pos].getPreis() * 1.2));
            farmer.getlFarmerPreis().setText(InfoUpdate.getNummerFormart(model.getFarmerModels()[pos].getPreis()) + "⊡");

        }


        if (pos == 0) {


        } else if (pos == 1) {

        }*/

    }

    public void textFuerStartkauf(int pos, CubeKlicker cubeKlicker) {
        Farmer farmer = cubeKlicker.getFarmerList()[pos];

        farmer.getbFarmer().setText("Buy - " + model.getBuyCount() + "x");
        model.setCubes(model.getCubes() - model.getFarmerModels()[pos].getPreis());
        cubeKlicker.getlCubes().setText("Cubes: " + InfoUpdate.getNummerFormart(model.getCubes()) + "⊡");

    }

    public void textFuerInfo(int pos, CubeKlicker cubeKlicker){
        Farmer farmer = cubeKlicker.getFarmerList()[pos];


        model.setCubes(model.getCubes() - model.getFarmerModels()[pos].getPreis());
        cubeKlicker.getlCubes().setText("Cubes: " + InfoUpdate.getNummerFormart(model.getCubes()) + "⊡");

        model.getFarmerModels()[pos].setPreis((long) (model.getFarmerModels()[pos].getPreis() * 1.2));
        farmer.getlFarmerPreis().setText(InfoUpdate.getNummerFormart(model.getFarmerModels()[pos].getPreis()) + "⊡");
    }


    public void multiButton(CubeKlicker cubeKlicker) {


        for (Farmer farmer : cubeKlicker.getFarmerList()) {
            if (!farmer.getbFarmer().getText().equalsIgnoreCase("Unlock")) {

                switch (model.getMbCount()) {
                    case 0 -> { //buy 1x

                        cubeKlicker.getbMultiBuy().setText("Switch to Buy 10x");
                        farmer.getbFarmer().setText("Buy - 1x");
                        model.setBuyCount(1);
                    }
                    case 1 -> { //buy 10x

                        cubeKlicker.getbMultiBuy().setText("Switch to Buy 100x");
                        farmer.getbFarmer().setText("Buy - 10x");
                        model.setBuyCount(10);
                    }
                    case 2 -> { //buy 100x

                        cubeKlicker.getbMultiBuy().setText("Switch to Buy 1000x");
                        farmer.getbFarmer().setText("Buy - 100x");
                        model.setBuyCount(100);
                    }
                    case 3 -> { //buy 1000x

                        cubeKlicker.getbMultiBuy().setText("Switch to Buy 1x");
                        farmer.getbFarmer().setText("Buy - 1000x");
                        model.setBuyCount(1000);
                    }
                }

            }
        }

        model.setMbCount(model.getMbCount() + 1);
        if (model.getMbCount() == 4) {
            model.setMbCount(0);
        }

    }
}