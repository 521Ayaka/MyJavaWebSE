package A1_MyJava.Gui���.AWT.A2_Panel;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Panel��� ���Կ�����һ���ռ䣬���ǲ��ܵ������ڡ�
public class Panel01 {

    public static void main(String[] args) {

        //��Ӵ���
        Frame frame = new Frame("��������");
        Panel panel = new Panel();

        //���ò���
        frame.setLayout(null);

        //���ô���λ�á���С����ɫ
        frame.setBounds(300,300,600,500);
        frame.setBackground(new Color(8, 201, 234));

        //�����������ڴ���λ�á���С�������ɫ
        panel.setBounds(100,100,200,200);
        panel.setBackground(new Color(226, 23, 216));

        //�������ӵ�����
        frame.add(panel);

        //���ÿ��ӻ�
        frame.setVisible(true);

        //���ô��ڹر��¼�
        //����ʹ�¼����������ڹر��¼� System.exit(0);
        //������ģʽ:
        frame.addWindowListener(new WindowAdapter() {
            //���ڵ���رյ�ʱ����Ҫ��������
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });





    }

}
