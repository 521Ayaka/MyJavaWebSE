package ����֪ʶ.���.JavaString;
/*
�ַ����Ľ�ȡ������
public String substring(int index) ��ȡ�Ӳ���λ�õ��ַ�����β��һ�����ַ������������ַ��������Ǵ��ַ�����һ�����ַ�����
public String substring(int begin, int end) begin�ǿ�ʼ��ȡ������ֵ��end�ǽ�����ȡ��λ������ֵ��
�ص�ע�⣺begin��end ��������ֵ �Ҷ�Ӧ�������ǣ�[begin,end) begin�ǰ����ģ�����end�ǲ������ģ���������������������������

*/
public class Substring {

    public static void main(String[] args) {

        String str = "�����ү��ǧ�������ү��ǧǧ";
        System.out.println("============================================");

        String str1 = str.substring(7);
        System.out.println(str1);

        System.out.println("=============================================");

        String str2 = str.substring(7,13);//ע�⣺��������ֵ end:13 �ǲ������İ�
        System.out.println(str2);


        // ��������д�����ַ�����������Ȼ��û�иı��
        // �����������ַ�����"Hello"��"Java"
        // strA���б�����ǵ�ֵַ��
        // ������ֵַ��Hello��0x666��
        // ������ֵַ�����Java��0x999
        String strA = "Hello";
        System.out.println(strA); // Hello
        strA = "Java";
        System.out.println(strA); // Java


    }

}
