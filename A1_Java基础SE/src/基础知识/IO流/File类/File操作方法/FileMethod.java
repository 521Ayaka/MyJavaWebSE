package ����֪ʶ.IO��.File��.File��������;

import java.io.File;

/*
File���жϺͻ�ȡ���ܣ�
public boolean isDirectory(){//...} ���Դ˳��󷽷�·������ʾ��File�Ƿ�ΪĿ¼

public boolean isFile(){//...} ���Դ˳���·������ʾ��File�Ƿ�Ϊ�ļ�

public boolean exists(){//...} ���Դ˳���·������ʾ��File�Ƿ����

public String getAbsolutePath(){//...} ���ش˳���·�����ľ���·�����ַ���

public String getPath(){//...}  ���˳���·����ת��Ϊ·�����ַ���

public String getName(){//...}  �����ɴ˳���·������ʾ���ļ���Ŀ¼����

public String[] list(){//...}   ���ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼�������ַ�������

public File[] listFiles(){//...} ���ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��File��������


*/
public class FileMethod {

    public static void main(String[] args) {
        //����File����·��
        //�ļ��� �����ļ���
        File file1 = new File("A1_Java����SE\\src\\����֪ʶ\\IO��\\File��\\File��������\\�����ļ���");
        //�ļ�  �ļ�1.txt
        File file2 = new File("A1_Java����SE\\src\\����֪ʶ\\IO��\\File��\\File��������\\�����ļ���\\�ļ�1.txt");
        //�����ڵ��ļ� �ļ�3.txt
        File file3 = new File("A1_Java����SE\\src\\����֪ʶ\\IO��\\File��\\File��������\\�����ļ���\\�ļ�3.txt");
        //�Ǿ���·����ֱ�ӷ�װ
        File file4 = new File("�����ļ�\\1.jpg");


        //public boolean isDirectory(){//...} ���Դ˳��󷽷�·������ʾ��File�Ƿ�ΪĿ¼
        System.out.println(file1.isDirectory());//true
        System.out.println(file2.isDirectory());//false
        System.out.println(file3.isDirectory());//false



        System.out.println("=====================================================================");
        //public boolean isFile(){//...} ���Դ˳���·������ʾ��File�Ƿ�Ϊ�ļ�
        System.out.println(file1.isFile());//false
        System.out.println(file2.isFile());//true
        System.out.println(file3.isFile());//Ҳ��false



        System.out.println("=====================================================================");
        //public boolean exists(){//...} ���Դ˳���·������ʾ��File�Ƿ����
        System.out.println(file1.exists());//true
        System.out.println(file2.exists());//true
        System.out.println(file3.exists());//false
        System.out.println("=====================================================================");



        //public String getAbsolutePath(){//...} ���ش˳���·�����ľ���·�����ַ���
        System.out.println(file1.getAbsolutePath());
        //���н��Ϊ: D:\Դ����\src\A1_MyJava\����֪ʶ\IO��\File��\File��������\�����ļ���
        System.out.println(file2.getAbsolutePath());
        //���н��Ϊ: D:\Դ����\src\A1_MyJava\����֪ʶ\IO��\File��\File��������\�����ļ���\�ļ�1.txt
        System.out.println(file3.getAbsolutePath());
        //���Ҳ�ܳ���: D:\Դ����\src\A1_MyJava\����֪ʶ\IO��\File��\File��������\�����ļ���\�ļ�1.txt

        System.out.println(file4.getAbsolutePath());
        //D:\Դ����\�����ļ�\1.jpg  !!!!!!!!!!!!!!!!!!!!!!!!!!��װ���� "�����ļ�\1.jpg" ����������Ǿ���·��



        System.out.println("=====================================================================");
        //public String getPath(){//...}  ���˳���·����ת��Ϊ·�����ַ���
        System.out.println(file1.getPath());
        //D:\Դ����\src\A1_MyJava\����֪ʶ\IO��\File��\File��������\�����ļ���
        System.out.println(file2.getPath());
        //D:\Դ����\src\A1_MyJava\����֪ʶ\IO��\File��\File��������\�����ļ���\�ļ�1.txt
        System.out.println(file3.getPath());
        //D:\Դ����\src\A1_MyJava\����֪ʶ\IO��\File��\File��������\�����ļ���\�ļ�3.txt

        System.out.println(file4.getPath());
        //�����ļ�\1.jpg !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!�����Ƿ�װ��·�������Ǿ���·����

        System.out.println("=====================================================================");
        //public String getName(){//...}  �����ɴ˳���·������ʾ���ļ���Ŀ¼����
        System.out.println(file1.getName());//�����ļ���
        System.out.println(file2.getName());//�ļ�1.txt
        System.out.println(file3.getName());//�ļ�3.txt



        System.out.println("=====================================================================");
        //public String[] list(){//...}   ���ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼�������ַ�������
        String[] list1 = file1.list();
        for (String str : list1) {
            System.out.print(str+" ");
        }//�ļ�1.txt �ļ�2.txt �ļ���1 �ļ���2

        try {
            String[] list2 = file2.list();
            for (String str : list2) {
                System.out.println(str+" ");
            }
        }catch (NullPointerException e){
            System.out.println("\n��ָ���쳣��");
        }



        System.out.println("====================================================");
        //public File[] listFiles(){//...} ���ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��File��������
        File[] files1 = file1.listFiles();
        for (File listFiles1 : files1) {
            System.out.println(listFiles1.getAbsolutePath());
            System.out.println(listFiles1.getName());
            /* ���Ϊ��
            D:\Դ����\src\A1_MyJava\����֪ʶ\IO��\File��\File��������\�����ļ���\�ļ�1.txt
            �ļ�1.txt
            D:\Դ����\src\A1_MyJava\����֪ʶ\IO��\File��\File��������\�����ļ���\�ļ�2.txt
            �ļ�2.txt
            D:\Դ����\src\A1_MyJava\����֪ʶ\IO��\File��\File��������\�����ļ���\�ļ���1
            �ļ���1
            D:\Դ����\src\A1_MyJava\����֪ʶ\IO��\File��\File��������\�����ļ���\�ļ���2
            �ļ���2
            */
        }

        try {
            File[] files2 = file2.listFiles();
            for (File listFiles2 : files2) {
                System.out.println(listFiles2.getAbsolutePath());
                System.out.println(listFiles2.getName());
            }
        }catch (NullPointerException e){
            System.out.println("��ָ���쳣��");
        }

        //�������������������Ŀ¼�µ�·����������ļ���������
        System.out.println("====================================================");


       }

}
