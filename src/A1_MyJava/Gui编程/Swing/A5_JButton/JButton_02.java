package A1_MyJava.Gui���.Swing.A5_JButton;

import javax.swing.*;
import java.awt.*;

public class JButton_02 extends JFrame {

    public JButton_02(String title) {
        super(title);
    }

    //��ʼ��
    public void init(){
        //��ʼ������
        Container container = this.getContentPane();
        this.setBounds(500,300,500,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        container.setBackground(new Color(47, 238, 212));

        //������
        JRadioButton radio1 = new JRadioButton("��");
        JRadioButton radio2 = new JRadioButton("Ů");
        JRadioButton radio3 = new JRadioButton("����");

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);

        container.setLayout(new GridLayout(3,1));
        container.add(radio1);
        container.add(radio2);
        container.add(radio3);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JButton_02("��ѡ��ť").init();
    }

}
