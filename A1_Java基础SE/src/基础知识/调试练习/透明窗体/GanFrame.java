package ����֪ʶ.������ϰ.͸������;

import javax.swing.*;
import java.awt.*;

public class GanFrame extends JFrame {

    public static void main(String[] args) {

        new GanFrame().init();

    }

    public void init(){
        this.setBounds(500, 300, 500, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setBackground(new Color(9, 236, 236));
        container.setLayout(null);




        JComboBox box = new JComboBox();
        box.addItem("��ѡ��");
        box.addItem("����");
        box.addItem("����");
        box.addItem("����Ԫ����");
        box.addItem("����ɰ�������");
        box.setBounds(150, 100, 180, 35);
        box.setOpaque(false);





        container.add(box);
        this.setVisible(true);
    }

}
