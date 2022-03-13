package com.isep.rpg;

public class Mage extends SpellCaster{
    public Mage(int manaPoints, int lifePoints, int armor, int weaponDamage) {
        super(manaPoints, lifePoints, armor, weaponDamage);
        Hero hero = new Hero(30, 25, 75) {};
    }
}
