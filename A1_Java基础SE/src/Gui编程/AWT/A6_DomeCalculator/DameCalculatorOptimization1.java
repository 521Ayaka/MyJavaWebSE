package Gui编程.AWT.A6_DomeCalculator;

/*
使用组合的方法来写，使用面向对象的方法来写
另外：内部类，更好的提供了包装。
*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DameCalculatorOptimization1 {

    //启动类加启动方法main
    public static void main(String[] args) {

        //启动窗体
        new CalculatorOpt().loadFrame();

    }

}

//计算机类
class CalculatorOpt extends Frame {

    //属性，成员变量
    TextField field1, field2, field3;

    //功能，成员方法
    public void loadFrame() {
        //初始化窗体
        setBounds(500, 300, 500, 200);
        setBackground(new Color(6, 229, 203));
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //添加组件 按钮
        Button button = new Button("=");

        //添加组件 文本域
        field1 = new TextField(10);//TextField唯一一个带参构造，参数是表示一行文本的容量
        field2 = new TextField(10);
        field3 = new TextField(15);
        field3.setBackground(new Color(243, 185, 96));

        //添加组件 标签
        Label label = new Label("+");

        //添加布局
        setLayout(new FlowLayout());//设置为流流式布局

        //像窗体当中添加组件
        add(field1);
        add(label);
        add(field2);
        add(button);
        add(field3);

        //添加监听事件
        button.addActionListener(new MyActionListenerOpt(this));
    }


}

//监听事件类
class MyActionListenerOpt implements ActionListener {

    //使用组合，获取计算机类，在一个类当中组合另为一个类。
    CalculatorOpt calculatorOpt = null;

    public MyActionListenerOpt(CalculatorOpt calculatorOpt) {
        this.calculatorOpt = calculatorOpt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //获取文本一、二的文本信息
        int num1 = Integer.parseInt(calculatorOpt.field1.getText());
        int num2 = Integer.parseInt(calculatorOpt.field2.getText());
        //做加法运算
        int sum = num1 + num2;

        //输出结果，并且清空文本1和文本2
        calculatorOpt.field1.setText("");
        calculatorOpt.field2.setText("");
        calculatorOpt.field3.setText(Integer.toString(sum));

    }
}