package ����֪ʶ.������ϰ;

import javax.swing.*;
import java.awt.*;

//������
class Demo1 {
    //��������
    private JFrame myJFrame = new JFrame("�б���ͼƬ");
    public Demo1(){
        //��ȡͼƬ
        Image im = new ImageIcon("A1_Java����SE\\src\\����֪ʶ\\������ϰ\\͸������\\A00.jpg").getImage();
        //���ô����С
        myJFrame.setSize(500,800);
        //��ȡ���ñ���������
        MyJPanel myJPanel = new MyJPanel(im);
        //��Ӱ�ť����
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

    //����һ����̳л�����
    public class MyJPanel extends JPanel{
        //���췽����ʼ������ͼƬ
        private Image image;
        public MyJPanel(Image image){
            this.image = image;
        }
        //��дpaintComponent����
        @Override
        public void paintComponent(Graphics g) {
            //���ø���paintComponent���������������
            super.paintComponent(g);
            //���Ʊ���ͼƬ����СΪ�����С
            g.drawImage(image, 0, 0,getWidth(),getHeight(), null);

            g.setColor(new Color(26, 24, 24,50));
            g.fillRect(0,0,getWidth(),getHeight());
        }
    }
}