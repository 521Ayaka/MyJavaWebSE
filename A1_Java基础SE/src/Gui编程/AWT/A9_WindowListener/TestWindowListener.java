package Gui���.AWT.A9_WindowListener;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindowListener {

    public static void main(String[] args) {
        new MyFrame("���ڼ����¼�");
    }

}

class MyFrame extends Frame{

    public MyFrame(String title){
        super(title);
        //��ʼ����Сλ����ɫ�ɼ���
        setLocation(500,300);
        setSize(500,400);
        setBackground(new Color(3, 209, 238));
        setVisible(true);

        //���ڼ����¼� ʹ�������ڲ��� ������ģʽ
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("windows1");
            }

            @Override //����رմ���ͼ��
            public void windowClosing(WindowEvent e) {
                System.out.println("windowsClosing-����رմ���ͼ��");
                setVisible(false);   //���ش���
                System.exit(0);//�رճ���
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("windows3");
            }

            @Override//ͼ������С��
            public void windowIconified(WindowEvent e) {
                System.out.println("windowsIconified-ͼ������С��");
            }

            @Override //�����浯������
            public void windowDeiconified(WindowEvent e) {
                System.out.println("windowsDeiconified-�����浯������");
            }

            @Override //���ڻ�ȡ����,����
            public void windowActivated(WindowEvent e) {
                System.out.println("windowsActivated-���ڻ�ȡ����,����");
            }

            @Override//����ʧȥ����,δ����
            public void windowDeactivated(WindowEvent e) {
                System.out.println("windowsDeactivated-����ʧȥ����,δ����");
            }

            @Override
            public void windowStateChanged(WindowEvent e) {
                System.out.println("windows");
            }

            @Override
            public void windowGainedFocus(WindowEvent e) {
                System.out.println("windows");
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                System.out.println("windows");
            }
        });

    }

}