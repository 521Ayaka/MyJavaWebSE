package ����֪ʶ.������ϰ;

import javax.swing.*;

import java.awt.*;

public class Laypane {
    public static void main(String[] args) {
        new Laypanel();
    }

}

class Laypanel extends JFrame{
    Laypanel(){
        JPanel pane2=new JPanel();//��ͨ���
        pane2.setBackground(new Color(11, 35, 246,50));
        JButton btn3=new JButton("deng ");
        pane2.add(btn3);


        JLayeredPane pane=new JLayeredPane();//�ֲ����

        JButton btn1=new JButton("ȷ��");
        JButton btn2=new JButton("ȡ��");

        pane.add(btn1, ( Integer)(JLayeredPane.PALETTE_LAYER+50));
        pane.add(btn2,( Integer)(JLayeredPane.PALETTE_LAYER+50));

        btn1.setBounds(30, 50, 80, 80);
        btn2.setBounds(50, 80, 80, 80);

        //this.add(pane);//�򴰿���ӷֲ����
        pane2.setOpaque(false);

        TranslucenceJPanel tjp = new TranslucenceJPanel();
        tjp.setTransparent(40);
        this.getContentPane().add(tjp);//�򴰿������ͨ���

        //this.getContentPane().add(pane2);//�򴰿������ͨ���

        this.getContentPane().setBackground(Color.red);

        this.setBounds(100, 100, 500, 300);

        this.setVisible(true);

        this.validate();

    }

}
