package A1_MyJava.����֪ʶ.IO��.File��.File��������;
/*
public boolean createNewFile(){//...}  �����и����Ƶ��ļ�������ʱ������һ���иó���·�����������¿��ļ�

public boolean mkdir(){//...}  �����д˳���·��������Ŀ¼

public boolean mkdirs(){//...} �����ɴ˳���·����������Ŀ¼, �����κβ��赫�����ڵĸ�Ŀ¼

[ע��]:
ʹ��createNewFile�÷�������ʱ����Ҫʹ��try...catch...�쳣�����ƣ�����ʹ��throws�쳣�׳�, ����ᱨ��
�����ࣺjava.io.IOException��

*/

import java.io.File;
import java.io.IOException;//IO�쳣��

public class FileCreate {

    public static void main (String[] args) throws/*Сд*/ IOException {

        //����1:��Ҫ�� D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\File��\\File�������� Ŀ¼�´���һ���ļ�java.txt
        File file1 = new File("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\File��\\File��������\\����Ŀ¼\\java.txt");
        //System.out.println(file1.createNewFile());
        try{//ʹ��createNewFile()������Ҫʹ�� try...catch...�쳣���ƴ���
            System.out.println(file1.createNewFile());
        }catch(IOException/*I/O�쳣��*/ e){
            System.out.println("�쳣");
        }

        //����2:��Ҫ�� D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\File��\\File��������\\����Ŀ¼ Ŀ¼�´���һ��Ŀ¼ Javase
        File file2 = new File("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\File��\\File��������\\����Ŀ¼\\Javase");
        System.out.println(file2.mkdir());//���û���쳣����

        //����3:��Ҫ�� D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\File��\\File��������\\����Ŀ¼ Ŀ¼�´���һ���༶Ŀ¼JavaWEB\\HTML
        File file3 = new File("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\File��\\File��������\\����Ŀ¼\\JavaWEB\\HTML");
        System.out.println(file3.mkdirs());//���Ҳ�����쳣����

        //����4:��Ҫ�� D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\File��\\File��������\\����Ŀ¼ Ŀ¼�´���һ���ļ�YuanShen.txt
        File file4 = new File("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\File��\\File��������\\����Ŀ¼\\YuanShen.txt");

        //���������������ļ���
        //System.out.println(file4.mkdir());
        //System.out.println(file4.mkdirs());

        //createNewFile��������.�ļ�
        System.out.println(file4.createNewFile());



    }

}
