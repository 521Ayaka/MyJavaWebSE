package A1_MyJava.Gui编程.AWT.A4_ActionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionListener {

    public static void main(String[] args) {

        Frame frame = new Frame("开始——结束");

        //初始化frame窗体
        frame.setLocation(500,300);
        frame.setSize(500,400);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));
        //调用关闭监听事件
        FrameEndAndClosing(frame);

        //创建按钮
        Button start = new Button("开始");
        Button end = new Button("结束");

        //将按钮添加到窗体当中
        frame.add(start);
        frame.add(end);

        //创建监听实现对象
        MyActionListener myActionListener = new MyActionListener();
//        start.setActionCommand("设置按钮信息的方法");

        start.addActionListener(myActionListener);
        end.addActionListener(myActionListener);

    }

    //创建退出程序的监听事件方法
    private static void FrameEndAndClosing(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


}

//创建内部类，监听事件的实现类。
class MyActionListener implements ActionListener {
/*
e.getActionCommand():获取按钮信息


*/
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("监听事件执行===>"+e.getActionCommand());//如果不进行button.setActionCommand();设置，默认信息是按钮名称
    }
}