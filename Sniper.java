package HW_OOP_Java_2;

public class Sniper extends Unit {
    private int shots;

    public Sniper() {
        super(12, 10, new int[]{8, 10}, 15, 9, "стоит");
        shots = 32;
    }

    @Override
    public String getInfo() {
        return "Снайпер -> " + super.getInfo() + ", В:" + shots + ", " + action;
    }
}
