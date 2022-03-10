package 基础知识.调试练习;

import javax.swing.*;
import java.awt.*;

//测试类
class Demo1 {
    //创建窗体
    private JFrame myJFrame = new JFrame("有背景图片");
    public Demo1(){
        //获取图片
        Image im = new ImageIcon("A1_Java基础SE\\src\\基础知识\\调试练习\\透明窗体\\A00.jpg").getImage();
        //设置窗体大小
        myJFrame.setSize(500,800);
        //获取设置背景后的面板
        MyJPanel myJPanel = new MyJPanel(im);
        //添加按钮测试
        JButton jb1 = new JButton("hello");
        JButton jb2 = new JButton("hello1");
        jb1.setOpaque(false);
        jb2.setOpaque(false);
        jb1.setContentAreaFilled(false);
        jb2.setContentAreaFilled(false);
        myJPanel.add(jb1);
        myJPanel.add(jb2);
        myJFrame.add(myJPanel);
        myJFrame.setLocationRelativeTo(null);
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myJFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new Demo1();
    }

    //创建一个类继承画板类
    public class MyJPanel extends JPanel{
        //构造方法初始化背景图片
        private Image image;
        public MyJPanel(Image image){
            this.image = image;
        }
        //重写paintComponent方法
        @Override
        public void paintComponent(Graphics g) {
            //调用父类paintComponent方法绘制其他组件
            super.paintComponent(g);
            //绘制背景图片，大小为窗体大小
            g.drawImage(image, 0, 0,getWidth(),getHeight(), null);

            g.setColor(new Color(26, 24, 24,50));
            g.fillRect(0,0,getWidth(),getHeight());
        }
    }
}