package ����֪ʶ.�˺�Stream��.A3_Stream�������м����;
/*
 Stream�е�filter������
    Stream<T> filter(Predicate<? super T> predicate)
    ��������˸���ν��ƥ��Ĵ�����Ԫ����ɵ�����

    ʹ��Lambda���ʽ
*/

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test1_filter_Me {

    public static void main(String[] args) {

        //�ȴ���һ����������
        ArrayList<String> list = new ArrayList<>();
        list.add("����");
        list.add("���ν�");
        list.add("���ε�");
        list.add("�������");
        list.add("������");

        //����1: ��list������Ԫ�ؿ�ͷΪ[��]��ɸѡ����
        //Stream<T> filter(Predicate<? super T> predicate);
        /*
        list.stream().filter( (String s) ->{
            return s.startsWith("��");//����ֵ��һ������ֵ��
        } ).forEach(s->System.out.println(s));
        */

        //Lambda���ʽ�Ż���
        list.stream().filter(s -> s.startsWith("��"))//��ʡ��
                .forEach(System.out::println);//�෽������

        System.out.println("============================");

        //����2: ������Ϊ3���ַ�ɸѡ����
        list.stream().filter(s -> s.length() == 3)//ɸѡ����Ϊ3���ַ�
                .forEach(System.out::println);

        System.out.println("============================");

        //����3: ��ͷΪ[��],����Ϊ3���ַ�ɸѡ����
        list.stream().filter(s -> s.startsWith("��"))
                     .filter(s -> s.length() == 3)
                     .forEach(System.out::println);

        list.stream().limit(list.size()).forEach(System.out::println);

    }

}
