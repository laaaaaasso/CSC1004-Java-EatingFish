package org.example;

import org.example.Enemy;
import org.example.GameUtils;

public class Enemy_2_R extends Enemy {
    public Enemy_2_R() {
        this.x = 1500;
        this.y = (int) (Math.random() * 700 + 100);
        this.width = 130;
        this.height = 70;
        this.speed = -10;
        this.count = 3;
        this.img = GameUtils.enemy2_R_img;
    }
}
