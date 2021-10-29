package 基础知识.集合.Collection.List.List集合.ListIterator迭代器;
/*
java.util.ListIterator<E>
ListIterator也叫: 列表迭代器

[ListIterator概述]:

--- ListIterator是List的listIterator()方法得到的，是List特有的迭代器。
--- ListIterator继承了Iterator接口。
--- 用于允许程序员沿任意方向遍历列表迭代器，在迭代期间修改列表，并获得列表中迭代器的当前位置。


[ListIterator常用方法]:

--- E next()                返回的迭代器中的下一个元素。
--- boolean hasNext()       如果迭代器具有更多元素，则返回true
--- E previous()            返回列表中的上一个元素。
--- boolean hasPrevious()   如果此列表迭代器在相反方向遍历列表具有更多元素，则返回ture

--- void add(E e)           将指定的元素插入列表                        【重点！】
                            【注意】:用的是ListIterator的对象进行add添加元素，而不是原集合list添加。

*/
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Method {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("亚索");
        list.add("永恩");
        list.add("万豪");

        //多态创建ListIterator对象。
        ListIterator<String> listItr = list.listIterator();
        //正向遍历
        while (listItr.hasNext()){
            String str = listItr.next();
            System.out.println(str);
        }
        System.out.println("========");
        //反向遍历
        while (listItr.hasPrevious()){
            String str = listItr.previous();
            System.out.println(str);
        }
        System.out.println("========");

        System.out.println("===========================================================================================");

        //刚创建的的ListIterator对象的时候，不能直接使用Previous方法。
        //迭代器位置在0索引位置，上一个元素是没有的。
        ListIterator<String> listIte = list.listIterator();
        while (listIte.hasPrevious()){
            String str = listIte.previous();
            System.out.println(str);
        }

        System.out.println("输出结果: ");
//      System.out.println( listIte.previous() );//异常出错: NoSuchElementException
        System.out.println( listIte.next() );//初始化第一个元素是[亚索]，返回元素后，迭代器会向后退1(索引+1)
        System.out.println( listIte.previous() );//迭代器位于第二个元素，执行后向前进1(索引-1)，返回前进后的元素[亚索]
        //报错
        //亚索
        //亚索

        /**
        ListIterator<String> ier = list.listIterator();
        while (true){
            while (listItr.hasNext()){
                String str = listItr.next();
                System.out.print(str);
            }
            System.out.print("==");
            while (listItr.hasPrevious()){
                String str = listItr.previous();
                System.out.print(str);
         }  }
        */
        System.out.print("重点: ");
        //重点add()方法
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String str = listIterator.next();
            if (str.equals("亚索")){
                listIterator.add("牛批,卢本伟没有开挂！"); //用的是ListIterator的对象进行add添加元素，而不是原集合list添加。
            }
        }
        System.out.println(list);
    }

}
