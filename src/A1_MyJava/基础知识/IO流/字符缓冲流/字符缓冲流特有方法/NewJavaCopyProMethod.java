package A1_MyJava.����֪ʶ.IO��.�ַ�������.�ַ����������з���;
/*
�����Ľ�, ʹ���ַ��������� ���з��� ���иĽ�����java�ļ�
*/

import java.io.*;

public class NewJavaCopyProMethod {

    public static void main(String[] args) {

        //����
        new NewJavaCopyProMethod().init();

    }

    //��ʼ��
    public void init() {
        //�������������
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ�������\\�ַ����������з���\\NewJavaCopyProMethod.java"));
            bw = new BufferedWriter(new FileWriter("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ�������\\�ַ����������з���\\���Ƶ�����\\NewJavaCopyProMethod.java"));
            //��д����
            String str;
            while ((str = br.readLine())!=null){
                bw.write(str);
                bw.newLine();//��Ҫ���˻���
                bw.flush();//��Ҫ����ˢ��һ��

                //�ڿ���̨���һ�¿���
                System.out.println(str);//�����˼�ln
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null){
                try {
                    bw.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
