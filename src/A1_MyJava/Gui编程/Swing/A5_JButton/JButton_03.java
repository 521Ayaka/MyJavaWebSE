package A1_MyJava.Gui���.Swing.A5_JButton;

import javax.swing.*;
import java.awt.*;

public class JButton_03 extends JFrame {

    public JButton_03(String title){
        this.setTitle(title);
    }

    //��ʼ��
    public void init(){
        this.setBounds(500,300,600,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setBackground(new Color(9, 236, 236));

        //������
        JCheckBox jCheckBox1 = new JCheckBox("����");
        JCheckBox jCheckBox2 = new JCheckBox("����");
        JCheckBox jCheckBox3 = new JCheckBox("Ů����");
        JCheckBox jCheckBox4 = new JCheckBox("����Ԫ����");
        JCheckBox jCheckBox5 = new JCheckBox("ů��");
        JCheckBox jCheckBox6 = new JCheckBox("ŷ��");
        JCheckBox jCheckBox7 = new JCheckBox("��Ӳ��");
        JCheckBox jCheckBox8 = new JCheckBox("����Ԫ���");

        //��Ӳ���,�������
        container.setLayout(new GridLayout(2,4));
        container.add(jCheckBox1);
        container.add(jCheckBox2);
        container.add(jCheckBox3);
        container.add(jCheckBox4);
        container.add(jCheckBox5);
        container.add(jCheckBox6);
        container.add(jCheckBox7);
        container.add(jCheckBox8);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JButton_03("��ѡ��/��ѡ��").init();
    }
}
