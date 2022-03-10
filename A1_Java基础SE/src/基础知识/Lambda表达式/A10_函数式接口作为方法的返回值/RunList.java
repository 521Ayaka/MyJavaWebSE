package 基础知识.Lambda表达式.A10_函数式接口作为方法的返回值;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RunList {

    public static void main(String[] args) {
        //创建数组
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbbb");
        list.add("d");
        list.add("cc");

        //排序前的集合
        System.out.println("排序前的集合:" + list);

        //自然排序后的集合
        Collections.sort(list);
        System.out.println("自然排序后的集合:" + list);

        //使用比较器排序后的集合
        Collections.sort(list, getComparator02());
        System.out.println("比较器排序后的集合:" + list);


    }


    //Comparator接口是函数式接口:  @FunctionalInterface

    //使用匿名内部类
    private static Comparator<String> getComparator01() {
        //匿名内部类作为返回值
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
    }

    //使用Lambda表达式作为参数返回值
    private static Comparator<String> getComparator02() {
        //compare(String o1,String o2)
        return (o1, o2) -> o1.length() - o2.length();
    }

}
