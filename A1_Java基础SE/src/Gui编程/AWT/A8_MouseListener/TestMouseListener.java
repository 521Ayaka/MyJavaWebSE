package Gui编程.AWT.A8_MouseListener;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画笔").LoadFrame();
    }
}
class MyFrame extends Frame{

    //构造方法
    public MyFrame(String title){
        super(title);
    }

    //成员变量
    ArrayList<Point> arrayList;

    //启动窗体方法
    public void LoadFrame(){
        //初始化窗体
        setBounds(500,300,500,400);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //添加一个集合用于存储点的位置信息
        arrayList = new ArrayList();
        addMouseListener(new MyMouseListener());
    }

    //画笔事件
    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        Iterator<Point> itr = arrayList.iterator();
        while(itr.hasNext()){
             Point point =(Point) itr.next();
             g.setColor(new Color(25, 204, 236));
             g.fillOval(point.x,point.y,15,15);
        }

    }


/*  如果这样写太麻烦了，要全部实现MouseListener的抽象方法
    //内部类 鼠标监听事件
    private class MyMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }*/

    public void addPoint(Point po){
        arrayList.add(po);
    }

    //适配器模式               注意：适配器模式是已经实现了某方法，用的时候是继承相应的适配器，不是继承
    private class MyMouseListener /*implements*/ extends MouseAdapter{

        @Override
        public void mouseClicked(MouseEvent e) {
            //添加这个窗体
            MyFrame frame =(MyFrame) e.getSource();
            //获取鼠标点击的位置
            Point po = new Point(e.getX(),e.getY());
            //将获取点的位置传入到集合
            frame.addPoint(po);

            //!!!因为这个事件是一次性的，画笔执行的一次，需要重新
            frame.repaint();
        }
    }

}