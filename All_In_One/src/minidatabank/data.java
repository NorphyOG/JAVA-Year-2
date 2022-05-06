package minidatabank;

public class data {

    private String name;
    private String nachName;
    private int alter;
    private String lottoNums;
    private int PLZ;


    public void setPLZ(int PLZ) {
        this.PLZ = PLZ;
    }

    public data setName(String name) {
        this.name = name;
        return null;
    }

    public data setNachname(String nachname) {
        this.nachName = nachname;
        return null;
    }

    public void setLottoNums(String lottoNums) {
        this.lottoNums = lottoNums;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public String getNachname() {
        return nachName;
    }

    public String getLottoNums() {
        return lottoNums;
    }

    public int getAlter() {
        return alter;
    }

    public int getPLZ() {
        return PLZ;
    }
}
