package 基础知识.λ和Stream流.A3_Stream常见的中间操作;
/*
 Stream中的filter过滤器
    Stream<T> filter(Predicate<? super T> predicate)
    返回由与此给定谓词匹配的此流的元素组成的流。

    使用Lambda表达式
*/

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test1_filter_Me {

    public static void main(String[] args) {

        //先创建一个测试数组
        ArrayList<String> list = new ArrayList<>();
        list.add("尴尬");
        list.add("尴尬酱");
        list.add("尴尬帝");
        list.add("这就尴尬");
        list.add("不尴尬");

        //需求1: 把list集合中元素开头为[尴]的筛选出来
        //Stream<T> filter(Predicate<? super T> predicate);
        /*
        list.stream().filter( (String s) ->{
            return s.startsWith("尴");//返回值是一个布尔值。
        } ).forEach(s->System.out.println(s));
        */

        //Lambda表达式优化简化
        list.stream().filter(s -> s.startsWith("尴"))//λ省略
                .forEach(System.out::println);//类方法引用

        System.out.println("============================");

        //需求2: 将长度为3的字符筛选出来
        list.stream().filter(s -> s.length() == 3)//筛选长度为3的字符
                .forEach(System.out::println);

        System.out.println("============================");

        //需求3: 开头为[尴],长度为3的字符筛选出来
        list.stream().filter(s -> s.startsWith("尴"))
                     .filter(s -> s.length() == 3)
                     .forEach(System.out::println);

        list.stream().limit(list.size()).forEach(System.out::println);

    }

}
