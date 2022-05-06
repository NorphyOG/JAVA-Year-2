package Programm.model;

////                                                  
///
// Creator: Jerome Weber                                 
// Project: Clicker Game                               
// Date: 24.03.2022 - 12:46                                   
// Info: For questions or similar contact me on Discord. 
// Discord: Ɲorphy#1164                               
///
////                                               

import java.util.Timer;
import java.util.TimerTask;

public class FarmerModel {

    private int timeBetweenCashoutInMs;
    private int level = 0;
    private long cubesPerSec;
    private long preis;

    private Model model;

    public FarmerModel(int timeBetweenCashoutInMs, long cubesPerSec, long preis, Model model) {
        this.timeBetweenCashoutInMs = timeBetweenCashoutInMs;
        this.cubesPerSec = cubesPerSec;
        this.preis = preis;
        this.model = model;
    }

    private Timer timer = new Timer();

    public void start() {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                model.setCubes(model.getCubes() + cubesPerSec);
                model.setCps1Sec(model.getCps1Sec() + cubesPerSec);

            }
        }, 0, timeBetweenCashoutInMs);

    }

    public void stop() {
        timer.cancel();
    }

    public int getTimeBetweenCashoutInMs() {
        return timeBetweenCashoutInMs;
    }

    public long getPreis() {
        return preis;
    }

    public void setPreis(long preis) {
        this.preis = preis;
    }

    public void setTimeBetweenCashoutInMs(int timeBetweenCashoutInMs) {
        this.timeBetweenCashoutInMs = timeBetweenCashoutInMs;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public long getCubesPerSec() {
        return cubesPerSec;
    }

    public void setCubesPerSec(long cubesPerSec) {
        this.cubesPerSec = cubesPerSec;
    }
}
