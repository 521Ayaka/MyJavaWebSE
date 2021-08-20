package A1_MyJava.Gui���.AWT.A3_Layout;
/*
Ƕ��ʹ��Layout
��ĿҪ��: ͼ:"Ƕ�ײ�����ҵ.png"
*/
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExDome {

    public static void main(String[] args) {

        //����һ������
        Frame frame = new Frame("Ƕ�ײ���");

        //�Դ�����г�ʼ������
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

        //��ʼ����
        frame.setLayout(new GridLayout(2,1));

        //���4�����
        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2,1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2,2));

        //�򲼾�����Ӱ�ť
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

        //��panel2,4�ֱ���ӵ����panel1,3 ,���ҷ���CENTER�м�λ�á�
        panel1.add(panel2,BorderLayout.CENTER);
        panel3.add(panel4,BorderLayout.CENTER);

        //�������ӵ�frame���嵱��
        frame.add(panel1);
        frame.add(panel3);
    }

}
