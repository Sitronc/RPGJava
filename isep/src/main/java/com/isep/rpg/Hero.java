package com.isep.rpg;

import java.util.List;

public abstract class Hero {
    public int lifePoints;
    public int armor;
    public int weaponDamage;
    public List<Potion> potions;
    public List<Food> lembas;
    public void attack(){}
    public void defend(){}
   // public void useConsumable(Consumable){}
}
