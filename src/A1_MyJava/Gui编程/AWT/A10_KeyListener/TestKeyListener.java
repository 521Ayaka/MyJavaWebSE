package A1_MyJava.Gui���.AWT.A10_KeyListener;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestKeyListener {
    public static void main(String[] args) {
        new MyFrame("���̼����¼�");
    }
}

class MyFrame extends Frame {

    public MyFrame(String title) {
        super(title);

        //��ʼ������
        setBounds(500, 300, 500, 400);
        setBackground(new Color(6, 229, 203));
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //��Ӽ���
        addKeyListener(new MyKeyListener());


    }

    private class MyKeyListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            System.out.println("���������" + e.getKeyCode());

            //�ϼ�
            if (e.getKeyCode() == e.VK_UP) {
                setLocation(getLocation().x, getLocation().y - 10);
            }
            //�¼�
            if (e.getKeyCode() == e.VK_DOWN) {
                setLocation(getLocation().x, getLocation().y + 10);
            }
            //���
            if (e.getKeyCode() == e.VK_LEFT){
                setLocation(getLocation().x-10,getLocation().y);
            }
            //�Ҽ�
            if (e.getKeyCode() == e.VK_RIGHT) {
                setLocation(getLocation().x + 10, getLocation().y);
            }

        }
    }

}
