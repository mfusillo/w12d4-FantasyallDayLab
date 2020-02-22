package items.weapons;

import items.Weapon;

public class Sword extends Weapon {

    public Sword(String name, int attackMultiplier, int value) {
        super(name, attackMultiplier, value);
    }

    public int getValue(){
        return this.value;
    }
}
