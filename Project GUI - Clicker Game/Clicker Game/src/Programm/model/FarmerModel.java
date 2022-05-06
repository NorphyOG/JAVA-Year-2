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

import java.math.BigInteger;
import java.util.Timer;
import java.util.TimerTask;

public class FarmerModel {

    private int timeBetweenCashoutInMs;
    private BigInteger level = BigInteger.valueOf(0);
    private BigInteger cubesPerSec;
    private BigInteger preis;

    private Model model;

    public FarmerModel(int timeBetweenCashoutInMs, BigInteger cubesPerSec, BigInteger preis, Model model) {
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

                model.setCubes(model.getCubes().add(cubesPerSec));
                model.setCps1Sec(model.getCps1Sec().add(cubesPerSec));

            }
        }, 0, timeBetweenCashoutInMs);

    }

    public void stop() {
        timer.cancel();
    }

    public int getTimeBetweenCashoutInMs() {
        return timeBetweenCashoutInMs;
    }

    public BigInteger getPreis() {
        return preis;
    }

    public void setPreis(BigInteger preis) {
        this.preis = preis;
    }

    public void setTimeBetweenCashoutInMs(int timeBetweenCashoutInMs) {
        this.timeBetweenCashoutInMs = timeBetweenCashoutInMs;
    }

    public BigInteger getLevel() {
        return level;
    }

    public void setLevel(BigInteger level) {
        this.level = level;
    }

    public BigInteger getCubesPerSec() {
        return cubesPerSec;
    }

    public void setCubesPerSec(BigInteger cubesPerSec) {
        this.cubesPerSec = cubesPerSec;
    }
}
