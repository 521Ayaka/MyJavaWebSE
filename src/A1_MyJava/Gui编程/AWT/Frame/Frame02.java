package A1_MyJava.Gui编程.AWT.Frame;

/*
使用封装创建多个窗体
*/

import java.awt.*;
public class Frame02 {

    public static void main(String[] args) {

        new newFrame(100,100,400,400,Color.CYAN);
        new newFrame(500,100,400,400,Color.RED);
        new newFrame(100,500,400,400,Color.blue);
        new newFrame(500,500,400,400,Color.green);

    }

}

//定一个个内部类
class newFrame extends Frame{
    //可能有多个窗口，设置一个计数器id
    static int id=0;

    //创建构造器
    public newFrame(int x,int y,int w,int h,Color color){
        super("是由AWT创建java图形界面" + (++id));
        setVisible(true);
        setLocation(x,y);
        setSize(w,h);
        setBackground(color);
        setResizable(false);
    }
}
