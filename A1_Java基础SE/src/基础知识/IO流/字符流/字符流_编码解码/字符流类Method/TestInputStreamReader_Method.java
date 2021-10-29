package ����֪ʶ.IO��.�ַ���.�ַ���_�������.�ַ�����Method;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
�����ݵķ������ֽ����ķ�����ֻ࣬����һ�����ֽ�����һ�����ַ�����һ����byte���飬һ����char����

[����]:
    int read()                һ�ζ�һ���ַ�����
    int read(char[] cbuf)     һ�ζ�һ���ַ���������

*/
public class TestInputStreamReader_Method {

    public static void main(String[] args) throws IOException {

        //����һ  int read()                һ�ζ�һ���ַ�����
        InputStreamReader isr1 = new InputStreamReader(new FileInputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ַ�����Method\\�ļ�1.txt"));
        int by;
        while ((by = isr1.read()) != -1){
            System.out.print((char) by);
        }
        isr1.close();

        System.out.println("\n\n========================================");
        System.out.println("========================================");
        System.out.println("========================================\n");

        //������  int read(char[] cbuf)     һ�ζ�һ���ַ���������
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ַ�����Method\\�ļ�1.txt"));
        char [] array = new char[1024];
        int len;
        while ((len = isr2.read(array)) != -1){
            System.out.print(new String(array,0,len));
        }
        isr2.close();

        System.out.println("\n\n========================================");
        System.out.println("========================================");
        System.out.println("========================================\n");

        //��һ�����ļ�
        InputStreamReader isr3 = new InputStreamReader(new FileInputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ַ�����Method\\TestOutputStreamWriter_Method.java"));
        char[] arrayN = new char[1024];
        int lenN;
        while( (lenN = isr3.read(arrayN)) != -1 ){
            System.out.print(new String(arrayN,0,lenN));
        }
        isr3.close();

    }

}
