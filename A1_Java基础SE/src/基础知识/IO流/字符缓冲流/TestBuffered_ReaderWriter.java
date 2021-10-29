package ����֪ʶ.IO��.�ַ�������;

import java.io.*;
//��׼����try...catch...finally���ƴ���,�����д����!
/*
�ַ�������: Ĭ��ֵ�㹻��,���ϴ������;

���췽��:
    BufferedWriter(Writer out)
    BufferedReader(Reader in)
    Ĭ��ֵ�㹻��,���ϴ������;

    BufferedWriter(Writer out, int si)
    BufferedReader(Reader in, int si)

*/
public class TestBuffered_ReaderWriter {

    public static void main(String[] args) throws IOException {

        goBufferedWriter();//д������
        goBufferedReader(false);//��ȡ����,�����ַ�
        goBufferedReader(true); //��ȡ����,char����

    }

    public static void goBufferedWriter() throws IOException {
        //�����ַ����������� �� д������
        BufferedWriter bw = new BufferedWriter(new FileWriter("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ�������\\�����ļ�.txt"));
        //д����
        bw.write("�ʾ����м����,\r\n");
        bw.write("ǡ��һ����ˮ������\r\n");
        //�ͷ���Դ
        bw.close();
        System.out.println("==================");
    }

    public static void goBufferedReader(boolean isCharArray) throws IOException {
        //���������ַ������� �� ��ȡ����
        BufferedReader br = new BufferedReader(new FileReader("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ�������\\�����ļ�.txt"));
        //��ȡ���� ���ַ���
        if (!isCharArray){
            //һ�ζ�ȡһ���ַ�
            int by;
            while ((by = br.read()) != -1) {
                System.out.print((char) by);
            }
        }else{
            //��ȡchar[] array����
            char[] array = new char[1024];
            int len;
            while ((len = br.read(array)) != -1) {
                System.out.print(new String(array,0,len));
            }
        }
        //�ͷ���Դ
        br.close();
        System.out.println("==================");

    }


}
