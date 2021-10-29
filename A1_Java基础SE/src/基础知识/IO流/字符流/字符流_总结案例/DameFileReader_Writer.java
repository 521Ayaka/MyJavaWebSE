package ����֪ʶ.IO��.�ַ���.�ַ���_�ܽ᰸��;

/*
    �Ż�����: ʹ�� [����ԴFileReader] [Ŀ�ĵ�FileWriter] ʵ��

    FileReader: Ϊ������ [��ȡ�ַ��ļ�] �� [�������] �̳��� InputStreamReader
                FileReader(File file)
                FileReader(String fileName)

    FileWriter: Ϊ������ [д���ַ��ļ�] �� [�������] �̳��� OutputStreamWriter
                FileWriter(File file)
                FileWriter(String fileName)

����Դ: Դ�ļ���ַFile��������>�����ݡ�������>Reader��������>InputStreamReader��������>FileReader
       File���װ��ַ��������>��������>�ַ��������ࡪ������>ʹ��ʵ�������ʵ�֡�������>ʹ�������������
Ŀ�ĵ�: Դ�ļ���ַFile��������>д���ݡ�������>Writer��������>OutputStreamWriter��������>FileWriter

[ע��]: FileReader FileWriter ��Ȼ��������д,
       ����,����漰�������������ʱ,�Ͳ������ˡ�

*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DameFileReader_Writer {

    public static void main(String[] args) throws IOException {
        //������ֱ���׳����쳣,û����try...catch...finally����,��׼Ӧ���û���

        //��������Դ�����ַ�����������,���ڶ�ȡ����
        FileReader fr = new FileReader("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�ܽ᰸��\\DameFileCopy.java");
        //����Ŀ�ĵش����ַ����������,����д������
        FileWriter fw = new FileWriter("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ���\\�ַ���_�ܽ᰸��\\���Ƶ�����\\DameFileCopy_FUBEN.java");

        //��д����
        /*�����ֽڶ�ȡ����
        int by;
        while ((by = fr.read()) != -1) {
            fw.write((char) by);
        }*/
        //char[] ����
        char[] array = new char[1024];
        int len;
        while ((len = fr.read(array))!=-1){
            fw.write(new String(array,0,len));
        }

        //�ͷ���Դ
        fr.close();
        fw.close();
    }

}
