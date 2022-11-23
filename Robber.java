package HW_OOP_Java_2;

public class Robber extends Unit {
    public Robber() {
        super(8, 3, new int[]{2, 4}, 10, 6, "стоит");
    }

    @Override
    public String getInfo() {
        return "Разбойник -> " + super.getInfo() + ", " + action;
    }
}
