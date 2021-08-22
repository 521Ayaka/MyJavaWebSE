package A1_MyJava.Gui编程.AWT.A6_DomeCalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DameCalculator {

    public static void main(String[] args) {

        //启动窗体
        new Calculator();

    }

}

class Calculator extends Frame {

    public Calculator() {
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
        TextField field1 = new TextField(10);//TextField唯一一个带参构造，参数是表示一行文本的容量
        TextField field2 = new TextField(10);
        TextField field3 = new TextField(10);

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
        MyActionListener myActionListener = new MyActionListener(field1, field2, field3);
        button.addActionListener(myActionListener);

    }

}

//监听事件类
class MyActionListener implements ActionListener {


    private TextField field1, field2, field3;

    //创建一个构造器，接受并传入数据
    public MyActionListener(TextField field1, TextField field2, TextField field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        //获取文本一、二的文本信息
        int num1 = Integer.parseInt(field1.getText());//强转时，要用包装类。
        int num2 = Integer.parseInt(field2.getText());

        //做加法运算
        int sum = num1 + num2;

        //输出结果，并且清空文本1和文本2
        field1.setText("");
        field2.setText("");
        field3.setText(Integer.toString(sum));

    }
}