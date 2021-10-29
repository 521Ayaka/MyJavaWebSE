package 基础知识.调试练习.透明窗体;

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
        box.addItem("请选择");
        box.addItem("萝莉");
        box.addItem("御姐");
        box.addItem("二次元妹子");
        box.addItem("娇柔可爱的妹子");
        box.setBounds(150, 100, 180, 35);
        box.setOpaque(false);





        container.add(box);
        this.setVisible(true);
    }

}
