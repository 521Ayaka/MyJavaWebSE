package A1_MyJava.Gui���.AWT.A5_TextField;
/*
* һ�������ĵ������һ��main����ֻ������������
* ��Ҫ��ɵ��¼����в�ֵ�main�������ⲿ
*
* */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestTextField {

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();

    }

}

//������
class MyFrame extends Frame{
    public MyFrame(){
        //��ʼ������
        setLocation(500,300);
        setSize(500,300);
        setBackground(new Color(14, 150, 234));
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //�����ı���
        TextField textField = new TextField();
        add(textField);

        //��Ӽ����¼�
        MyActionListener myActionListener = new MyActionListener();
        textField.addActionListener(myActionListener);

        //����������һЩ���õĲ������磺setEchoChar();
        textField.setEchoChar('*');

    }
}

//�ı��������
class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //���һЩ��Ϣ��ԴgerSource(); ����ֵΪObject,���Խ�������ת�ͣ�һ���Ǽ�����˭����ת�ͳ�˭
        TextField field = (TextField) e.getSource();
        field.getText();//����ı������Ϣ�������У����п�ʡ�Բ�д
        System.out.println(field.getText());
        //��get��������set��setText���ûس����ı�������ı����ݱ�Ϊ(String str)ʲô;
        field.setText("");//����null�����ǿ��ַ��� ����
    }
}