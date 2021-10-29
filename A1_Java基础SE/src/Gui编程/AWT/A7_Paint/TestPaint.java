package Gui���.AWT.A7_Paint;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPaint {

    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }

}

class MyPaint extends Frame{

    public void loadFrame(){
        setBounds(500,300,500,400);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        //super.paint(g);

        //������Ҫ��ɫ����Ҫ����
        g.setColor(new Color(10, 227, 72));

        //���ĵ�԰
        g.drawOval(110,100,100,100);

        g.setColor(new Color(215, 13, 229));
        //ʵ�ĵ�԰
        g.fillOval(200,200,100,100);

        g.setColor(new Color(8, 201, 234));
        //ʵ�ľ���
        g.fillRect(300,200,100,100);

        //����һ����ϰ�ߣ����껭�ʺ󣬰���ɫ�ָ�ΪĬ����ɫ

    }
}