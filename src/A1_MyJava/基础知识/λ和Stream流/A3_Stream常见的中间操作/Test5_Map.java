package A1_MyJava.基础知识.λ和Stream流.A3_Stream常见的中间操作;
/*
Stream流中常见的中间操作:

    map<R> Stream<R> map(Function<? super T,? extends R> mapper)
        返回由给定函数应用于此流的元素的结果组成的流。
        这是一个intermediate operation 。

    IntStream mapToInt(ToIntFunction<? super T> mapper)
        返回一个IntStream ，其中包含将给定函数应用于此流的元素的结果。
        这是一个intermediate operation 。

*/

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Test5_Map {

    public static void main(String[] args) {

        //先创建一个数组
        ArrayList<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");

        //将字符转为int  map
        //list.stream().map(s -> Integer.parseInt(s)).forEach(System.out::println);
        //改进
        list.stream().map(Integer::parseInt).forEach(System.out::println);

        System.out.println("=========");

        //将字符转为int,并求和  mapToInt
        IntStream intStream = list.stream().mapToInt(Integer::parseInt);
        //调用了mapToInt()方法后,返回的IntStream类型。
        int sum = intStream.sum();//IntStream类中有自己的方法。
        System.out.println(sum);

        //改进
        int sum1 = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum1);


    }

}
