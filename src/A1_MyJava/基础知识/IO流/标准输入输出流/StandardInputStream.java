package A1_MyJava.����֪ʶ.IO��.��׼���������;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StandardInputStream {

    public static void main(String[] args) throws IOException {

        //����
        new StandardInputStream().init();

    }

    public void init() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("���÷���:");
        int isMethod = sc.nextInt();
        if (isMethod == 1) {
            method1();
        } else if (isMethod == 2) {
            method2();
        } else if (isMethod == 3){
            method3();
        }

    }

    //��System����һ����̬����
    //public static final InputStream in : ��׼������
    public void method1() throws IOException {
        //������׼������
        InputStream in1 = System.in;
        //�����ֽڶ�ȡ����
        int by;
        while ((by = in1.read()) != -1) {
            System.out.print((char) by);
        }
        /*
        ����������, ������������ [�ֽ���]
        ����, ����ȡ�����ĵ�ʱ��,
        �������Ĳ����� UTF-8 / GBK / ...
        �������ִ���
        ��:
        ����: ����
        ���: ???? //�ĸ��ַ� ������õ�ʱ [GBK���뼯]

        */
    }

    //ʹ�ñ�׼������, ���鷽ʽ��ȡ����
    private void method2() throws IOException {

        //������׼������
        InputStream in = System.in;
        //������ byte[]
        byte[] array = new byte[1024];
        int len;
        while ((len = in.read(array)) != -1) {
            System.out.print(new String(array, 0, len));
        }
        /*
        ʹ���ֽ������� �е� �����ȡ���� ���Զ�ȡ������
        */
    }

    //��[��׼������] ��װ��Ϊ [�ַ���]
    private void method3() {

        //������׼������
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);

        //ʹ�÷�װ�ú�� �ַ��� ��ȡ����
        //����

    }

}
