package A1_MyJava.Gui���.AWT.Frame;

/*
ʹ�÷�װ�����������
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

//��һ�����ڲ���
class newFrame extends Frame{
    //�����ж�����ڣ�����һ��������id
    static int id=0;

    //����������
    public newFrame(int x,int y,int w,int h,Color color){
        super("����AWT����javaͼ�ν���" + (++id));
        setVisible(true);
        setLocation(x,y);
        setSize(w,h);
        setBackground(color);
        setResizable(false);
    }
}
