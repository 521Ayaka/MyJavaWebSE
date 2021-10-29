package Gui编程.JGame;

import A1_MyJava.Gui编程.JGame.PanelGame;

import javax.swing.*;
import java.awt.*;

public class RunGame extends JFrame {

    //启动游戏
    public static void main(String[] args) {
        new RunGame().init();
    }

    //初始化游戏
    public void init(){
        this.setBounds(10,10,900,720);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //创建容器
        Container container = this.getContentPane();
        container.setBackground(new Color(9, 236, 236));

        //添加画笔
        container.add(new PanelGame());


        //设置可见性
        this.setVisible(true);
    }





}
