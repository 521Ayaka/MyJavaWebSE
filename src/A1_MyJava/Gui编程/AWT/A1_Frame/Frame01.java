package A1_MyJava.Gui���.AWT.A1_Frame;

import java.awt.*;

public class Frame01 {

    public static void main(String[] args) {

        //����Frameͼ�ν������
        Frame frame = new Frame("�ҵĵ�һ��Gui����");

        //����Ҫ����Frame���ڵĿɼ���
        frame.setVisible(true);

        //�������ô��ڴ�С
        frame.setSize(600,500);

        //���ñ�����ɫ
        frame.setBackground(new Color(16, 194, 159));

        //����Ĭ�ϴ�λ��
        frame.setLocation(500,200);

        //���ô�С�̶�
        frame.setResizable(false);

    }

}
