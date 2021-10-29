package ����֪ʶ.IO��.���������.�ֽ��ַ���ӡ��.�ַ���ӡ��;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
�ַ���ӡ�����е��������췽��
        PrintWriter(String fileName)
            ʹ��ָ�����ļ�������һ���µ�PrintWriter,�����Զ�ִ��ˢ��

        PrintWriter(Writer out,boolean autoFlush)
            ����һ���µ�PrintWriter
            -- out: �ַ�������
            -- autoFlush: һ������ֵ�����Ϊtrue��
                          ��println,printf,format
                          ������ˢ�����������
*/
public class TestPrintWriter {

    public static void main(String[] args) throws IOException {
        //PrintWriter(String fileName) ʹ��ָ�����ļ�������һ���µ�PrintWriter,�����Զ�ִ��ˢ��
        PrintWriter rw = new PrintWriter("A1_Java����SE\\src\\����֪ʶ\\IO��\\���������\\�ֽ��ַ���ӡ��\\�ַ���ӡ��\\�ļ�.txt");
        rw.write(97); //ʹ��write���Ե����ַ�д�� ����char����д��
        //��Ҫˢ��
        rw.flush();//��Ҫˢ��������
        rw.println();
        rw.println("���ν����꣡");
        rw.flush();
        rw.println("============");
        rw.flush();

        //�ͷ���Դ
        rw.close();

/*      PrintWriter(Writer out,boolean autoFlush)
            ����һ���µ�PrintWriter
                -- out: �ַ�������
                -- autoFlush: һ������ֵ�����Ϊtrue����println,printf,format������ˢ�����������
*/
        PrintWriter rwAuto = new PrintWriter(
                new FileWriter("A1_Java����SE\\src\\����֪ʶ\\IO��\\���������\\�ֽ��ַ���ӡ��\\�ַ���ӡ��\\�ļ�.txt")
                ,true);//����Ϊtrue
        //ʹ��println printf format ���Զ�ˢ��
        rwAuto.println("���������");
        rwAuto.print("����");
        rwAuto.flush();
        rwAuto.printf("����");
        rwAuto.println();
        rwAuto.format("���д��");

        //�ͷ���Դ
        rwAuto.close();

    }

}
