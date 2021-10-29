package 基础知识.调试练习;

import javax.swing.*;

import java.awt.*;

public class Laypane {
    public static void main(String[] args) {
        new Laypanel();
    }

}

class Laypanel extends JFrame{
    Laypanel(){
        JPanel pane2=new JPanel();//普通面板
        pane2.setBackground(new Color(11, 35, 246,50));
        JButton btn3=new JButton("deng ");
        pane2.add(btn3);


        JLayeredPane pane=new JLayeredPane();//分层面板

        JButton btn1=new JButton("确定");
        JButton btn2=new JButton("取消");

        pane.add(btn1, ( Integer)(JLayeredPane.PALETTE_LAYER+50));
        pane.add(btn2,( Integer)(JLayeredPane.PALETTE_LAYER+50));

        btn1.setBounds(30, 50, 80, 80);
        btn2.setBounds(50, 80, 80, 80);

        //this.add(pane);//向窗口添加分层面板
        pane2.setOpaque(false);

        TranslucenceJPanel tjp = new TranslucenceJPanel();
        tjp.setTransparent(40);
        this.getContentPane().add(tjp);//向窗口添加普通面板

        //this.getContentPane().add(pane2);//向窗口添加普通面板

        this.getContentPane().setBackground(Color.red);

        this.setBounds(100, 100, 500, 300);

        this.setVisible(true);

        this.validate();

    }

}
