package ����֪ʶ.���.JavaString;

/*
String�г������ȡ��صķ����У�

1.public int length()               ��ȡ�ַ����ĳ��ȡ�   ע�⣺�޲�����������..
2.public String concat(String str)  ����ǰ�ַ����Ͳ����ַ���ƴ�ӳ�Ϊ�µ��ַ������������ַ�����
3.public char charAt(int index)     ��ȡָ������λ�õĵ����ַ������������㿪ʼ����
3.public int indexOf(String str)    ���Ҳ����ַ����ڵ�ǰ�ַ����е�һ�γ��ֵ�λ������ֵ�����û���ⷵ��ֵΪ-1�����������㿪ʼ����


 */
public class StringGet {
    public static void main(String[] args) {

        //��ȡ�ַ�������
        int length = "gangajiangwansui".length();
        System.out.println("�ַ�������Ϊ��"+length);
        System.out.println("===========================");

        //�����ַ���
        String str1 = "���ν�";
        String str2 = "����";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("===========================");

        //��ȡָ������λ�õĵ����ַ�
        String str4 = "��Զ�������ν���";
        for (int i = 0; i < str4.length(); i++) {
            char charat = str4.charAt(i);
            System.out.println(charat);
        }
        System.out.println("============================");

        //���Ҳ����ַ����ڵ�ǰ�ַ����е�һ�γ��ֵ�λ������ֵ
        String str5 = "��Զ�������ν������ν����꣡";
        int ���ν� = str5.indexOf("���ν�");
        System.out.println("�ҵĵ�һ��λ���ǣ�"+���ν�);


    }
}
