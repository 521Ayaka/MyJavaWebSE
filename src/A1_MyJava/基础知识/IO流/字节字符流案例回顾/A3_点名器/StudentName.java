package A1_MyJava.����֪ʶ.IO��.�ֽ��ַ��������ع�.A3_������;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class StudentName {

    public static void main(String[] args) {

        //����
        new StudentName().getName();

    }

    //��ʼ��
    public void getName() {

        //����ArrayList�������ڴ洢����
        ArrayList<String> array = new ArrayList<>();

        //�����ַ��������� �� ��ȡ����
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ��ַ��������ع�\\A3_������\\������.txt"));
            //��ȡ����, ����ӵ����ϵ��С�
            String str;
            while ((str = br.readLine()) != null) {
                array.add(str);
            }
            //�����̨�������ȡ��������,����� �������ظ����ֵĳ���,��ù��
            for (int i = 0; i < 3; i++) {
                System.out.println(array.get(new Random().nextInt(array.size())));
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
