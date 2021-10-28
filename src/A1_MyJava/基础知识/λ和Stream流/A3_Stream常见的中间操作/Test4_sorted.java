package A1_MyJava.基础知识.λ和Stream流.A3_Stream常见的中间操作;
/*
Stream流常见的中间操作

    //自然排序
    Stream<T> sorted()
        返回由此流的元素组成的流，根据自然顺序排序。
        如果该流的元件不是Comparable ，
        一个java.lang.ClassCastException执行终端操作时，可以抛出。

    //比较器排序
    Stream<T> sorted(Comparator<? super T>  comparator)
        返回由该流的元素组成的流，根据提供的Comparator进行排序。
        对于有序流，排序稳定。 对于无序的流，不能保证稳定性。

*/

import java.util.ArrayList;

public class Test4_sorted {

    public static void main(String[] args) {

        //先创建一个集合
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abcd");
        list.add("da");
        list.add("bac");
        list.add("zzzz");
        list.add("hhhh");
        list.add("dcba");
        list.add("z");

        //要求1: 自然排序,按照字母顺序排序
        list.stream().sorted().forEach(System.out::println);

        System.out.println("========");

        //要求2: 比较器排序,按照字符长度进行排序
        list.stream().sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);

        System.out.println("========");

        //要求3: 比较器排序,先按照字符长度排序,如果字符长度相同,则按照字符顺序进行排序。
        list.stream().sorted((s1,s2)->{
            int num1 = s1.length() - s2.length();
            int num2 = num1==0? s1.compareTo(s2) : num1;
            return num2;
        }).forEach(System.out::println);

    }

}
