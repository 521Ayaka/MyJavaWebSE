package A1_MyJava.����֪ʶ.IO��.File��.File���췽��;

import java.io.File;

/*

File�ࣺ�����ļ���Ŀ¼·�����ĳ����ʾ
1. �ļ���Ŀ¼�ǿ���ͨ��File��װ�ɶ���ġ�
2. ����File����, ���װ�Ĳ�����һ���������ڵ��ļ�,
   ������һ��·�������ѡ��������Ǵ��ڵ�, Ҳ�����ǲ����ڵġ�
   ������Ҫͨ������Ĳ��������·��������ת��Ϊ������ڵġ�

���췽����
public File(String pathname){//...}
ͨ��������·�����ַ���ת��Ϊ����·����������һ����Fileʵ��

public File(String parent, String child){//...}
���� parent ·�����ַ����� child ·�����ַ�������һ����Fileʵ����

public File(File parent, String child){//...}
���� parent ����·������ child ·�����ַ�������һ����Fileʵ����

*/
public class FileLei {

    public static void main(String[] args) {

        //public File(String pathname){//...}
        //ͨ��������·�����ַ���ת��Ϊ����·����������һ����Fileʵ��
        File file1 = new File("D:\\Դ����\\ideback\\����.txt");
        //ideback���ڣ����� ������.txt�� �ǲ����ڵ�
        System.out.println(file1);// ��д��toString()���� D:\Դ����\ideback\����.txt
        /*public String toString() {
            return getPath();
        }*/

        //public File(String parent, String child){//...}
        //���� parent ·�����ַ����� child ·�����ַ�������һ����Fileʵ����
        String parent = "D:\\Դ����";       //��Ŀ¼
        String child = "ideback\\����.txt"; //��Ŀ¼
        File file2 = new File(parent, child);
        System.out.println(file2);//  D:\Դ����\ideback\����.txt

        //public File(File parent, String child){//...}
        //���� parent ����·������ child ·�����ַ�������һ����Fileʵ����
        File file3 = new File("D:\\Դ����");
        File file4 = new File(file3, child);
        System.out.println(file4);//  D:\Դ����\ideback\����.txt


    }

}
