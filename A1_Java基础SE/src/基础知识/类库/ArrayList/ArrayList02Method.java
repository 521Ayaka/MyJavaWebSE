package 基础知识.类库.ArrayList;

import java.util.ArrayList;

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
public class ArrayList02Method {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        System.out.println("以创建arraylist数组");

        System.out.println("开始添加第一个元素...");
        boolean v = array.add("尴尬酱");  // 1
        //注意：对ArrayList来说，add添加动作一定会成功，だから返回值可以不用，
        //     但是对于其他的集合（今后还会学）来说，add添加不一定成功。

        System.out.println("添加是否成功：" + v );
        System.out.println("添加的元素为：" + array.get(0));  // 2

        System.out.println("继续添加元素...");

        array.add("尴尬酱万岁");// 2
        array.add("(っ °Д °;)っ");// 2
        array.add("一起LOL吧");// 2
        array.add("( *^-^)ρ(*╯^╰)");// 2
        array.add("尴尬了 ≡(▔﹏▔)≡");
        System.out.println("添加完成!");// 2

        System.out.println("数组长度为：" + array.size());//
        System.out.println("开始打印数组...");
        System.out.println("打印结果为：" + array);

        System.out.println("开始删除最后一个元素...");
        System.out.println("已删除...");

        String str = array.remove( array.size() - 1 ); // 3 and 2
        //注意：这也有个返回值，也可以不用 array.remove(5);

        System.out.println("删除的元素是：" + str );

        System.out.println("开始重新打印数组...");
        System.out.println("打印的数组为：" + array);

        //遍历打印
        System.out.println("开始进行数组便利打印...");
        System.out.println("打印结果：");
        System.out.println();
        for (int i = 0; i < array.size(); i++ ){
            System.out.println(array.get(i));
        }
//        for (String s : array) {
//            System.out.println(s);
//        }
        System.out.println();
        System.out.println("打印结束...");
        System.out.println("程序结束... ...");


    }
}