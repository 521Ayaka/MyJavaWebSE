package Gui���.AWT.A3_Layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFlowLayout {

    public static void main(String[] args) {

        Frame frame = new Frame("������ʽ����");
        Button button1 = new Button("��ť1");
        Button button2 = new Button("��ť2");
        Button button3 = new Button("��ť3");

        //���ô���Ϊ��ʽ���� Ĭ��Ϊcenter CENTER
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        //���ô����Сλ��
        frame.setSize(300,300);
        frame.setLocation(300,300);

        //������Ӱ�ť
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        //���ô���ɼ���
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });



    }

}
