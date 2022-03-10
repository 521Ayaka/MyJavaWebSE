package 基础知识.集合.Collection.Set.Set子集合.TreeSet;

/*
TreeSet集合概述和特点:

1. 【元素是有序的】,这里的顺序不是指存储和取出的顺序，而是按照一定的规则进行排序，具体排序方式取决于构造方法。
     [无参构造]                         TreeSet(): 根据其元素的自然排序进行排序。
     [Comparator] TreeSet(Comparator comparator): 根据指定的比较器进行排序。

2. 没有带索引的方法，所以不能使用普通for循环遍历。

3. 由于是Set集合，所以不包含重复元素的集合。

*/

import java.util.TreeSet;

public class TreeSet_Lei {

    public static void main(String[] args) {

        //创建集合对象
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        //添加元素
        treeSet.add(30);
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(40);

        treeSet.add(30);//重复元素
        treeSet.add(40);//重复元素

        //遍历集合
        for (int num :
                treeSet) {
            System.out.println(num);
        }/*
        10
        20
        30
        40
        50
        */

    }

}
