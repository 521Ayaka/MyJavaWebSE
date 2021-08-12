package A1_MyJava.Gui编程.AWT.Frame;

import java.awt.*;

public class Frame01 {

    public static void main(String[] args) {

        //创建Frame图形界面对象
        Frame frame = new Frame("我的第一个Gui程序");

        //首先要创建Frame窗口的可见性
        frame.setVisible(true);

        //设置设置窗口大小
        frame.setSize(600,500);

        //设置背景颜色
        frame.setBackground(new Color(16, 194, 159));

        //设置默认打开位置
        frame.setLocation(500,200);

        //设置大小固定
        frame.setResizable(false);

    }

}
