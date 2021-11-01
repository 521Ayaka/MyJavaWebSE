package ����֪ʶ.�˺�Stream��.A5_Stream���ռ�����;
/*
Stream�����ռ�����:

    R collect (Collector coll)

    ����: Collectors�ṩ�˾������Ƿ�ʽ��
        public static <T> Collector toList(): ��Ԫ���ռ���List�����С�
        public static <T> Collector toSet():  ��Ԫ���ֻ���Set������
        public static Collector toMap (Function keyMapper, Function valueMapper);

*/

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollect {

    public static void main(String[] args) {

        listMe();
        setMe();
        mapMe();
        Me();


    }

    //set����
    public static void listMe() {
        //�ȴ���һ��list����
        ArrayList<String> list = new ArrayList<>();
        list.add("���ν�");
        list.add("���������");
        list.add("����");
        list.add("���ε�");
        list.add("������");
        list.add("������");

        //����1: �õ�����Ϊ3���ַ�����
        Stream<String> listStream = list.stream().filter(s -> s.length() == 3);

        //����2: ʹ��Stream��������ϵ������ռ���List�����в�����
        List<String> list1 = listStream.collect(Collectors.toList());
        for (String str : list1) {
            System.out.println(str);
        }

        System.out.println("===================================");

    }


    //set����
    public static void setMe() {
        //����Set����
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(35);
        set.add(55);
        set.add(66);

        //����1: �õ�����Ϊ30���ϵ���
        Stream<Integer> setStream = set.stream().filter(i -> i > 30);

        //����2: ʹ��Stream��������ϵ������ռ���Set�����в�����
        Set<Integer> setNew = setStream.collect(Collectors.toSet());
        for (int i : setNew) {
            System.out.println(i);
        }

        System.out.println("===================================");
    }


    //����
    public static void mapMe() {
        //����һ���ַ�����
        String[] array = {"���ν�,16", "���ε�,20,", "������,9", "����,18", "������,13"};

        //����1: �õ��ַ������������15�����
        Stream<String> arrayStream =
                Stream.of(array).filter(s -> Integer.parseInt(s.split(",")[1]) > 15);

        //����2: ���õ����ַ��� ������Ϊ�� ����Ϊֵ ����map���ϵ���
        Map<String,Integer> map =arrayStream.collect(Collectors.toMap( //ͨ��Collectors�е�toMap��ȡCollector�����
                s -> s.split(",")[0],//��һ��LambdaΪ�� �Զ�ʶ����
                s -> Integer.parseInt(s.split(",")[1])));//�ڶ���LambdaΪֵ ����תΪint����
        //����
        Set<String> mapK = map.keySet();
        for (String k : mapK) {
            int v = map.get(k);
            System.out.println("����: " + k + ", ����: " + v);
        }


    }

    public static void Me() {

    }

}
