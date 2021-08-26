package A1_MyJava.Gui编程.Swing.A4_JPanel;

import javax.swing.*;
import java.awt.*;

public class TestJPanel extends JFrame {

    public TestJPanel() {
        //初始化窗体
        this.setBounds(500,300,600,500);
        this.setBackground(new Color(9, 243, 216));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,2,20,20));

        //创建组件
        JPanel jPanel1 = new JPanel(new GridLayout(1,3));
        JPanel jPanel2 = new JPanel(new GridLayout(2,1));
        JPanel jPanel3 = new JPanel(new GridLayout(3,1));
        JPanel jPanel4 = new JPanel(new GridLayout(2,2));

        /*这种写法是错误的,应该在构造器里设置，上面↑↑↑
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
        Container container = this.getContentPane();
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
