package ����֪ʶ.IO��.���������.��׼���������.��׼������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StandardInputStream {

    public static void main(String[] args) throws IOException {

        //����
        new StandardInputStream().init();

    }

    //ѡ������Ǹ�����
    public void init() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("���÷���:");
        int isMethod = sc.nextInt();
        //ѡ�����
        if (isMethod == 1) {
            method1();//�ֽ���
        } else if (isMethod == 2) {
            method2();//�ֽ��� �����ȡ
        } else if (isMethod == 3) {
            method3();//�ַ���
        } else if (isMethod == 4) {
            method4();//�ַ�������
        } else if (isMethod == 5) {
            method5();//Scanner������
        }

    }

    //��System����һ����̬����
    //public static final InputStream in : ��׼������
    public void method1() throws IOException {
        System.out.println("�ѵ��÷���һ");
        //������׼������
        InputStream in1 = System.in;
        //�����ֽڶ�ȡ����
        int by;
        while ((by = in1.read()) != -1) {
            System.out.print((char) by);
        }
        in1.close();
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
        System.out.println("�ѵ��÷�����");
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
        in.close();
    }

    //��[��׼������] ��װ��Ϊ [�ַ���]
    private void method3() throws IOException {
        System.out.println("�ѵ��÷�����");
        //������׼������
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);

        //ʹ�÷�װ�ú�� �ַ��� ��ȡ����
        //����
        /*�����ַ���ȡ
        int by;
        while ((by = isr.read()) != -1) {
            System.out.print((char) by);
        }*/
        //�ַ������ȡ
        char[] array = new char[1024];
        int len;
        while ( (len = isr.read(array)) != -1 ){
            System.out.print(new String(array,0,len));
        }
        //�ͷ���Դ
        isr.close();
    }

    //��װΪ�ַ�����������
    public void method4() throws IOException {
        System.out.println("�ѵ��÷�����");
        // InputStream is = System.in;
        // InputStreamReader isr = new InputStreamReader(is);
        // BufferedReader br = new BufferedReader(isr);
        // ������д
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //ʹ������ķ�����ȡ ���ж�ȡ
        String s = br.readLine();
        System.out.println(s);
        br.close();
    }

    //�������͸�ʽ��Scanner��
    public void method5() throws IOException {
        System.out.println("�ѵ��÷�����");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //�����ȡ������Ϊ��Ҫ����������
        int num = Integer.parseInt(br.readLine());
        System.out.println("����Ҫʹ��ת������ ��"+num);
        br.close();
        //��������ת�����鷳��
        /*
        System.out.println("����Java�ṩScanner���װ�ľ���System.in");
        Scanner scanner = new Scanner(System.in);
        System.out.println("===");
        int abc = scanner.nextInt();
        System.out.println(abc);
        */


    }


}
