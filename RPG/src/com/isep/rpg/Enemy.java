package com.isep.rpg;

public abstract class Enemy {
    int lifePoints;
    int damage;
    public Enemy(int lifePoints, int damage){
        this.lifePoints = lifePoints;
        this.damage = damage;
    }

}
