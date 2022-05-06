package Mobs.Enemy;

import Mobs.Mob;
import Mobs.Schwechen;

public class Goblin extends Mob {

    private Schwechen schweche;

    public Goblin(int maxLeben, int nowLeben, String name, int damage, Schwechen schweche) {
        super(maxLeben, nowLeben, name, damage);
        this.schweche = schweche;
    }

    public Schwechen getSchweche() {
        return schweche;
    }

    public void setSchweche(Schwechen schweche) {
        this.schweche = schweche;
    }
}
