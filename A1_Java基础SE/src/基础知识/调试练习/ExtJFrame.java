package ����֪ʶ.������ϰ;

import javax.swing.*;
import java.awt.*;

public class ExtJFrame extends JFrame {

    public static void main(String[] args) {
        new ExtJFrame("����");
    }

    public ExtJFrame(String title){
        super(title);
        //��ʼ������
        this.setBounds(400,300,500,480);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //���ͼƬ�ؼ�
        MyJPanel myJPanel = new MyJPanel();
        this.setContentPane(myJPanel);

        //���������ӿؼ�
        //myJPanel.setLayout(new BoxLayout(myJPanel,BoxLayout.Y_AXIS));
        JButton jb1 = new JButton("���������");
        //jb1.setBounds(300,200,200,100);
        jb1.setOpaque(false);
        jb1.setContentAreaFilled(false);

        myJPanel.add(jb1);

        //���ÿɼ���
        this.setVisible(true);

    }



    //�ڲ���
    private class MyJPanel extends JPanel{

        Image image = null;

        public MyJPanel(){
            Image im = new ImageIcon("A1_Java����SE\\src\\����֪ʶ\\������ϰ\\͸������\\A00.jpg").getImage();
            try {
                image = im;
            }catch (Exception e){
                e.printStackTrace();
            }

        }

        @Override
        public void paintComponents(Graphics g) {

            super.paintComponent(g);
            int width = this.getWidth();
            int height = this.getHeight();
            g.clearRect(0,0,width,height);
            //������ͼƬ
            g.drawImage(image,0,0,width,height,null);

            //����һ���͸��������
            g.setColor(new Color(255, 255, 255,200));
            g.fillRect(0,0,width,height);



        }

    }
}
