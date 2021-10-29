package Gui编程.Swing.A6_JComboBox_JList;

/*
应用场景：表示信息，一般是动态扩容

*/

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class TestJList extends JFrame {

    public TestJList(String title){
        super(title);
    }

    public void init(){
        //初始化
        Container container = this.getContentPane();
        this.setBounds(300,200,700,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        container.setBackground(new Color(8, 241, 215));

        //创建列表框
        //1.先生成列表内容
        String [] str = {"古力娜扎","迪丽热巴","玛尔扎哈"};
        //2.创建列表框，向列表中放入内容。 直接放入构造当中。
        JList<String> jList = new JList<String>(str);
        //另外.还可以向集合当中添加内容。
        Vector vector = new Vector();
        /*
        也可以创建一个集合
        Vector vector = new Vector();
        在向集合当中添加元素
        vector.add();

        */

        //添加组件
        container.add(jList);

        this.setVisible(true);

    }

    //启动
    public static void main(String[] args) {
        new TestJList("列表框").init();
    }

}
