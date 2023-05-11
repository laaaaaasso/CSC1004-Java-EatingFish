package org.example;

import org.example.Enemy;
import org.example.GameUtils;

//enemy left class
public class Enemy_1_L extends Enemy {
    public Enemy_1_L() {
        this.x = -45;
        this.y = (int) (Math.random() * 700 + 100);
        this.width = 70;
        this.height = 20;
        this.speed = 10;
        this.count = 1;
        this.img = GameUtils.enemy1_L_img;
    }
}
