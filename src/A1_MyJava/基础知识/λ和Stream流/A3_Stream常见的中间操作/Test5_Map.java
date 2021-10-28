package A1_MyJava.����֪ʶ.�˺�Stream��.A3_Stream�������м����;
/*
Stream���г������м����:

    map<R> Stream<R> map(Function<? super T,? extends R> mapper)
        �����ɸ�������Ӧ���ڴ�����Ԫ�صĽ����ɵ�����
        ����һ��intermediate operation ��

    IntStream mapToInt(ToIntFunction<? super T> mapper)
        ����һ��IntStream �����а�������������Ӧ���ڴ�����Ԫ�صĽ����
        ����һ��intermediate operation ��

*/

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Test5_Map {

    public static void main(String[] args) {

        //�ȴ���һ������
        ArrayList<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");

        //���ַ�תΪint  map
        //list.stream().map(s -> Integer.parseInt(s)).forEach(System.out::println);
        //�Ľ�
        list.stream().map(Integer::parseInt).forEach(System.out::println);

        System.out.println("=========");

        //���ַ�תΪint,�����  mapToInt
        IntStream intStream = list.stream().mapToInt(Integer::parseInt);
        //������mapToInt()������,���ص�IntStream���͡�
        int sum = intStream.sum();//IntStream�������Լ��ķ�����
        System.out.println(sum);

        //�Ľ�
        int sum1 = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum1);


    }

}
