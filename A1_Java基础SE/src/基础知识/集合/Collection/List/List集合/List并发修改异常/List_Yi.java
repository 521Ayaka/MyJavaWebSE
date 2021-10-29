package 基础知识.集合.Collection.List.List集合.List并发修改异常;
/*
现在有一个需求：
           我有一个集合: List<String> list = new ArrayList<String>();
           里面有三个元素: list.add("亚索");list.add("永恩");list.add("万豪");
           遍历集集合，得到每一个元素，看有没有元素[亚索]，如果有，我就添加一个元素[牛批,卢本伟没有开挂！]，请写代码实现
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Yi {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("亚索");
        list.add("永恩");
        list.add("万豪");

        //这个是【重点=！！！！！【并发修改异常】
        Iterator<String> itr = list.iterator();
//        while (itr.hasNext()){
//            String str = itr.next();
//            if (str.equals("亚索")){
//                list.add("牛批,卢本伟没有开挂！");
//            }
//        }
        /**异常报错：
        Exception in thread "main" java.util.ConcurrentModificationException
        at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
        at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
        at MyJava.基础知识.集合.Collection.List.List集合.List并发修改异常.List_Yi.main(List_Yi.java:24)

        异常分析在：List并发修改异常的源码.md 文件当中。
        */


        //正确使用:
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.equals("亚索")){
                list.add("牛批,卢本伟没有开挂！");
            }
        }
        System.out.println(list);
        //for循环，y y d s
    }

}
