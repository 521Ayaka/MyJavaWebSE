package Gui���.JGame;

import A1_MyJava.Gui���.JGame.PanelGame;

import javax.swing.*;
import java.awt.*;

public class RunGame extends JFrame {

    //������Ϸ
    public static void main(String[] args) {
        new RunGame().init();
    }

    //��ʼ����Ϸ
    public void init(){
        this.setBounds(10,10,900,720);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //��������
        Container container = this.getContentPane();
        container.setBackground(new Color(9, 236, 236));

        //��ӻ���
        container.add(new PanelGame());


        //���ÿɼ���
        this.setVisible(true);
    }





}
