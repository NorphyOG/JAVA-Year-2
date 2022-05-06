public class Player {

    private int maxLeben = 5000000;
    private int nowLeben = 10;
    private String name;
    private int maxEP = 100000;
    private int nowEP = 0;
    private int damage = 1;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMaxEP() {
        return maxEP;
    }

    public void setMaxEP(int maxEP) {
        this.maxEP = maxEP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addEP(int ep) {
        if (ep <= maxLeben) {
            nowEP = nowEP + ep;
            return true;
        } else {
            return false;
        }
    }

    public void loseEP(int ep) {
        if (nowEP >= 0) {
            nowEP = nowEP - ep;
        } else {
            nowEP = 0;
        }
    }

    public void removeMAXHP(int hp) {
        if (hp <= maxLeben) {
            maxLeben = maxLeben - hp;
        }
    }

    public void addMAXHP(int hp) {
        maxLeben = maxLeben + hp;
    }

    public void removeHP(int hp) {
        if (hp <= maxLeben) {
            nowLeben = nowLeben - hp;
        }
    }

    public void addHP(int hp) {
        if (hp <= maxLeben) {
            nowLeben = nowLeben + hp;
        }
    }
}
