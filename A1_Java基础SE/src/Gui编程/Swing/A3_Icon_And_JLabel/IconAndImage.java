package Gui���.Swing.A3_Icon_And_JLabel;


import javax.swing.*;
import java.awt.*;
import java.net.URL;

class MyImage extends JFrame{

    public MyImage(){

        //��ȡͼƬ��ַ
        URL url = MyImage.class.getResource("A2.jpg");

        ImageIcon img = new ImageIcon(url);
        //���� �����ǩ
        JLabel jLabel = new JLabel("");
        jLabel.setIcon(img);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //��ʼ������
        setBounds(500,300,500,400);
        setBackground(new Color(243, 185, 96));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        //��ӱ�ǩ
        Container addF = getContentPane();
        addF.add(jLabel);
    }

}

public class IconAndImage {

    public static void main(String[] args) {

        new MyImage();

    }

}
