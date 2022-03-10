package 基础知识.λ和Stream流.A5_Stream流收集操作;
/*
Stream流的收集方法:

    R collect (Collector coll)

    其中: Collectors提供了具体的书记方式。
        public static <T> Collector toList(): 把元素收集到List集合中。
        public static <T> Collector toSet():  把元素手机到Set集合中
        public static Collector toMap (Function keyMapper, Function valueMapper);

*/

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollect {

    public static void main(String[] args) {

        listMe();
        setMe();
        mapMe();
        Me();


    }

    //set集合
    public static void listMe() {
        //先创建一个list集合
        ArrayList<String> list = new ArrayList<>();
        list.add("尴尬酱");
        list.add("这就尴尬了");
        list.add("尴尬");
        list.add("尴尬帝");
        list.add("尴尬了");
        list.add("不尴尬");

        //需求1: 得到名字为3个字符的流
        Stream<String> listStream = list.stream().filter(s -> s.length() == 3);

        //需求2: 使用Stream流操作完毕的数据收集到List集合中并便利
        List<String> list1 = listStream.collect(Collectors.toList());
        for (String str : list1) {
            System.out.println(str);
        }

        System.out.println("===================================");

    }


    //set集合
    public static void setMe() {
        //创建Set集合
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(35);
        set.add(55);
        set.add(66);

        //需求1: 得到年龄为30以上的流
        Stream<Integer> setStream = set.stream().filter(i -> i > 30);

        //需求2: 使用Stream流操作完毕的数据收集到Set集合中并便利
        Set<Integer> setNew = setStream.collect(Collectors.toSet());
        for (int i : setNew) {
            System.out.println(i);
        }

        System.out.println("===================================");
    }


    //数组
    public static void mapMe() {
        //创建一个字符数组
        String[] array = {"尴尬酱,16", "尴尬帝,20,", "尴尬了,9", "尴尬,18", "不尴尬,13"};

        //需求1: 得到字符串中年龄大于15岁的流
        Stream<String> arrayStream =
                Stream.of(array).filter(s -> Integer.parseInt(s.split(",")[1]) > 15);

        //需求2: 将得到的字符串 按姓名为键 年龄为值 放入map集合当中
        Map<String,Integer> map =arrayStream.collect(Collectors.toMap( //通过Collectors中的toMap获取Collector类对象
                s -> s.split(",")[0],//第一个Lambda为键 自动识别泛型
                s -> Integer.parseInt(s.split(",")[1])));//第二个Lambda为值 这里转为int类型
        //遍历
        Set<String> mapK = map.keySet();
        for (String k : mapK) {
            int v = map.get(k);
            System.out.println("姓名: " + k + ", 年龄: " + v);
        }


    }

    public static void Me() {

    }

}
