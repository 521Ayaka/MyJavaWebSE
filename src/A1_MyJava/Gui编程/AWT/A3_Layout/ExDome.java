package A1_MyJava.Gui编程.AWT.A3_Layout;
/*
嵌套使用Layout
题目要求: 图:"嵌套布局作业.png"
*/
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExDome {

    public static void main(String[] args) {

        //创建一个窗体
        Frame frame = new Frame("嵌套布局");

        //对窗体进行初始化设置
        frame.setSize(400,300);
        frame.setLocation(500,400);
        frame.setBackground(new Color(9, 243, 216));
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //开始布局
        frame.setLayout(new GridLayout(2,1));

        //添加4个面板
        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2,1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2,2));

        //向布局中添加按钮
        panel1.add(new Button("WEST-1"),BorderLayout.WEST);
        panel1.add(new Button("EAST-1"),BorderLayout.EAST);

        panel2.add(new Button("CENTER-Grid1-1"));
        panel2.add(new Button("CENTER-Grid2-1"));

        panel3.add(new Button("WEST-2"),BorderLayout.EAST);
        panel3.add(new Button("EAST-2"),BorderLayout.WEST);

        panel4.add(new Button("CENTER-Grid2-2"));
        panel4.add(new Button("CENTER-Grid2-2"));
        panel4.add(new Button("CENTER-Grid3-2"));
        panel4.add(new Button("CENTER-Grid4-2"));

        //将panel2,4分别添加到面板panel1,3 ,并且放在CENTER中间位置。
        panel1.add(panel2,BorderLayout.CENTER);
        panel3.add(panel4,BorderLayout.CENTER);

        //将面板添加到frame窗体当中
        frame.add(panel1);
        frame.add(panel3);
    }

}
