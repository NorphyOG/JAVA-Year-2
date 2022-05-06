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

import Programm.model.InfoUpdate;
import Programm.model.Model;
import Programm.view.CubeKlicker;

public class Klicker {
    private final Model model;

    public Klicker(Model model) {
        this.model = model;
    }

    public void klick(CubeKlicker cubeKlicker) {
        model.setCubes((long) (model.getCubes() + 1.0));//TODO

        cubeKlicker.getlCubes().setText("Cubes: " + InfoUpdate.getNummerFormart(model.getCubes()) + "⊡");
    }
}