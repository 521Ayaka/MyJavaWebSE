package ����֪ʶ.IO��.File��.Fileɾ������;

//public boolean delete(){//...}   ɾ���ɴ˳���·������ʾ���ļ���Ŀ¼

import java.io.File;
import java.io.IOException;

public class FileDelete {

    public static void main(String[] args) throws IOException {

        //����Ŀ¼
        File file1 = new File("A1_Java����SE\\src\\����֪ʶ\\IO��\\File��\\Fileɾ������\\�����ļ�\\�ļ�1.txt");
        File file2 = new File("A1_Java����SE\\src\\����֪ʶ\\IO��\\File��\\Fileɾ������\\�����ļ�\\Ŀ¼1");

        File file3 = new File("A1_Java����SE\\src\\����֪ʶ\\IO��\\File��\\Fileɾ������\\�����ļ�\\�����ڵ��ļ�.txt");

        //ʹ��delete��������ɾ������·��
        System.out.println(file1.delete());
        System.out.println(file2.delete());
        System.out.println(file3.delete());

        System.out.println("==============================");

        //Ĭ�ϴ���������ĿĿ¼�µ�
        new File("�����ļ�.txt").createNewFile();

        //��׷�ӵ�ģ����
        new File("src\\����ģ���µ��ļ�.txt").createNewFile();

        //ͬ���ģ�ɾ��Ҳ�������ģ��鿴 �ָ��� [ File_Redo ] ���лָ�����


    }

}
