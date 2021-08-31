package A1_MyJava.Gui编程.Swing.A5_JButton;

import javax.swing.*;
import java.awt.*;

public class JButton_03 extends JFrame {

    public JButton_03(String title){
        this.setTitle(title);
    }

    //初始化
    public void init(){
        this.setBounds(500,300,600,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setBackground(new Color(9, 236, 236));

        //添加组件
        JCheckBox jCheckBox1 = new JCheckBox("萝莉");
        JCheckBox jCheckBox2 = new JCheckBox("御姐");
        JCheckBox jCheckBox3 = new JCheckBox("女汉子");
        JCheckBox jCheckBox4 = new JCheckBox("二次元妹子");
        JCheckBox jCheckBox5 = new JCheckBox("暖男");
        JCheckBox jCheckBox6 = new JCheckBox("欧巴");
        JCheckBox jCheckBox7 = new JCheckBox("男硬汉");
        JCheckBox jCheckBox8 = new JCheckBox("二次元哥哥");

        //添加布局,放入组件
        container.setLayout(new GridLayout(2,4));
        container.add(jCheckBox1);
        container.add(jCheckBox2);
        container.add(jCheckBox3);
        container.add(jCheckBox4);
        container.add(jCheckBox5);
        container.add(jCheckBox6);
        container.add(jCheckBox7);
        container.add(jCheckBox8);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JButton_03("复选框/多选框").init();
    }
}
