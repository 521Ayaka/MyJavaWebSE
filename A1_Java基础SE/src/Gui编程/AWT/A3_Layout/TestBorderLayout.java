package Gui���.AWT.A3_Layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestBorderLayout {

    public static void main(String[] args) {

        Frame frame = new Frame("�����ϱ��в���");

        Button north = new Button("north");
        Button south = new Button("south");
        Button west = new Button("west");
        Button east = new Button("east");
        Button center = new Button("center");

        //����ť��ӵ���Ӧλ��
        frame.add(north,BorderLayout.NORTH);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(west,BorderLayout.WEST);
        frame.add(east,BorderLayout.EAST);
        frame.add(center,BorderLayout.CENTER);

        //��������
        frame.setSize(400,400);
        frame.setLocation(500,300);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });



    }

}
