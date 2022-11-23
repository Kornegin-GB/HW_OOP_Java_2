package HW_OOP_Java_2;

public class Spearman extends Unit {
    public Spearman() {
        super(4, 5, new int[]{1, 3}, 10, 4, "стоит");
    }

    @Override
    public String getInfo() {
        return "Копейщик -> " + super.getInfo() + ", " + action;
    }
}
