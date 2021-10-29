package Gui编程.AWT.A9_WindowListener;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindowListener {

    public static void main(String[] args) {
        new MyFrame("窗口监听事件");
    }

}

class MyFrame extends Frame{

    public MyFrame(String title){
        super(title);
        //初始化大小位置颜色可见性
        setLocation(500,300);
        setSize(500,400);
        setBackground(new Color(3, 209, 238));
        setVisible(true);

        //窗口监听事件 使用匿名内部类 适配器模式
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("windows1");
            }

            @Override //点击关闭窗口图标
            public void windowClosing(WindowEvent e) {
                System.out.println("windowsClosing-点击关闭窗口图标");
                setVisible(false);   //隐藏窗口
                System.exit(0);//关闭程序
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("windows3");
            }

            @Override//图表化，最小化
            public void windowIconified(WindowEvent e) {
                System.out.println("windowsIconified-图表化，最小化");
            }

            @Override //在桌面弹出窗体
            public void windowDeiconified(WindowEvent e) {
                System.out.println("windowsDeiconified-在桌面弹出窗体");
            }

            @Override //窗口获取焦点,激活
            public void windowActivated(WindowEvent e) {
                System.out.println("windowsActivated-窗口获取焦点,激活");
            }

            @Override//窗体失去焦点,未激活
            public void windowDeactivated(WindowEvent e) {
                System.out.println("windowsDeactivated-窗体失去焦点,未激活");
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