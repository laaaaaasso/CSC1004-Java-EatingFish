package org.example;

import java.awt.*;

public class Enemy
{
    //define images
    Image img;
    //define coordinates of objects
    public int x;
    public int y;
    int width;
    int height;
    //define velocity
    public int speed;
    public int dir = 1;
    //define type
    public int count;
    //paint self fn
    public void paintSelf(Graphics g)
    {
        g.drawImage(img,x,y,width,height,null);
    }
    //get rectangle for collision test
    public Rectangle getRec()
    {
        return new Rectangle(x,y,width,height);

    }
}

class Enemy_2_L extends Enemy_2_R
{
    Enemy_2_L()
    {
        this.x = -45;
        dir = 1;
        this.img =GameUtils.enemy2_L_img;
    }
}