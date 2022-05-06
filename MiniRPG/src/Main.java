import Mobs.Enemy.Goblin;
import Mobs.Schwechen;
import Mobs.Speicher;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Speicher sp = new Speicher();

        Schwechen schwechen = new Schwechen();
        schwechen.setElement(1);

        Goblin goblin = new Goblin(100, 100, "Kevin", 10, schwechen);

        sp.addMob(goblin);

        System.out.println(Arrays.toString(sp.getMobs()));

    }
}
