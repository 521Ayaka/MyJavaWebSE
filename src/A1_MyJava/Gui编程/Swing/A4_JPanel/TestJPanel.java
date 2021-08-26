package A1_MyJava.Gui���.Swing.A4_JPanel;

import javax.swing.*;
import java.awt.*;

public class TestJPanel extends JFrame {

    public TestJPanel() {
        //��ʼ������
        this.setBounds(500,300,600,500);
        this.setBackground(new Color(9, 243, 216));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,2,20,20));

        //�������
        JPanel jPanel1 = new JPanel(new GridLayout(1,3));
        JPanel jPanel2 = new JPanel(new GridLayout(2,1));
        JPanel jPanel3 = new JPanel(new GridLayout(3,1));
        JPanel jPanel4 = new JPanel(new GridLayout(2,2));

        /*����д���Ǵ����,Ӧ���ڹ����������ã����������
        jPanel1.setLayout(new GridLayout(1,3));
        jPanel1.setLayout(new GridLayout(2,1));
        jPanel1.setLayout(new GridLayout(3,1));
        jPanel1.setLayout(new GridLayout(2,2));
        */

        jPanel1.add(new JButton("����"));
        jPanel1.add(new JButton("����"));
        jPanel1.add(new JButton("����"));
        jPanel2.add(new JButton("����"));
        jPanel2.add(new JButton("����"));
        jPanel3.add(new JButton("����"));
        jPanel3.add(new JButton("����"));
        jPanel3.add(new JButton("����"));
        jPanel4.add(new JButton("����"));
        jPanel4.add(new JButton("����"));
        jPanel4.add(new JButton("����"));
        jPanel4.add(new JButton("����"));

        //������
        Container container = this.getContentPane();
        container.add(jPanel1);
        container.add(jPanel2);
        container.add(jPanel3);
        container.add(jPanel4);

        //�ɼ�������������
        this.setVisible(true);

    }

    //����
    public static void main(String[] args) {

        new TestJPanel();

    }
}
