package 回顾练习;

import javax.swing.*;
import java.awt.*;

public class IconLei extends JFrame implements Icon {

    //创建两个属性，width height
    private int width;
    private int height;

    //创建两个构造方法
    public IconLei(){}
    public IconLei(int width ,int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        //要画的东西

        g.setColor(new Color(10, 227, 72));
        g.fillOval(x,y,width,height);

        g.setColor(new Color(255, 8, 132));
        g.drawOval(x-5,y-5,width+10,height+10);

        g.fillRect(x+35,y,width+80,height);
    }

    @Override
    public int getIconWidth() {
        return this.width;//返回宽度
    }

    @Override
    public int getIconHeight() {
        return this.height;//返回高度
    }


    //使用：
    public void init(){
        //初始化窗体
        this.setBounds(500,300,600,500);
        this.setBackground(new Color(25, 204, 236));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

        //创建组件
        JLabel jL = new JLabel("图片标签", new IconLei(30,30), SwingConstants.CENTER);
        jL.setSize(400,200);
        jL.setFont(new Font("宋体",Font.BOLD,25));
        jL.setForeground(new Color(243, 185, 96));

        //添加组件
        Container container = this.getContentPane();
        container.add(jL);
    }

    //启动
    public static void main(String[] args) {
        new IconLei().init();
    }
}
