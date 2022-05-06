package main;

public class FrachtSchiff extends Schiff {

    private int maxLadekapaziät;
    private int lademenge;

    public FrachtSchiff(String schiffsname, Person kapitän, int besatzung, int maxLadekapaziät, int lademenge) {
        super(schiffsname, kapitän, besatzung);
        this.maxLadekapaziät = maxLadekapaziät;
        this.lademenge = lademenge;
    }

    public String info() {
        return super.info() + "\nMaximale Ladekapazität: " + getMaxLadekapaziät() + "\nAktuelle Lademenge: " + getLademenge();
    }

    public boolean beladen(int menge) {
        if (menge <= (getMaxLadekapaziät() - getLademenge())) {
            setLademenge(getLademenge() + menge);
            return true;
        } else {
            return false;
        }
    }

    public boolean entladen(int menge) {
        if (getLademenge() >= menge) {
            setLademenge(getLademenge() - menge);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "frachtSchiff{" +
                "maxLadekapaziät=" + maxLadekapaziät +
                ", lademenge=" + lademenge +
                '}';
    }

    public int getMaxLadekapaziät() {
        return maxLadekapaziät;
    }

    public void setMaxLadekapaziät(int maxLadekapaziät) {
        this.maxLadekapaziät = maxLadekapaziät;
    }

    public int getLademenge() {
        return lademenge;
    }

    public void setLademenge(int lademenge) {
        this.lademenge = lademenge;
    }
}
