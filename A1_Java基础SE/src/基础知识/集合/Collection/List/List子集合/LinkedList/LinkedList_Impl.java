package 基础知识.集合.Collection.List.List子集合.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/*
List有的方法LinkedList也有就不写了

[LinkedList特有的方法]:

public void addFirst(E e)  在该列表开头插入指定的元素
public void addLast(E e)   将指定的元素追加到此列表的末尾

public E getFirst()        返回此列表中的第一个元素
public E getLast()         返回此列表中的最后一个元素

public E removeFirst()     从此列表中删除并返回第一个元素
public E removeLast()      从此列表中删除并返回最后一个元素

[First]第一           [List] 最后
========================================================================================================================
List有三种方法遍历集合,
所以LinkedList也有三种方法遍历集合

*/
public class LinkedList_Impl {

    public static void main(String[] args) {

        //创建列表
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("亚索");
        linkedList.add("哥哥");
        linkedList.add("你好浪呀");
        linkedList.add(1,"呦哟呦");
        System.out.println(linkedList);
        System.out.println("========================");

        //public void addFirst(E e)  在该列表开头插入指定的元素
        //public void addLast(E e)   将指定的元素追加到此列表的末尾
        linkedList.addFirst("哇！");
        linkedList.addLast("不过我稀饭");
        System.out.println(linkedList);
        System.out.println("========================");

        //public E removeFirst()     从此列表中删除并返回第一个元素
        //public E removeLast()      从此列表中删除并返回最后一个元素
        String strFirst = linkedList.removeFirst(); //移除第一个元素
        String strLast = linkedList.removeLast();   //移除最后一个元素
        System.out.println("移除第一个元素:" + strFirst);
        System.out.println("移除最后一个元素" + strLast);
        System.out.println(linkedList);
        System.out.println("========================");

        //public E getFirst()        返回此列表中的第一个元素
        //public E getLast()         返回此列表中的最后一个元素
        String strGetFirst = linkedList.getFirst();
        String strGetLast = linkedList.getLast();
        System.out.println("获取第一个元素:" + strGetFirst);
        System.out.println("获取最后一个元素:" + strGetLast);
        System.out.println(linkedList);
        System.out.println("========================");

        //==============================================================================================================
        //三种方式遍历LinkedList集合
        System.out.println("三种方式遍历LinkedList集合");

        //1. 使用迭代器
        Iterator<String> itr = linkedList.iterator();
        while (itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }
        System.out.println("========================");


        //2. 使用for循环遍历
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("========================");

        //3. 使用增强for循环
        for (String name:
             linkedList) {
            System.out.println(name);
        }
        System.out.println("========================");

    }

}
