package A1_MyJava.����֪ʶ.���.JavaString;
/*
�ַ������ص㣺
1.�ַ��������������ɱ䡣���ص㡿
2.����Ϊ�ַ��������ݲ����Ա䣬�����ַ����ǿ��Թ���ʹ�õġ�
3.�ַ���Ч�����൱��char[]�ַ����飬���ǵײ�ԭ����byte[]�ֽ����顣

�����ַ�����3+1�ַ�ʽ��
���ֹ��췽����
public String() ����һ���հ��ַ������������κ����ݡ�
public String(char[] array) �����ַ��������ݣ�������Ӧ���ַ�����
public String(byte[] array) �����ֽ��������ݣ�������Ӧ���ַ�����
һ��ֱ�Ӵ�����
String str = "Hello Java";

ע�⣺ֱ��д��˫���ţ������ַ�������
*/

public class String01 {
    public static void main(String[] args) {
        //ʹ�ÿղ������ɷ���
        String str01 = new String();
        System.out.println("��һ�ֹ��췽����"+str01);

        //ʹ��char[] �ַ�����Ϊ���������췽��
        char[] chararray= {'A','B','C'};
        String str02 = new String(chararray);     //�ص�ע�� ������ʽ��������������������
        System.out.println("�ڶ��ֹ��췽����" + str02);

        //ʹ��byte[] �ֽ�����Ϊ���������췽��
        byte[] bytearray ={97,98,99};
        String str03 = new String(bytearray);
        System.out.println("�����ֹ��췽����"+ str03);

        //ʹ��ֱ�Ӵ���
        String str04 = "Hello Java";
        System.out.println("ʹ��ֱ�Ӵ�����"+ str04);

    }
}