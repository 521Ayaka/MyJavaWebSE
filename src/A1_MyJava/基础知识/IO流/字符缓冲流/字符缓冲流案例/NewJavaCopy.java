package A1_MyJava.����֪ʶ.IO��.�ַ�������.�ַ�����������;

import java.io.*;
/*
�����Ľ����ַ������������ʹ�� [�ַ�������] ��ʵ��

*/
public class NewJavaCopy {

    public static void main(String[] args) {

        //�����ַ�������
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            //��ֵ·������
            br = new BufferedReader(new FileReader("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ�������\\�ַ�����������\\NewJavaCopy.java"));
            bw = new BufferedWriter(new FileWriter("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ�������\\�ַ�����������\\���Ƶ�����\\NewJavaCopy.java"));
            //��ʼ����
            char[] array = new char[1024];
            int len;
            while ((len = br.read(array)) != -1) {
                //����
                bw.write(array, 0, len);
                //��ӡ���������̨
                System.out.print(new String(array,0,len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br!=null) {
                try {
                    br.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw!=null) {
                try {
                    bw.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
