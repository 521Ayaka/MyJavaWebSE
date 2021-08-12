package A1_MyJava.基础知识.集合.Collection.Set.Set集合;

/*
Set集合没什么太大的特点
当学完Collection接口时，就相当于学完Set集合
但要注意:
Set集合特点:
1. 不包含重复元素的集合
2. 没有带索引的方法, 所以不能使用普通for循环遍历。

HashSet: 它不保证 set 的迭代顺序

Set集合获取和传入都不带索引，而是和Collection一样(Object 0bj)为参数。

*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface {

    public static void main(String[] args) {

        //使用多态的方式创建集合对象
        Set<String> setSet = new HashSet<>();
        setSet.add("这就尴尬了");
        setSet.add("问君能有几多愁");
        setSet.add("恰似一江春水向东流");
        setSet.add("问君能有几多愁");//重复元素
        System.out.println(setSet);//[恰似一江春水向东流, 这就尴尬了, 问君能有几多愁]
                                   // 没有重复元素，也没有顺序
        System.out.println("================================================");
        System.out.println("================================================");

        //遍历集合
        //使用迭代器进行遍历
        Iterator<String> itr = setSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("================================================");

        //使用增强for循环
        for (String name :
                setSet) {
            System.out.println(name);
        }
        System.out.println("================================================");

        System.out.println(setSet.hashCode());
    }

}
