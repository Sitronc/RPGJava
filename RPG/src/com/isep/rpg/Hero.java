package com.isep.rpg;

import java.util.ArrayList;
import java.util.List;

public abstract class Hero
    {
        void attack(){};
        void defend(){};
        void useConsumable(int Consumable){}
        int lifePoints;
        int armor;
        int weaponDamage;
        List potion = new ArrayList();
        List lembas = new ArrayList();
        public Hero(int lifePoints, int armor, int weaponDamage)
        {
            this.lifePoints = lifePoints;
            this.armor = armor;
            this.weaponDamage = weaponDamage;
        }
    }
