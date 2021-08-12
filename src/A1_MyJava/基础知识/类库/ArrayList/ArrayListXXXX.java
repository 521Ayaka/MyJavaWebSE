package A1_MyJava.基础知识.类库.ArrayList;

import java.util.ArrayList;

public class ArrayListXXXX {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        //使用add()方法添加元素，返回值是一个boolean值；
        list.add("君不见");
        list.add("黄河之水天上来");
        list.add("奔流到海不复还");
        list.add("君不见");
        list.add("高堂明镜悲白发");
        boolean b = list.add("朝如青丝暮成雪");

        list.add("李白");

        System.out.println("是否成功添加第5号元素");
        System.out.println(b);

        System.out.println("=====================================================");

        //使用get(int index)方法获取集合中的元素；
        for (int i = 0; i < list.size() ; i++) {
            System.out.println("list["+i+"]"+"="+list.get(i));
        }

        System.out.println("=====================================================");

        //使用remove(int index)方法进行删除集合中的元素；
        String libai = list.remove(6);
        System.out.println("删除的元素内容为："+libai);

        System.out.println("=====================================================");

        //使用size(无参)方法，获取元素长度
        int leng = list.size();
        System.out.println("集合中元素个数为：" + leng);

        System.out.println("=====================================================");

        //遍历集合
        System.out.println("进行便利集合");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list["+i+"]"+"="+list.get(i));
        }
    }

}
/*
ArrayList常用的Method

1.public boolean add(E e){...} :向集合中添加元素，参数的类和和泛型相同，返回值代表添加成功。
  注意：对ArrayList来说，add添加动作一定会成功，だから返回值可以不用，
       但是对于其他的集合（今后还会学）来说，add添加不一定成功。

2.public E get(int index){...} :重集合中获取元素，所以参数才是int，index是索引值。

3.public E remove(int index){...} :从集合当中删除元素，参数是索引编号，返回值是元素内容。

4.public int size(){...}  :获取元素的长度，返回值就是元素长度。

数组的遍历 使用for循环

*/
