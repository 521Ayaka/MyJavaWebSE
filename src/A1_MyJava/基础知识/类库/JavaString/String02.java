package A1_MyJava.����֪ʶ.���.JavaString;
/*
String�ַ��������أ�
������ֱ��д�ϵ�˫���ŵ��ַ����������ַ����������С�

���ڻ���������˵��==�ǽ�����ֵ�ıȽϡ�
��������������˵��==�ǽ��е�ֵַ�ıȽϡ�


 */
public class String02 {
    public static void main(String[] args) {

        String str01 = "ABC";
        String str02 = "ABC";

        char [] chararray= {'A','B','C'};
        String str03 = new String(chararray);

        System.out.println(str01 == str02);  //true
        System.out.println(str01 == str03);  //false
        System.out.println(str02 == str03);  //false



    }
}
