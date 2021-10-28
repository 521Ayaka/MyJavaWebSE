package A1_MyJava.基础知识.λ和Stream流.A3_Stream常见的中间操作;
/*
Stream流常用的方法:

    static <T> Stream<T> concat(Stream<? extends T> a,
                            Stream<? extends T> b)
    创建一个懒惰连接的流，其元素是第一个流的所有元素，后跟第二个流的所有元素。
    如果两个输入流都被排序，则生成的流被排序，并且如果任何一个输入流是并行的，则并行。
    当结果流关闭时，调用两个输入流的关闭处理程序。

    Stream<T> distinct()
        返回由该流的不同元素（根据Object.equals(Object) ）组成的流。


*/

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test3_concat_distinct {

    public static void main(String[] args) {

        //先创建一个集合
        ArrayList<String> list = new ArrayList<>();
        list.add("尴尬");
        list.add("尴尬酱");
        list.add("尴尬帝");
        list.add("这就尴尬");
        list.add("不尴尬");

        //要求1: 获取前3个元素的流
        Stream<String> s1 = list.stream().limit(3);

        //要求2: 获取跳过2个元素的流
        Stream<String> s2 = list.stream().skip(2);

        //要求3: 合并要求1和2的流,并输出
        Stream.concat(s1,s2).forEach(System.out::println);

        System.out.println("============");
        s1 = list.stream().limit(3);
        s2 = list.stream().skip(2);

        //要求4: 合并要求1和2的流,并输出,元素不重复
        Stream.concat(s1,s2).distinct().forEach(System.out::println);
        //注意: Stream.concat(s1,s2)要求3用过后,s1和s2不能再次使用,要重新赋值。

    }

}
