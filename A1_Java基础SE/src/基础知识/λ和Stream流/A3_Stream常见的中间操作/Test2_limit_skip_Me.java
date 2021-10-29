package ����֪ʶ.�˺�Stream��.A3_Stream�������м����;
/*
Stream���м������

    Stream<T> limit(long maxSize)
        �����ɸ�����Ԫ����ɵ������ضϳ��Ȳ��ܳ���maxSize ��

    Stream<T> skip(long n)
        �ڶ������ĵ�һ��nԪ�غ󣬷����ɸ�����nԪ����ɵ�����
        ���������������nԪ�أ���ô������һ����������


*/

import java.util.ArrayList;

public class Test2_limit_skip_Me {

    public static void main(String[] args) {

        //�ȴ���һ����������
        ArrayList<String> list = new ArrayList<>();
        list.add("����");
        list.add("���ν�");
        list.add("���ε�");
        list.add("�������");
        list.add("������");

        //ʹ��limit���Ƴ���   //��������� [Ԫ�ظ���] ��������
        list.stream().limit(3).forEach(System.out::println);

        System.out.println("===========================");

        //���Խ��б���        //size����Ҳ�� [Ԫ�ظ���] ��������
        list.stream().limit(list.size()).forEach(System.out::println);


        System.out.println("===========================");
        System.out.println("===========================");

        //ʹ��skip����ǰ������Ԫ�� ��������Ϊlong
        //Ȼ���ȡ�Ժ������Ԫ�ء�
        list.stream().skip(3).forEach(System.out::println);


        System.out.println("===========================");
        System.out.println("===========================");

        //����ǰ��������ʣ�µ�ǰ���������
        list.stream().skip(2).limit(2).forEach(System.out::println);


    }

}
