package A1_MyJava.Gui编程.AWT.A10_KeyListener;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestKeyListener {
    public static void main(String[] args) {
        new MyFrame("键盘监听事件");
    }
}

class MyFrame extends Frame {

    public MyFrame(String title) {
        super(title);

        //初始化窗体
        setBounds(500, 300, 500, 400);
        setBackground(new Color(6, 229, 203));
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //添加监听
        addKeyListener(new MyKeyListener());


    }

    private class MyKeyListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            System.out.println("你输入的是" + e.getKeyCode());

            //上键
            if (e.getKeyCode() == e.VK_UP) {
                setLocation(getLocation().x, getLocation().y - 10);
            }
            //下键
            if (e.getKeyCode() == e.VK_DOWN) {
                setLocation(getLocation().x, getLocation().y + 10);
            }
            //左键
            if (e.getKeyCode() == e.VK_LEFT){
                setLocation(getLocation().x-10,getLocation().y);
            }
            //右键
            if (e.getKeyCode() == e.VK_RIGHT) {
                setLocation(getLocation().x + 10, getLocation().y);
            }

        }
    }

}
