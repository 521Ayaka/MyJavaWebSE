package A1_MyJava.Gui���.Swing.A5_JButton;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButton_01 extends JFrame {

    public JButton_01(String title){
        super(title);
    }

    public void init(){
        //��ʼ��
        Container container = this.getContentPane();
        this.setBounds(300,200,700,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        container.setBackground(new Color(8, 241, 215));
        container.setLayout(null);

        //���ͼƬ���
        JButton jButton = new JButton();
        JPanel jPanel = new JPanel();
        jPanel.setBounds(200,100,500,500);
        jPanel.setSize(500,500);
        jPanel.add(jButton);

        URL url = JButton_01.class.getResource("B11.jpg");
        ImageIcon icon = new ImageIcon(url);
        jButton.setIcon(icon);
        jButton.setSize(500,400);

        //������
        container.add(jPanel);


        this.setVisible(true);

    }

    public static void main(String[] args) {
        new JButton_01("ͼƬ��ť").init();
    }

}
