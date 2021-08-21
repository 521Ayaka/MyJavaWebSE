package A1_MyJava.Gui���.AWT.A4_ActionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionListener {

    public static void main(String[] args) {

        Frame frame = new Frame("��ʼ��������");

        //��ʼ��frame����
        frame.setLocation(500,300);
        frame.setSize(500,400);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));
        //���ùرռ����¼�
        FrameEndAndClosing(frame);

        //������ť
        Button start = new Button("��ʼ");
        Button end = new Button("����");

        //����ť��ӵ����嵱��
        frame.add(start);
        frame.add(end);

        //��������ʵ�ֶ���
        MyActionListener myActionListener = new MyActionListener();
//        start.setActionCommand("���ð�ť��Ϣ�ķ���");

        start.addActionListener(myActionListener);
        end.addActionListener(myActionListener);

    }

    //�����˳�����ļ����¼�����
    private static void FrameEndAndClosing(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


}

//�����ڲ��࣬�����¼���ʵ���ࡣ
class MyActionListener implements ActionListener {
/*
e.getActionCommand():��ȡ��ť��Ϣ


*/
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("�����¼�ִ��===>"+e.getActionCommand());//���������button.setActionCommand();���ã�Ĭ����Ϣ�ǰ�ť����
    }
}