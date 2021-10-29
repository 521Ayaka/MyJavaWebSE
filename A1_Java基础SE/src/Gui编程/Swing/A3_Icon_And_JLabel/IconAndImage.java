package Gui编程.Swing.A3_Icon_And_JLabel;


import javax.swing.*;
import java.awt.*;
import java.net.URL;

class MyImage extends JFrame{

    public MyImage(){

        //获取图片地址
        URL url = MyImage.class.getResource("A2.jpg");

        ImageIcon img = new ImageIcon(url);
        //创建 放入标签
        JLabel jLabel = new JLabel("");
        jLabel.setIcon(img);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //初始化窗体
        setBounds(500,300,500,400);
        setBackground(new Color(243, 185, 96));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        //添加标签
        Container addF = getContentPane();
        addF.add(jLabel);
    }

}

public class IconAndImage {

    public static void main(String[] args) {

        new MyImage();

    }

}
