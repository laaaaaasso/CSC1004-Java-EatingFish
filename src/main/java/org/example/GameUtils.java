package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameUtils
    {
        //direction
        static boolean UP =false;
        static boolean DOWN =false;
        static boolean LEFT =false;
        static boolean RIGHT =false;

        //points
        static int count = 0;

        //关卡等级
        static int level = 0;


        //background img
        public static Image bgimg = Toolkit.getDefaultToolkit().createImage("images/sea.jpg");


        //list of all enemy images
        public static List<Enemy>EnemyList = new ArrayList<>();
        //Enemy img
        public static Image enemy1_L_img = Toolkit.getDefaultToolkit().createImage("images/enemy1-left.png");
        public static Image enemy1_R_img = Toolkit.getDefaultToolkit().createImage("images/enemy1-right.png");
        public static Image enemy2_R_img = Toolkit.getDefaultToolkit().createImage("images/enemy2_R.png");
        public static Image enemy2_L_img = Toolkit.getDefaultToolkit().createImage("images/enemy2_L.png");

        //MyFish img
        public static Image MyFishimg_L = Toolkit.getDefaultToolkit().createImage("images/主角L.png");
        public static Image MyFishimg_R = Toolkit.getDefaultToolkit().createImage("images/主角R.png");

        //绘制文字得工具类
        public  static void drawWord(Graphics g, String str, Color color, int size, int x, int y){
            g.setColor(color);
            g.setFont(new Font("仿宋",Font.BOLD,size));
            g.drawString(str,x,y);
        }



    }

