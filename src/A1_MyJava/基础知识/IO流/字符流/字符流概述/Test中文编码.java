package A1_MyJava.����֪ʶ.IO��.�ַ���.�ַ�������;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;//ʹ�ñ�����ӡ����

public class Test���ı��� {

    public static void main(String[] args) throws IOException {

        //���ֽ� ��ȡ�ļ�
        FileInputStream fis1 = new FileInputStream("src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ���\\�ַ�������\\�ļ�.txt");
        int by;
        while ((by = fis1.read()) != -1){
            System.out.print((char) by); //abc ???��
        }
        fis1.close();
        System.out.println("\n======================");

        //byte���� ��ȡ�ļ�
        FileInputStream fis2 = new FileInputStream("src\\A1_MyJava\\����֪ʶ\\IO��\\�ַ���\\�ַ�������\\�ļ�.txt");
        byte [] array = new byte[1024];
        int len;
        while ((len = fis2.read(array)) != -1){
            System.out.print(new String(array,0,len)); //abc �й�
        }
        fis2.close();
        System.out.println("\n======================");

        /*
        ������ȡ���: abc ???��
        �����ȡ���: abc �й�

        һ�����ֵĴ洢��
            GBK: ռ�����ֽ�
            UTF-8: ռ�����ַ�
        */

        byte[] by1 = "�й�".getBytes();
        System.out.println(Arrays.toString(by1));//[-42, -48, -71, -6] Ĭ�Ϻ͸��ļ�ͬ���ı���
        byte[] by2 = "�й�".getBytes("GBK");
        System.out.println(Arrays.toString(by2));//[-42, -48, -71, -6]
        byte[] by3 = "�й�".getBytes("UTF-8");
        System.out.println(Arrays.toString(by3));//[-28, -72, -83, -27, -101, -67]

        /*
            ������
               1. ����ռ����ֽ�����ʾ��
               2. ����ʲô�����ʽ������ÿ���ֽڱ��붼�Ǹ���
               3. ���Ǹ�����֤�˺��ֱ���������ԣ���ϵͳʶ����byteʱ����֪���Ǻ����ˣ���Ӧ�����ʽƴ��

            ����:
               �����ֽڶ�ȡ���룬��Ϊ����ռ����ֽڣ������ֽڶ�ȡ�϶�������
               byte����������룬��ȡ��ϵͳʶ��Ϊ�������룬��֪���Ǻ��֣���ͨ����Ӧ�ı����ʽ��ƴ�ӳ�Ϊ��Ӧ�ĺ���

            ����:
               �����ֽ����������Ĳ����ر𷽱�,����Java���ṩ���ַ���
               [�ַ���] = [�ֽ���] + [�����ʽ]

        */

    }

}
