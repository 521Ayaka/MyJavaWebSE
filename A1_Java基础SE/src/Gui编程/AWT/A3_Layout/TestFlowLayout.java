package Gui编程.AWT.A3_Layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFlowLayout {

    public static void main(String[] args) {

        Frame frame = new Frame("窗体流式布局");
        Button button1 = new Button("按钮1");
        Button button2 = new Button("按钮2");
        Button button3 = new Button("按钮3");

        //设置窗体为流式布局 默认为center CENTER
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        //设置窗体大小位置
        frame.setSize(300,300);
        frame.setLocation(300,300);

        //向窗体添加按钮
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        //设置窗体可见性
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });



    }

}
