package Gui编程.AWT.A2_Panel;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Panel面板 可以看成是一个空间，但是不能单独存在。
public class Panel01 {

    public static void main(String[] args) {

        //添加窗体
        Frame frame = new Frame("窗体名称");
        Panel panel = new Panel();

        //设置布局
        frame.setLayout(null);

        //设置窗体位置、大小、颜色
        frame.setBounds(300,300,600,500);
        frame.setBackground(new Color(8, 201, 234));

        //设置面板相对于窗体位置、大小，面板颜色
        panel.setBounds(100,100,200,200);
        panel.setBackground(new Color(226, 23, 216));

        //将面板添加到窗体
        frame.add(panel);

        //设置可视化
        frame.setVisible(true);

        //设置窗口关闭事件
        //监听使事件，监听窗口关闭事件 System.exit(0);
        //适配器模式:
        frame.addWindowListener(new WindowAdapter() {
            //窗口点击关闭的时候需要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });





    }

}
