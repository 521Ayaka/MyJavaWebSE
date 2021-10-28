package A1_MyJava.����֪ʶ.�˺�Stream��.A3_Stream�������м����;
/*
Stream�����õķ���:

    static <T> Stream<T> concat(Stream<? extends T> a,
                            Stream<? extends T> b)
    ����һ���������ӵ�������Ԫ���ǵ�һ����������Ԫ�أ�����ڶ�����������Ԫ�ء�
    ��������������������������ɵ��������򣬲�������κ�һ���������ǲ��еģ����С�
    ��������ر�ʱ�����������������Ĺرմ������

    Stream<T> distinct()
        �����ɸ����Ĳ�ͬԪ�أ�����Object.equals(Object) ����ɵ�����


*/

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test3_concat_distinct {

    public static void main(String[] args) {

        //�ȴ���һ������
        ArrayList<String> list = new ArrayList<>();
        list.add("����");
        list.add("���ν�");
        list.add("���ε�");
        list.add("�������");
        list.add("������");

        //Ҫ��1: ��ȡǰ3��Ԫ�ص���
        Stream<String> s1 = list.stream().limit(3);

        //Ҫ��2: ��ȡ����2��Ԫ�ص���
        Stream<String> s2 = list.stream().skip(2);

        //Ҫ��3: �ϲ�Ҫ��1��2����,�����
        Stream.concat(s1,s2).forEach(System.out::println);

        System.out.println("============");
        s1 = list.stream().limit(3);
        s2 = list.stream().skip(2);

        //Ҫ��4: �ϲ�Ҫ��1��2����,�����,Ԫ�ز��ظ�
        Stream.concat(s1,s2).distinct().forEach(System.out::println);
        //ע��: Stream.concat(s1,s2)Ҫ��3�ù���,s1��s2�����ٴ�ʹ��,Ҫ���¸�ֵ��

    }

}
