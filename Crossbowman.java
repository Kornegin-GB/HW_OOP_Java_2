package HW_OOP_Java_2;

public class Crossbowman extends Unit {
    private int shots;

    public Crossbowman() {
        super(6, 3, new int[]{1, 3}, 10, 4, "стоит");
        shots = 16;
    }

    @Override
    public String getInfo() {
        return "Арбалетчик -> " + super.getInfo() + ", В:" + shots + ", " + action;
    }
}
