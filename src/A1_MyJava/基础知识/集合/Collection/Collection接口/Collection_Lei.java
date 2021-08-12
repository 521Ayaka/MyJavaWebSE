package A1_MyJava.基础知识.集合.Collection.Collection接口;

import java.util.ArrayList;
import java.util.Collection;

/** API中介绍:
* Collection 层次结构 中的根接口。Collection 表示一组对象，这些对象也称为 collection 的元素。一些 collection 允许有重复的元素，而另一些则不允许。
* 一些 collection 是有序的，而另一些则是无序的。JDK 不提供此接口的任何直接 实现：它提供更具体的子接口（如 Set 和 List）实现。
* 此接口通常用来传递 collection，并在需要最大普遍性的地方操作这些 collection。
**/
/*
Collection不能直接实现，只能实现子接口[List]和[Set]两个子接口。
java.util.Collection           Collection<泛型>

Collection是单列集合的顶层接口，它表示一组对象，这些对象也称为Collection的元素。
JDK不提供此接口的任何直接实现，它提供更具体的子接口(List和Set)实现。

创建Collection集合的对象。
-使用多态的方法
-具体实现类List的ArrayList

========================================================================================================================
Collection集合常用方法

   boolean add(E e)            添加元素
   boolean remove(Object o)    从集合中移除指定的元素 【参数不是索引值，是对象元素内容】
   void clear()                清空集合中的元素
   boolean contains(Object o)  判断集合中是否存在指定的元素
   boolean isEmpty()           判断集合是否为空
   int size()                  集合的长度，也就是集合中元素的个数。

========================================================================================================================
使用快捷键ALT+7 打开结构，可以看到类的所有信息 方法

*/
public class Collection_Lei {

    public static void main(String[] args) {
        //使用多态的写法
        Collection<String> arrayList = new ArrayList<String>();
        arrayList.add("问君能有几多愁，");
        arrayList.add("恰似一江春水向东流。");
        System.out.println(arrayList);
        //对象是new出来的，直接打印的是地址值，如果不是，重写了toString()方法

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        //boolean add(E e) 添加元素
        boolean boo = arrayList.add("流呀流流到外婆桥");
        System.out.println(boo+" "+arrayList);
        System.out.println("==============================================");

        //boolean remove(Object o) 从集合中删除指定的元素
        boolean boo1 = arrayList.remove(1);//是对象，不是索引值
        boolean boo2 = arrayList.remove("流呀流流到外婆桥");
        System.out.println(boo1 + " " + boo2 + arrayList);
        System.out.println("==============================================");

        //void clear() 清空集合中的元素
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println("==============================================");

        //boolean contains(Object o) 判断集合中是否存在指定的元素
        arrayList.add("问君能有几多愁，");
        arrayList.add("恰似一江春水向东流。");
        boolean boole = arrayList.contains("恰似一江春水向东流。");
        System.out.println(boole+" "+arrayList);
        System.out.println("==============================================");

        //boolean isEmpty() 判断集合是否为空
        boolean booE = arrayList.isEmpty();
        System.out.println(booE + " " + arrayList);
        System.out.println("==============================================");

        //int size() 集合的长度，也就是集合中元素的个数。
        int size = arrayList.size();
        System.out.println(size + " " + arrayList);
        System.out.println("==============================================");
    }

}
