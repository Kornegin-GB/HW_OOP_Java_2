package HW_OOP_Java_2;

import java.util.List;

public abstract class Unit implements UnitInterface {
    protected final float MAX_HEALTH;
    protected float health;
    protected int attack;
    protected int protection;
    protected int[] damage;
    protected int speed;
    protected String action;
    protected List<Unit> gang;


    public Unit(int attack, int protection, int[] damage, float health, int speed, String action) {
        this.attack = attack;
        this.protection = protection;
        this.damage = damage;
        this.health = health / 2; // Временно
        this.MAX_HEALTH = health;
        this.speed = speed;
        this.action = action;
    }

    @Override
    public String getInfo() {
        return "A:" + attack + ", З:" + protection + ", У:" + (damage[0] + damage[1]) / 2 + ", Зд:" + health + ", С:" + speed;
    }

    @Override
    public void step() {

    }
}
