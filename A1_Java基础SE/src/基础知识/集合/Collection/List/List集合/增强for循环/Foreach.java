package 基础知识.集合.Collection.List.List集合.增强for循环;

/*
增强for循环
增强for: 简化数组和Collection集合的遍历。

Collection继承了Iterable接口
在【Iterable 接口里面一个 iterator()抽象方法。】！！！
实现这个接口允许对象成为 "foreach" 语句的目标。

[概述]:
1. 实现了Iterable接口的类允许其对象成为增强型for语句的目标
2. 它是JDK5之后出现的，其内部原理是一个Iterator迭代器。

[格式]:
for(元素数据类型 变量名: 数组/Collection集合){
   //使用变量即可，该变量就是元素
}

[]
*/
public class Foreach {

    public static void main(String[] args) {

        int [] array = {0,1,3,4,5,6};
        for (int num : array) {
            System.out.println(num);
        }
        System.out.println("====");
        //在IDEA里面输入foreach可以快速使用
        for (int num :
                array) {
            System.out.println(num);
        }

    }

}
