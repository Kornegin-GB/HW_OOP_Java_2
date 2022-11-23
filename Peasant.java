package HW_OOP_Java_2;

public class Peasant extends Unit {
    private boolean delivery;

    public Peasant() {
        super(1, 1, new int[]{1, 1}, 1, 3, "стоит");
        delivery = true;
    }

    @Override
    public String getInfo() {
        return "Крестьянин -> " + super.getInfo() + ", Доставка, " + action;
    }
}
