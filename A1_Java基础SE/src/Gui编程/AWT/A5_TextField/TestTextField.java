package Gui编程.AWT.A5_TextField;
/*
* 一个正常的的软件，一般main方法只进行启动操作
* 把要完成的事件进行拆分到main方法的外部
*
* */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestTextField {

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();

    }

}

//窗体类
class MyFrame extends Frame{
    public MyFrame(){
        //初始化窗体
        setLocation(500,300);
        setSize(500,300);
        setBackground(new Color(14, 150, 234));
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //设置文本框
        TextField textField = new TextField();
        add(textField);

        //添加监听事件
        MyActionListener myActionListener = new MyActionListener();
        textField.addActionListener(myActionListener);

        //还可以设置一些常用的操作。如：setEchoChar();
        textField.setEchoChar('*');

    }
}

//文本框监听类
class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //获得一些信息资源gerSource(); 返回值为Object,可以进行向下转型，一般是监听了谁就是转型成谁
        TextField field = (TextField) e.getSource();
        field.getText();//获得文本框的信息，看下行，这行可省略不写
        System.out.println(field.getText());
        //有get基本就有set，setText设置回车后文本框里的文本内容变为(String str)什么;
        field.setText("");//不是null，而是空字符串 “”
    }
}