package com.isep.rpg;

public abstract class SpellCaster extends Hero
{
    int manaPoints;
    public SpellCaster( int manaPoints, int lifePoints, int armor, int weaponDamage)
        {
            super(lifePoints, armor, weaponDamage);
            this.manaPoints = manaPoints;
        }
}
