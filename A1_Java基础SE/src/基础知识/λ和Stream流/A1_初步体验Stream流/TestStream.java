package 基础知识.λ和Stream流.A1_初步体验Stream流;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestStream {

    public static void main(String[] args) {

        //实现该方法1: 不使用Stream流
        ArrayList<String> list = new ArrayList<>();
        list.add("尴尬");
        list.add("尴尬了");
        list.add("尴尬酱");
        list.add("这就尴尬了");
        list.add("尴尬帝");
        list.add("不尴尬");
        list.add("九监九介");
        //第一次筛选: 以[尴]开头的
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("尴")) {
                list1.add(s);
            }
        }
        //第二次筛选: 字符长度为三个字符
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.length() == 3) {
                list2.add(s);
            }
        }
        //打印输出
        System.out.println(list2);
        System.out.println("==========================");

        //实现该方法2: 使用Stream流
        ArrayList<String> listStream = new ArrayList<>();
        listStream.add("尴尬");
        listStream.add("尴尬了");
        listStream.add("尴尬酱");
        listStream.add("这就尴尬了");
        listStream.add("尴尬帝");
        listStream.add("不尴尬");
        listStream.add("九监九介");

        //只要一个步骤操作 简化了上面所有代码
        listStream.stream().filter( s -> s.startsWith("尴") ).filter(s -> s.length() == 3).forEach( s-> System.out.println(s) );

        System.out.println("==========================");

        //优化: 方法引用
        listStream.stream().filter(s -> s.startsWith("尴"))
                     .filter(s -> s.length()==3)
                     .forEach(System.out::println);


    }

}
