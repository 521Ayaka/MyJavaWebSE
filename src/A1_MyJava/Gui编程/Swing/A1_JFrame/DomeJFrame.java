package A1_MyJava.Gui���.Swing.A1_JFrame;
/*

GUI����AWT��Swing
AWT�ǵײ�
Swing��AWT�ķ�װ

*/


import javax.swing.*;
import java.awt.*;

public class DomeJFrame {

    private JFrame jFrame;

    //һ����Ϸ����ʽ��init()��ʼ����
    public void init(){

        //λ�ô�С
        jFrame = new JFrame("Swing�е�JFrame����");
        jFrame.setLocation(500,300);
        jFrame.setSize(500,400);

        //�ر�
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //��������
        Container contentPane = jFrame.getContentPane();
        contentPane.setBackground(new Color(8, 201, 234));


        //�������֡��ñ�ǩJLabel, ���⣬�ڶ�������SwingConstants.-- ������ǩλ��
        JLabel jLabel = new JLabel("���Բ�д",SwingConstants.CENTER);
        jLabel.setText("���������");

        /* ��Щ����û���õ�
        jLabel.setBackground(new Color(9, 243, 216));
        frame.setLayout(new BorderLayout());
        frame.add(jLabel,BorderLayout.CENTER);
        //ֻ��ʹ��
        */
        jLabel.setFont(new Font("����",Font.BOLD,50));
        jLabel.setForeground(new Color(234, 100, 232));
        contentPane.add(jLabel);
        
        //===============================================================
        JLabel jL = new JLabel("",SwingConstants.CENTER);
        jL.setSize(100,500);
        ImageIcon image = new ImageIcon("src/MyImg/A0.jpg");


        //����ͼƬ��С
        Image img = image.getImage();
        img = img.getScaledInstance(400, 600, Image.SCALE_DEFAULT);
        image.setImage(img);

        //���
        jL.setIcon(image);
        jL.setSize(40,10);
        contentPane.add(jL);

        //���ÿɼ���
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {

        new DomeJFrame().init();

    }

}
