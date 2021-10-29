package Gui编程.Swing.A4_JPanel;

import javax.swing.*;
import java.awt.*;

public class TestScrollPane extends JFrame {

    //ScrollPane面板
    public void init1(){
        //初始化、
        this.setTitle("滚动面板");
        this.setBounds(200,300,600,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setBackground(new Color(8, 201, 234));

        //创建文本域
        TextArea textArea = new TextArea(40, 100);
        //设置默认文本
        textArea.setText("问君能有几多愁，恰似一江春水向东流");

        //创建滚动面板
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.add(textArea);

        //添加文本域组件
        container.add(scrollPane);

        //可见性
        this.setVisible(true);
    }


    //普通面板
    public void init2(){
        //初始化、
        this.setTitle("普通面板");
        this.setBounds(800,300,600,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setBackground(new Color(8, 201, 234));

        //创建文本域
        TextArea textArea = new TextArea(40, 100);
        //设置默认文本
        textArea.setText("问君能有几多愁，恰似一江春水向东流");

        //添加文本域组件
        container.add(textArea);

        //可见性
        this.setVisible(true);
    }



    public static void main(String[] args) {
        new TestScrollPane().init1();
        new TestScrollPane().init2();
    }



}
