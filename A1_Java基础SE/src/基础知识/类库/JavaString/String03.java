package ����֪ʶ.���.JavaString;

/*
 ==�ǽ��ж���ĵ�ֵַ�Ƚϣ����ȷʵ�ǽ����ַ������бȽϣ�����ʹ������������

 public boolean equals(Object.obj)����������˵�������ֻ�в������ַ�������������ͬ�ĲŻ��true�����򷵻�false��

 ע�����
 1.�κζ�������Object���ա�
 2.equals�������жԳ��ԣ�Ҳ����a.equals(b) �� b.equals(a) Ч��һ����
 3.����Ƚ�һ�� ���� ��һ�� ���� ����ѡ�ѳ����ַ�������ǰ�档
   ��ѡ��"ABC".equals(str);   ����ѡ��str.equals("ABC");

 public boolean equalsIgnoreCase(String str)  �����ִ�Сд�Ĳ���    ��Ҫע����ǲ�����String

*/
public class String03 {

    public static void main(String[] args) {

        String str1 = "ABC";
        String str2 = "ABC";

        char[] chararray = {'A','B','C'};
        String str3 = new String(chararray);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals("ABC"));
        System.out.println("ABC".equals(str3));
        System.out.println("abc".equals(str1));
        System.out.println("================================================");

        String str4 = "ABC";
        String str5 = "abc";
        System.out.println(str4.equals(str5));
        System.out.println(str4.equalsIgnoreCase(str5));


    }

}
