package ����֪ʶ.IO��.���������.�ֽ��ַ���ӡ��.������ӡ�������ļ�;

import java.io.*;

public class PrintWriterCopy {

    public static void main(String[] args) throws IOException{

        //�ַ�������
        method1();

        //�ַ���ӡ���Ľ�
        method2();


    }



    private static void method1() throws IOException {
        //�����ַ�����������
        BufferedReader br = new BufferedReader(new FileReader("A1_Java����SE\\src\\����֪ʶ\\IO��\\���������\\�ֽ��ַ���ӡ��\\������ӡ�������ļ�\\PrintWriterCopy.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("A1_Java����SE\\src\\����֪ʶ\\IO��\\���������\\�ֽ��ַ���ӡ��\\������ӡ�������ļ�\\NewCopy001.txt"));
        //��д����
        String str;
        while ( (str=br.readLine())!= null ){
            bw.write(str); //д������
            bw.newLine();  //����
            bw.flush();    //ˢ��
        }

        //����ͷ���Դ
        br.close();
        bw.close();

    }

    private static void method2() throws IOException {
        //ע�⣺��ӡ��ֻ����д���ݣ��������ȡ����

        //��������Ȼʹ���ַ�����������
        BufferedReader br = new BufferedReader(new FileReader("A1_Java����SE\\src\\����֪ʶ\\IO��\\���������\\�ֽ��ַ���ӡ��\\������ӡ�������ļ�\\PrintWriterCopy.java"));
        //������ӡ��
        PrintWriter pw = new PrintWriter(new FileWriter("A1_Java����SE\\src\\����֪ʶ\\IO��\\���������\\�ֽ��ַ���ӡ��\\������ӡ�������ļ�\\NewCopy002.txt")
                                         , true);//�ڶ�������Ϊtrue
        //��д����
        String str;
        while ( (str = br.readLine())!= null ){
            pw.println(str);//������д�� ���� ˢ��
        }

        //�ͷ���Դ
        br.close();
        pw.close();

    }
}
