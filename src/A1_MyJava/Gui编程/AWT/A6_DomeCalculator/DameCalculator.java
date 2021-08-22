package A1_MyJava.Gui���.AWT.A6_DomeCalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DameCalculator {

    public static void main(String[] args) {

        //��������
        new Calculator();

    }

}

class Calculator extends Frame {

    public Calculator() {
        //��ʼ������
        setBounds(500, 300, 500, 200);
        setBackground(new Color(6, 229, 203));
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //������ ��ť
        Button button = new Button("=");

        //������ �ı���
        TextField field1 = new TextField(10);//TextFieldΨһһ�����ι��죬�����Ǳ�ʾһ���ı�������
        TextField field2 = new TextField(10);
        TextField field3 = new TextField(10);

        //������ ��ǩ
        Label label = new Label("+");

        //��Ӳ���
        setLayout(new FlowLayout());//����Ϊ����ʽ����

        //���嵱��������
        add(field1);
        add(label);
        add(field2);
        add(button);
        add(field3);

        //��Ӽ����¼�
        MyActionListener myActionListener = new MyActionListener(field1, field2, field3);
        button.addActionListener(myActionListener);

    }

}

//�����¼���
class MyActionListener implements ActionListener {


    private TextField field1, field2, field3;

    //����һ�������������ܲ���������
    public MyActionListener(TextField field1, TextField field2, TextField field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        //��ȡ�ı�һ�������ı���Ϣ
        int num1 = Integer.parseInt(field1.getText());//ǿתʱ��Ҫ�ð�װ�ࡣ
        int num2 = Integer.parseInt(field2.getText());

        //���ӷ�����
        int sum = num1 + num2;

        //����������������ı�1���ı�2
        field1.setText("");
        field2.setText("");
        field3.setText(Integer.toString(sum));

    }
}