package Gui编程.Swing.A6_JComboBox_JList;

/*
应用场景：选择区域，单选某项已有内容

*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestJComboBox extends JFrame {

    public TestJComboBox(String title) {
        this.setTitle(title);
    }

    public static void main(String[] args) {
        new TestJComboBox("下拉框").init();
    }

    //初始化
    public void init() {
        this.setBounds(500, 300, 500, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setBackground(new Color(9, 236, 236));

        //添加组件
        JComboBox box = new JComboBox();
        box.addItem("请选择");
        box.addItem("萝莉");
        box.addItem("御姐");
        box.addItem("二次元妹子");
        box.addItem("娇柔可爱的妹子");
        box.setBounds(150, 100, 180, 35);

        JButton jButton = new JButton("确定");
        jButton.setBounds(200, 160, 60, 40);

        //添加布局,放入组件
        container.setLayout(null);
        container.add(box);
        container.add(jButton);

        //监听事件
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = (String) box.getSelectedItem();
                switch (str) {
                    case "请选择":
                        new MyDialog("请选择内容",0);
                        break;
                    case "萝莉":
                        new MyDialog("你个死萝莉控！hei en tai",0);
                        break;
                    case "御姐":
                        new MyDialog("姐的温度，你驾驭不住！！！",0);
                        break;
                    case "二次元妹子" :
                        new MyDialog("我们现在一起去转世去二次元吧！",0);
                        break;
                    case "娇柔可爱的妹子" :
                        new MyDialog("别碰俺妹妹，当心让你哭ao( *^-^)ρ(*╯^╰)",1);
                }

            }
        });


        this.setVisible(true);
    }


}

//弹窗类
class MyDialog extends JDialog {

    public MyDialog(String str,int size) {
        this.setTitle(str);
        if (size == 0){
            this.setBounds(550, 365, 400, 300);
        }
        if (size == 1){
            this.setBounds(450, 365, 600, 300);
        }

        //创建容器
        Container cPane = this.getContentPane();
        cPane.setBackground(new Color(230, 187, 245));

        //添加组件
        JLabel label = new JLabel(str, SwingConstants.CENTER);
        label.setSize(200, 100);
        label.setFont(new Font("宋体", Font.BOLD, 25));

        //添加标签
        cPane.add(label);

        //可见性
        this.setVisible(true);
    }

}


