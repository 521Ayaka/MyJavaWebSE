package A1_MyJava.����֪ʶ.IO��.�ֽ��ַ��������ع�.A2_�ļ�������;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/*
ͬ [A1_...] һ��, ֻ���������෴
��ʱ��ȡ�ļ��Ķ���,���Է���ܶණ������,
��[ArrayList����]��...���У�
*/
public class FileToArrayList {

    public static void main(String[] args) {

        //����
        new FileToArrayList().fileToArray();

    }

    //��ʼ��
    public void fileToArray() {

        //����һ���յ�����
        ArrayList<String> array = new ArrayList<>();

        //�����ַ��������������� ���� ��ȡ����
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ��ַ��������ع�\\A2_�ļ�������\\�ļ�.txt"));
            //��ʼ���Ƶ����鵱�� ÿһ��Ϊһ��Ԫ��
            String str;
            while ((str = br.readLine()) != null) {//��ȡ
                array.add(str);//д��
            }
            //�ڿ���̨�б���һ������ �������
            int i = 0;
            for (String newAdd : array) {
                System.out.println("array[" + i + "]: " + newAdd);
                i++;
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
        }

    }

}
