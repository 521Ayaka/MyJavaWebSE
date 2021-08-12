package A1_MyJava.基础知识.集合.Collection.List.List集合;
/*
java.util.List集合 继承了 Collection接口

List集合概述:
-- 有序集合(也成为序列)，用户可以精确控制列表中每个元素的插入位置。用户也可以通过整数索引访问元素，比搜索列表中的元素。
-- 与Set集合不同，列表通常允许重复的元素。

List集合特点:
[有序性]: 存储和取出的元素顺序一致。   有索引值。
[可重复]: 存储的元素可以重复。

========================================================================================================================
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_interface {

    public static void main(String[] args) {

        //使用多态的方法创建List对象。
        List<String> list = new ArrayList<>();
        //向集合中添加元素
        list.add("天青日照树下溪");
        list.add("孩童赤脚溪水欢");
        list.add("惊蛙扑通跳水去");
        list.add("溅水飞入湛蓝天");
        list.add("恰是夏日微风起");
        list.add("===========");
        //添加重复元素
        list.add("天青日照树下溪");
        list.add("孩童赤脚溪水欢");
        list.add("惊蛙扑通跳水去");
        list.add("溅水飞入湛蓝天");
        list.add("恰是夏日微风起");
        list.add("===========");
        //也重写了toString()方法
        System.out.println(list);

        System.out.println("==========================================================================================");
        System.out.println("有序集合，可以通过索引值调用相应位置元素");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println("==========================================================================================");

        //遍历集合
        //使用索引循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //使用迭代器遍历
        System.out.println("通过iterator迭代器遍历");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }



    }

}
