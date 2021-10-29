package ����֪ʶ.�˺�Stream��.A2_Stream�������ɷ�ʽ;
/*
    Stream���ĳ������ɷ�ʽ:
        1: Collection������ϵ ����ʹ��Ĭ�Ϸ���stream()������
                default Stream<E> stream(){//...}

        2: Map������ϵ ����ֱ������ ֻ�ܼ�ӵ�������

        3: ���� ����ͨ��Stream�ӿڵľ�̬����:
                of(T... values)������

*/


import java.util.*;
import java.util.stream.*;

public class TestNewStream {

    public static void main(String[] args) {
        //1: Collection������ϵ ����ʹ��Ĭ�Ϸ���stream()������
        //      default Stream<E> stream(){//...}
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();

        //2: Map������ϵ ����ֱ������ ֻ�ܼ�ӵ�������
        Map<String,Integer> map =new HashMap<>();
        //ͨ��map�� [��] �� [ֵ] ������Stream��
        Stream<String> mapKeyStream = map.keySet().stream();
        Stream<Integer> mapValueStream = map.values().stream();

        //ͨ����������ΪMap����
        //Stream<Map<String,Integer>> sm =map.entrySet().stream();

        //3: ���� ����ͨ��Stream�ӿڵľ�̬����:
        //      of(T... values)������
        String[] strArray1 = {"��Զ","����"};
        Stream<String> strStream1 = Stream.of(strArray1);
        Stream<String> strStream2 = Stream.of("��Զ","����");
        Stream<Integer> intStream = Stream.of(1,2,3);//�ɱ����������ֱ��д�����飬Ҳ���Ե���д��ֵ



    }



}
