package ����֪ʶ.IO��.�ֽ��ַ��������ع�.A1_���ϵ��ļ�;

/*
��������ܼ�,
�������������:
��ֻ���ļ�д�뵽�ļ�����,
��������Դ�������ط� ����˵[ArrayList����]��...
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFile {

    public static void main(String[] args) {

        //����
        new ArrayListToFile().arrayToFile();

    }

    //��ʼ��
    public void arrayToFile() {
        //����ArrayList����
        ArrayList<String> array = new ArrayList<>();
        //���Ԫ��
        array.add("�ʾ����м����");
        array.add("ǡ��һ����ˮ����");
        array.add("================");
        array.add("��¬��ΰNB,��¬��ΰû�п���");

        //�����ַ�������������� ���� ��д������
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ֽ��ַ��������ع�\\A1_���ϵ��ļ�\\�ļ�.txt"));
            //д�뵽�ļ�
            for (String str : array) {
                bw.write(str);
                bw.newLine();//�����˻��У�
                bw.flush();//ˢ����
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
