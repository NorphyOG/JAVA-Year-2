package Mobs;

public class Mob {

    private int maxLeben;
    private int nowLeben;
    private String name;
    private int damage;

    public Mob(int maxLeben, int nowLeben, String name, int damage) {
        this.maxLeben = maxLeben;
        this.nowLeben = nowLeben;
        this.name = name;
        this.damage = damage;
    }

    public int getMaxLeben() {
        return maxLeben;
    }

    public void setMaxLeben(int maxLeben) {
        this.maxLeben = maxLeben;
    }

    public int getNowLeben() {
        return nowLeben;
    }

    public void setNowLeben(int nowLeben) {
        this.nowLeben = nowLeben;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
