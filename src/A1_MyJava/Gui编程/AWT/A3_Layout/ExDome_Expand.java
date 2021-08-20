package A1_MyJava.Gui���.AWT.A3_Layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExDome_Expand {

    public static void main(String[] args) {

        Frame frame = new Frame("��ϰ2");

        //��ʼ������
        frame.setVisible(true);
        frame.setLocation(500,300);
        frame.setSize(500,500);
        frame.setBackground(new Color(224, 9, 231));
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //��ʼ���ò���
        frame.setLayout(new GridLayout(2,3));

        //������
        Panel panel1 = new Panel(new GridLayout(2, 1));
        Panel panel2 = new Panel(new GridLayout(2, 2));

        //���������Ӱ�ť
        panel1.add(new Button("Button"));
        panel1.add(new Button("Button"));

        panel2.add(new Button("Button"));
        panel2.add(new Button("Button"));
        panel2.add(new Button("Button"));
        panel2.add(new Button("Button"));

        //��˳����������Ӱ�ť�����
        frame.add(new Button("Button"));
        frame.add(panel1);
        frame.add(new Button("Button"));
        frame.add(new Button("Button"));
        frame.add(panel2);
        frame.add(new Button("Button"));

    }

}
