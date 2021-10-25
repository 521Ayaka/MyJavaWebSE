package A1_MyJava.����֪ʶ.�˺�Stream��.A2_Stream�������ɷ�ʽ;
/*
    Stream���ĳ������ɷ�ʽ:
        1: Collection������ϵ ����ʹ��Ĭ�Ϸ���stream()������
                default Stream<E> stream(){//...}

        2: Map������ϵ ����ֱ������ ֻ�ܼ�ӵ�������

        3: ���� ����ͨ��Stream�ӿڵľ�̬����:
                of(T... values)������

*/


import java.util.*;
import java.util.stream.Stream;

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

        //ͨ�����͵�

        //3: ���� ����ͨ��Stream�ӿڵľ�̬����:
        //      of(T... values)������
        String[] array = new String[10];







        }



}
