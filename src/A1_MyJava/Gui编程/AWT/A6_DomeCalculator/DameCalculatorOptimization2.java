package A1_MyJava.Gui���.AWT.A6_DomeCalculator;

/*
ʹ�ã��ڲ��࣬���õ��ṩ�˰�װ��
�ڲ����������ƾ��ǿ��Գ�ͨ����ķ����ⲿ��ĳ�Ա�����ͳ�Ա������
*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DameCalculatorOptimization2 {

    //���������������main
    public static void main(String[] args) {

        //��������
        new CalculatorOpt2().loadFrame();

    }

}

//�������
class CalculatorOpt2 extends Frame {

    //���ԣ���Ա����
    TextField field1, field2, field3;

    //���ܣ���Ա����
    public void loadFrame() {
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
        field1 = new TextField(10);//TextFieldΨһһ�����ι��죬�����Ǳ�ʾһ���ı�������
        field2 = new TextField(10);
        field3 = new TextField(15);
        field3.setBackground(new Color(243, 185, 96));

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
        button.addActionListener(new MyActionListenerOpt2(/*this*/));
    }

    //�����¼��ڲ���
    //˽�л�
    private class MyActionListenerOpt2 implements ActionListener {
        /*����ʡ����Щ
        //ʹ����ϣ���ȡ������࣬��һ���൱�������Ϊһ���ࡣ
        CalculatorOpt2 calculatorOpt2 = null;

        public MyActionListenerOpt2(CalculatorOpt2 calculatorOpt2) {
            this.calculatorOpt2 = calculatorOpt2;
        }
        */

        @Override
        public void actionPerformed(ActionEvent e) {

            //��ȡ�ı�һ�������ı���Ϣ       ֱ�ӵ���
            int num1 = Integer.parseInt(/*calculatorOpt2.*/field1.getText());
            int num2 = Integer.parseInt(/*calculatorOpt2.*/field2.getText());
            //���ӷ�����
            int sum = num1 + num2;

            //����������������ı�1���ı�2
            /*calculatorOpt2.*/field1.setText("");
            /*calculatorOpt2.*/field2.setText("");
            /*calculatorOpt2.*/field3.setText(Integer.toString(sum));

        }
    }

}

/*�ŵ������������ڲ�

//�����¼���
class MyActionListenerOpt2 implements ActionListener {

    //ʹ����ϣ���ȡ������࣬��һ���൱�������Ϊһ���ࡣ
    CalculatorOpt2 calculatorOpt2 = null;

    public MyActionListenerOpt2(CalculatorOpt2 calculatorOpt2) {
        this.calculatorOpt2 = calculatorOpt2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //��ȡ�ı�һ�������ı���Ϣ
        int num1 = Integer.parseInt(calculatorOpt2.field1.getText());
        int num2 = Integer.parseInt(calculatorOpt2.field2.getText());
        //���ӷ�����
        int sum = num1 + num2;

        //����������������ı�1���ı�2
        calculatorOpt2.field1.setText("");
        calculatorOpt2.field2.setText("");
        calculatorOpt2.field3.setText(Integer.toString(sum));

    }
}*/

