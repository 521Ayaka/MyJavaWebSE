package Gui编程.Swing.A4_JPanel;

import javax.swing.*;
import java.awt.*;

public class TestJPanel extends JFrame {

    public TestJPanel() {
        //初始化窗体
        Container container = this.getContentPane();

        this.setBounds(500,300,600,500);                     //窗体的大小是窗体本身的，与容器无关，不能用窗体设置。
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);          //关闭事件也同样是用窗体本身去设置的。
        container.setLayout(new GridLayout(2,2,20,20));
        container.setBackground(new Color(6, 229, 203));

        //this.setBackground(new Color(9, 243, 216));    //这个是窗体的颜色，而容器是在窗体上面的，除非把容器的Visible设置为true
        //this.setLayout(new GridLayout(2,2,20,20));     //尽量在容器中设置

        //创建组件
        JPanel jPanel1 = new JPanel(new GridLayout(1,3));
        JPanel jPanel2 = new JPanel(new GridLayout(2,1));
        JPanel jPanel3 = new JPanel(new GridLayout(3,1));
        JPanel jPanel4 = new JPanel(new GridLayout(2,2));

        /*//这种写法是错误的,应该在构造器里设置,上面↑↑↑
        jPanel1.setLayout(new GridLayout(1,3));
        jPanel1.setLayout(new GridLayout(2,1));
        jPanel1.setLayout(new GridLayout(3,1));
        jPanel1.setLayout(new GridLayout(2,2));
        */

        jPanel1.add(new JButton("尴尬"));
        jPanel1.add(new JButton("尴尬"));
        jPanel1.add(new JButton("尴尬"));

        jPanel2.add(new JButton("尴尬"));
        jPanel2.add(new JButton("尴尬"));
        jPanel3.add(new JButton("尴尬"));
        jPanel3.add(new JButton("尴尬"));
        jPanel3.add(new JButton("尴尬"));

        jPanel4.add(new JButton("尴尬"));
        jPanel4.add(new JButton("尴尬"));
        jPanel4.add(new JButton("尴尬"));
        jPanel4.add(new JButton("尴尬"));

        //添加组件
        container.add(jPanel1);
        container.add(jPanel2);
        container.add(jPanel3);
        container.add(jPanel4);

        //可见性最好最后设置
        this.setVisible(true);

    }

    //启动
    public static void main(String[] args) {

        new TestJPanel();

    }
}
