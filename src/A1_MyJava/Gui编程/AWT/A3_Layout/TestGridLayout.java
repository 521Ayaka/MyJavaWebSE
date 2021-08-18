package A1_MyJava.Gui编程.AWT.A3_Layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestGridLayout {

    public static void main(String[] args) {

        Frame frame = new Frame("表格布局");

        Button grid1 = new Button("Grid1");
        Button grid2 = new Button("Grid2");
        Button grid3 = new Button("Grid3");
        Button grid4 = new Button("Grid4");
        Button grid5 = new Button("Grid5");
        Button grid6 = new Button("Grid6");

        //(rows行,cols列,hgap,vgap)
        frame.setLayout(new GridLayout(3,2));

        //添加到窗体
        frame.add(grid1);
        frame.add(grid2);
        frame.add(grid3);
        frame.add(grid4);
        frame.add(grid5);
        frame.add(grid6);

        //基本设置
        frame.setSize(500,500);
        frame.setLocation(500,300);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }

}
