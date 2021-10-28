package A1_MyJava.����֪ʶ.�˺�Stream��.A3_Stream�������м����;
/*
Stream���������м����

    //��Ȼ����
    Stream<T> sorted()
        �����ɴ�����Ԫ����ɵ�����������Ȼ˳������
        ���������Ԫ������Comparable ��
        һ��java.lang.ClassCastExceptionִ���ն˲���ʱ�������׳���

    //�Ƚ�������
    Stream<T> sorted(Comparator<? super T>  comparator)
        �����ɸ�����Ԫ����ɵ����������ṩ��Comparator��������
        �����������������ȶ��� ����������������ܱ�֤�ȶ��ԡ�

*/

import java.util.ArrayList;

public class Test4_sorted {

    public static void main(String[] args) {

        //�ȴ���һ������
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abcd");
        list.add("da");
        list.add("bac");
        list.add("zzzz");
        list.add("hhhh");
        list.add("dcba");
        list.add("z");

        //Ҫ��1: ��Ȼ����,������ĸ˳������
        list.stream().sorted().forEach(System.out::println);

        System.out.println("========");

        //Ҫ��2: �Ƚ�������,�����ַ����Ƚ�������
        list.stream().sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);

        System.out.println("========");

        //Ҫ��3: �Ƚ�������,�Ȱ����ַ���������,����ַ�������ͬ,�����ַ�˳���������
        list.stream().sorted((s1,s2)->{
            int num1 = s1.length() - s2.length();
            int num2 = num1==0? s1.compareTo(s2) : num1;
            return num2;
        }).forEach(System.out::println);

    }

}
