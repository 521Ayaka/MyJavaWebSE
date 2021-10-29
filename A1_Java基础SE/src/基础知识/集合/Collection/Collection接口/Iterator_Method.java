package 基础知识.集合.Collection.Collection接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator_Method {

    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        list.add("问世间情为何物，");
        list.add("直教人生死相许。");

        Iterator<String> it = list.iterator();
        /**
        list.iterator;返回的是Ite对象，Itr是Iterator<E>的实现类。
        所以说这里是用了多态的方法创建的
        */

        /*
        public Iterator<E> iterator() {
            return new Itr();  //返回的是Itr对象
        }
                      ?
        //Itr是ArrayList的内部类
        private class Itr implements Iterator<E>{
                //...
        }

        */

        System.out.println(it.next());
        System.out.println(it.next());
        //System.out.println(it.next());
        // NoSuchElementException: 表明枚举中没有更多的元素。

        System.out.println("===================================");

        list.add("本是两情相愿");
        list.add("又其在朝朝暮暮");
        Iterator<String> ite = list.iterator();
        //1
        if (ite.hasNext()){
            System.out.println(1+": "+ite.next());
        }
        //2
        if (ite.hasNext()){
            System.out.println(2+": "+ite.next());
        }
        //3
        if (ite.hasNext()){
            System.out.println(3+": "+ite.next());
        }
        //4
        if (ite.hasNext()){
            System.out.println(4+": "+ite.next());
        }
        //5
        if (ite.hasNext()){
            System.out.println(5+": "+ite.next());
        }
        //6
        if (ite.hasNext()){
            System.out.println(6+ite.next());
        }

        //进行循环遍历
        System.out.println("=====使用while循环=====");
        //创建迭代器
        Iterator<String> itr = list.iterator();
        int i = 1;
        while (itr.hasNext()){
            String str = itr.next();//一般会先取值，再使用。
            System.out.println((i++)+": "+str);
        }



    }

}
