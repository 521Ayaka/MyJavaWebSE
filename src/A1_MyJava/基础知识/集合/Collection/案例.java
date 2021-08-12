package A1_MyJava.基础知识.集合.Collection;

import java.util.*;

/*
[要求]:
编写一个程序,获取10个1~20之间的随机整数，要求随机数不能重复，并在控制台输出。

[延申]:
升序排列，降序排列
*/
public class 案例 {

    public static void main(String[] args) {

        Random ran = new Random();

        //[要求]:编写一个程序,获取10个1~20之间的随机整数，要求随机数不能重复，并在控制台输出。
        //创建集合对象
        Collection<Integer> set1 = new HashSet<>();

        //添加元素
        while (set1.size()<10){
            set1.add(ran.nextInt(20)+1);
        }

        //遍历集合
        for (int num :
                set1) {
            System.out.println(num);
        }

        System.out.println("=================");


        //[延申]:升序排列，降序排列

        //升序：使用TreeSet集合,自然排序
        TreeSet<Integer> set2 = new TreeSet<>();
        //添加元素
        while (set2.size()<10){
            set2.add(ran.nextInt(20)+1);
        }
        //遍历集合
        for (int num :
                set2) {
            System.out.println(num);
        }

        System.out.println("=================");

        //降序排列 TreeSet集合,比较排序
        TreeSet<Integer> set3 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        //添加元素
        while (set3.size()<10){
            set3.add(ran.nextInt(20)+1);
        }
        //遍历集合
        Iterator<Integer> itr = set3.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
