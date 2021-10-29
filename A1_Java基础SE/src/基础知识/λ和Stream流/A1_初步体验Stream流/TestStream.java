package ����֪ʶ.�˺�Stream��.A1_��������Stream��;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestStream {

    public static void main(String[] args) {

        //ʵ�ָ÷���1: ��ʹ��Stream��
        ArrayList<String> list = new ArrayList<>();
        list.add("����");
        list.add("������");
        list.add("���ν�");
        list.add("���������");
        list.add("���ε�");
        list.add("������");
        list.add("�ż�Ž�");
        //��һ��ɸѡ: ��[��]��ͷ��
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("��")) {
                list1.add(s);
            }
        }
        //�ڶ���ɸѡ: �ַ�����Ϊ�����ַ�
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.length() == 3) {
                list2.add(s);
            }
        }
        //��ӡ���
        System.out.println(list2);
        System.out.println("==========================");

        //ʵ�ָ÷���2: ʹ��Stream��
        ArrayList<String> listStream = new ArrayList<>();
        listStream.add("����");
        listStream.add("������");
        listStream.add("���ν�");
        listStream.add("���������");
        listStream.add("���ε�");
        listStream.add("������");
        listStream.add("�ż�Ž�");

        //ֻҪһ��������� �����������д���
        listStream.stream().filter( s -> s.startsWith("��") ).filter(s -> s.length() == 3).forEach( s-> System.out.println(s) );

        System.out.println("==========================");

        //�Ż�: ��������
        listStream.stream().filter(s -> s.startsWith("��"))
                     .filter(s -> s.length()==3)
                     .forEach(System.out::println);


    }

}
