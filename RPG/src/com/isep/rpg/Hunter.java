package com.isep.rpg;

public class Hunter extends Hero{
    int arrows;// nb flèches

    public Hunter(int lifePoints, int armor, int weaponDamage, int arrows)
    {
        super(lifePoints, armor, weaponDamage);
        this.arrows = arrows;
        Hero hero = new Hero(50, 50, 50) {};
    }
}
