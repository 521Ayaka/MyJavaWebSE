package ����֪ʶ.IO��.���������.��׼���������.��׼�����;

import java.io.PrintStream;

// public static final PrintStream out : ��׼�����
public class StandardPrintStream {

    public static void main(String[] args) {
        //����ֵ����Ϊ: PrintStream
        PrintStream ps = System.out;
        //PrintStream�̳���OutputStream
        //���������кܶ෽�����������������
        ps.println("�ַ���");
        ps.println(521);
        ps.println(true);
        ps.println('��');
        ps.print(123);
        ps.print("Go");

        //ֱ��ʱʹ�ã�
        System.out.println("�����System.out.println()");
        System.out.println();
        //System.out.print(); //��lnȥ�����Ų����ᱨ����Ϊû�и÷���

    }

}
