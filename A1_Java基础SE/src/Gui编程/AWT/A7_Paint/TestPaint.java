package Gui编程.AWT.A7_Paint;

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

        //画笔需要颜色，需要画画
        g.setColor(new Color(10, 227, 72));

        //空心的园
        g.drawOval(110,100,100,100);

        g.setColor(new Color(215, 13, 229));
        //实心的园
        g.fillOval(200,200,100,100);

        g.setColor(new Color(8, 201, 234));
        //实心矩形
        g.fillRect(300,200,100,100);

        //养成一个还习惯，用完画笔后，把颜色恢复为默认颜色

    }
}