package Gui���.AWT.A8_MouseListener;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("����").LoadFrame();
    }
}
class MyFrame extends Frame{

    //���췽��
    public MyFrame(String title){
        super(title);
    }

    //��Ա����
    ArrayList<Point> arrayList;

    //�������巽��
    public void LoadFrame(){
        //��ʼ������
        setBounds(500,300,500,400);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //���һ���������ڴ洢���λ����Ϣ
        arrayList = new ArrayList();
        addMouseListener(new MyMouseListener());
    }

    //�����¼�
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


/*  �������д̫�鷳�ˣ�Ҫȫ��ʵ��MouseListener�ĳ��󷽷�
    //�ڲ��� �������¼�
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

    //������ģʽ               ע�⣺������ģʽ���Ѿ�ʵ����ĳ�������õ�ʱ���Ǽ̳���Ӧ�������������Ǽ̳�
    private class MyMouseListener /*implements*/ extends MouseAdapter{

        @Override
        public void mouseClicked(MouseEvent e) {
            //����������
            MyFrame frame =(MyFrame) e.getSource();
            //��ȡ�������λ��
            Point po = new Point(e.getX(),e.getY());
            //����ȡ���λ�ô��뵽����
            frame.addPoint(po);

            //!!!��Ϊ����¼���һ���Եģ�����ִ�е�һ�Σ���Ҫ����
            frame.repaint();
        }
    }

}