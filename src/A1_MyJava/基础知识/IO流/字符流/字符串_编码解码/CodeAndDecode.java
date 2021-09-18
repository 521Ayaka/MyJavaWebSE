package A1_MyJava.����֪ʶ.IO��.�ַ���.�ַ���_�������;
/*
����: [String�� �е� ��̬����]

    byte[] getBytes(): ʹ��ƽ̨Ĭ���ַ�������String����Ϊһϵ���ֽڣ�������洢���µ��ֽ�����
    byte[] getBytes(String charsetName): ͨ��ָ�����ַ�������...

����: [String�� �е� ���췽��]

    String(byte[] bytes): ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ�����ֽ������������µ�String
    String(byte[] bytes,String charsetName): ͨ��ָ�����ַ�������...

ע��:
    1.���ﵱȻ�õ�IDEAƽ̨����д�����ˣ�IDEAYYDS
    2.�����Ǳ��뻹�ǽ��룬�涨 ��������ʽ �Ĳ�������Ҫ�����쳣����
      �쳣��: UnsupportedEncodingException

*/


import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CodeAndDecode {

    public static void main(String[] args) {

        /**����  String(byte[] bytes): ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ�����ֽ������������µ�String*/
        String str1 = "�й�����";
        byte[] bytes1 = str1.getBytes();
        System.out.println(Arrays.toString(bytes1));
        //�ļ���GBK,IDEA���õ�ǰ�ļ��ı����ʽ:
        //[-42, -48, -71, -6, -70, -70, -41, -42]

        System.out.println("===============================");

        /**����  String(byte[] bytes,String charsetName): ͨ��ָ�����ַ�������...*/
        String str2 = "�й�����";
        try {//��Ҫ�쳣�����������õ���try...catch...�쳣����
            byte[] utf8s = str2.getBytes("UTF8");//ָ��UTF8���б���
            System.out.println(Arrays.toString(utf8s));
            //UTF8�����������ֽ�:
            //[-28, -72, -83, -27, -101, -67, -26, -79, -119, -27, -83, -105]
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("===============================");
        System.out.println("===============================");

        /**����  String(byte[] bytes): ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ�����ֽ������������µ�String*/
        byte [] bytes2 = {-42, -48, -71, -6, -70, -70, -41, -42};
        System.out.println(new String(bytes2));
        //Ĭ��IDEA���룬��ǰ�ļ���GBK,��ôIDEAҲ��GBK
        //���������й�����

        System.out.println("===============================");

        /**����  String(byte[] bytes,String charsetName): ͨ��ָ�����ַ�������...*/
        byte [] bytes3 = {-28, -72, -83, -27, -101, -67, -26, -79, -119, -27, -83, -105};
        try {//��Ȼ��Ҫ�쳣�����������õ���try...catch...�쳣����
            System.out.println(new String(bytes3,"UTF8"));
            //�������ǣ��й�����
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("===============================");
        System.out.println("===============================");

        /* GBK�������byte����,ʹ��UTF8���н��� */
        try {//�������쳣����
            System.out.println(new String(bytes2,"UTF8"));
            //���н��: ?��?????
            //����϶�����ִ���
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

}
