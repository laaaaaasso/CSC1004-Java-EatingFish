package org.example;

import java.awt.*;

public class MyFish
  {
    //img
    Image img = GameUtils.MyFishimg_L;
    //coordinates
   int x = 700;
   int y = 500;
   int width = 50;
   int height = 50;
   //speed
   int speed = 20;
   //lvl
   int level = 1;

   void logic(){
       if (GameUtils.UP)
       {
           y=y-speed;
       }
       if (GameUtils.DOWN)
       {
           y=y+speed;
       }
       if (GameUtils.LEFT)
       {
           x=x-speed;
          img = GameUtils.MyFishimg_L;
       }
       if (GameUtils.RIGHT)
       {
           x=x+speed;
           img = GameUtils.MyFishimg_R;
       }

   }


   //paintSelf
   public void paintSelf(Graphics g)
   {
       logic();
    g.drawImage(img,x,y,width+GameUtils.count,height+GameUtils.count,null);
   }
   //获取自身矩形用于碰撞检测
   public Rectangle getRec(){
    return new Rectangle(x,y,width+GameUtils.count,height+GameUtils.count);

   }


  }
