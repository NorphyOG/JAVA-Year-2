package Mobs;

public class Schwechen {

    private String element;

    public void setElement(int elementNum) {
        switch (elementNum) {
            case 0 -> this.element = "Feuer";
            case 1 -> this.element = "Wasser";
            case 2 -> this.element = "Erde";
            default -> {
            }
        }
    }

}
