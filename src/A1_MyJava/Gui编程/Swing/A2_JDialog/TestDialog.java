package A1_MyJava.Gui编程.Swing.A2_JDialog;
/*
重点！！！！！！！！！！！！

Dialog弹窗是一个类，真是真实存在的，一般Visible为true

当调用弹窗的时候，会创建这个对象，使其运行

弹窗有默认的关闭，不需要再加入，否则会报错

*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestDialog {

    public static void main(String[] args) {
        new MyJFrame().init();
    }

}

class MyJFrame extends JFrame{

    private Container container;

    //初始化窗体
    public void init(){
        this.setBounds(500,300,500,400);
        this.setBackground(new Color(25, 204, 236));
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        //添加容器
        this.container = this.getContentPane();
        //添加组件
        Sub();
    }

    //组件
    public void Sub (){
        JButton jButton = new JButton("弹窗按钮");
        jButton.setBounds(150,150,200,100);
        jButton.setBackground(new Color(224, 9, 231));
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialog();
            }
        });

        this.container.add(jButton);

    }

}
//JDialog本身就是一个窗体，不能在另一个窗体组件中添加！！！
class MyDialog extends JDialog{

    public MyDialog(){
        this.setBounds(600,400,300,300);
        this.setVisible(true);

        Container cPane = this.getContentPane();
        cPane.setBackground(new Color(255, 8, 132));

        //设置这种无布局模式时参数为(null)时,添加的组件要设置大小位置等信息！！！且设置后下面标签也不会居中了，除非调节Location
        //cPane.setLayout(null);

        JLabel label = new JLabel("弹窗已被弹窗！", SwingConstants.CENTER);
        label.setSize(200,100);
        label.setFont(new Font("宋体",Font.BOLD,25));

        //添加标签
        cPane.add(label);

    }

}

