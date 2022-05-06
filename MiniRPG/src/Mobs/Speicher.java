package Mobs;

public class Speicher {

    private Mob[] mobs = new Mob[99];

    public boolean addMob(Mob mob) {
        boolean r = false;
        for (int i = 0; i < mobs.length; i++) {
            if (mobs[i] == null) {
                mobs[i] = mob;
                r = true;
                break;
            }
        }
        return r;
    }

    public Mob[] getMobs() {
        return mobs;
    }

    public void setMobs(Mob[] mobs) {
        this.mobs = mobs;
    }
}
