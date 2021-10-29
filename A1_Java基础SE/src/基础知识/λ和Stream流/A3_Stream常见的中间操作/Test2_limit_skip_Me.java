package 基础知识.λ和Stream流.A3_Stream常见的中间操作;
/*
Stream流中间操作：

    Stream<T> limit(long maxSize)
        返回由该流的元素组成的流，截断长度不能超过maxSize 。

    Stream<T> skip(long n)
        在丢弃流的第一个n元素后，返回由该流的n元素组成的流。
        如果此流包含少于n元素，那么将返回一个空流。和


*/

import java.util.ArrayList;

public class Test2_limit_skip_Me {

    public static void main(String[] args) {

        //先创建一个测试数组
        ArrayList<String> list = new ArrayList<>();
        list.add("尴尬");
        list.add("尴尬酱");
        list.add("尴尬帝");
        list.add("这就尴尬");
        list.add("不尴尬");

        //使用limit限制长度   //这个参数是 [元素个数] 不是索引
        list.stream().limit(3).forEach(System.out::println);

        System.out.println("===========================");

        //可以进行便利        //size方法也是 [元素个数] 不是索引
        list.stream().limit(list.size()).forEach(System.out::println);


        System.out.println("===========================");
        System.out.println("===========================");

        //使用skip跳过前参数个元素 参数类型为long
        //然后截取以后的所有元素。
        list.stream().skip(3).forEach(System.out::println);


        System.out.println("===========================");
        System.out.println("===========================");

        //跳过前两个，将剩下的前两个的输出
        list.stream().skip(2).limit(2).forEach(System.out::println);


    }

}
