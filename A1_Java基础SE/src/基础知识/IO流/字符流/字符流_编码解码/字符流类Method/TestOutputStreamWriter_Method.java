package ����֪ʶ.IO��.�ַ���.�ַ���_�������.�ַ�����Method;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
OutputStreamWriter ��д���ݵķ���
    void write(int c)                       дһ���ַ�
    void write(char[] cbuf)                 д��һ���ַ�����
    void write(char[] cbuf,int off,int len) д���ַ������һ����
    void write(String str)                  дһ���ַ���
    void write(String str,int off, int len) дһ���ַ�����һ����

[ע��]:
�ַ���������ֽ��� ���л���ģ�����
ʹ��ˢ����: flush();����ˢ�¡�
closeִ��,��ˢ��һ��,�ٹر���,�رպ�����д������

*/
public class TestOutputStreamWriter_Method {

    public static void main(String[] args) throws IOException {

        OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ַ�����Method\\�ļ�1.txt"));
        //void write(int c)                       дһ���ַ�
        osw1.write(97);
        osw1.flush();//ˢ����
        osw1.write("\r\n");
        //���û��flush()ˢ��Ҳ�����ˣ���Ϊclose() ��ˢ��,��ر�
        osw1.close();//�ͷ���Դ
        //osw1.write(98);
        /**
         * ��ʵ,close�ǹر�����ע��:closeִ��,��ˢ��һ��,�ٹر���,�رպ�����д������
         * Exception in thread "main" java.io.IOException: Stream closed
         * */

        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ַ�����Method\\�ļ�1.txt",true));
        //void write(char[] cbuf)                 д��һ���ַ�����
        char[] array = {'a','b','c','��','��','��','��','\n'};
        osw2.write(array);
        osw2.close();//ˢ��+�ر���

        OutputStreamWriter osw3 = new OutputStreamWriter(new FileOutputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ַ�����Method\\�ļ�1.txt",true));
        //void write(char[] cbuf,int off,int len) д���ַ������һ����
        osw3.write(array,3,array.length-3);//�涨Ϊ '��','��','��','��','\n'
        osw3.close();

        OutputStreamWriter osw4 = new OutputStreamWriter(new FileOutputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ַ�����Method\\�ļ�1.txt",true));
        //void write(String str)                  дһ���ַ���
        String str = "�ʾ����м����,ǡ��һ����ˮ������\r\n";
        osw4.write(str);
        osw4.close();

        OutputStreamWriter osw5 = new OutputStreamWriter(new FileOutputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�������\\�ַ�����Method\\�ļ�1.txt",true));
        //void write(String str,int off, int len) дһ���ַ�����һ����
        osw5.write(str,8,str.length()-8);
        osw5.write("========================================");
        osw5.close();

    }

}
