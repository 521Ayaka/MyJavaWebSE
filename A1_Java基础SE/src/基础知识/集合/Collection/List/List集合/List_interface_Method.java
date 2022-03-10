package 基础知识.集合.Collection.List.List集合;

import java.util.ArrayList;
import java.util.List;

/*

List集合特有方法:

void add(int index, E element)   再此集合中的指定位置插入指定的元素。
E remove(int index)              删除指定索引处的元素，返回被删除的元素。
E set(int index, E element)      修改指定位置处的元素，返回被修改的元素。
E get(int index)                 返回指定索引处的元素。

[注意]:
remove set get 方法的参数 index 可能会引发索引越界异常，使用时不能越界。
*/
public class List_interface_Method {

    public static void main(String[] args) {

        //void add(int index, E element)   再此集合中的指定位置插入指定的元素。
        System.out.print("1: ");
        List<Double> list1 = new ArrayList<>();
        list1.add(0.0);
        list1.add(1.0);
        list1.add(2.0);
        list1.add(3.0);
        list1.add(2,1.5);
        System.out.println(list1);//[0.0, 1.0, 1.5, 2.0, 3.0]
        System.out.println("list1[2] = "+list1.get(2));//结果是：1.5
        //也就是说，再index参数索引位置添加元素,最终这个元素将在此index索引位置，而原来这个index位置及后面的元素将会向后移动一个说索引值。
        //list1.add(7,6.66);  //.IndexOutOfBoundsException 索引越界异常！！！

        System.out.println("=========================================================================================");

        //E remove(int index)              删除指定索引处的元素，返回被删除的元素。
        System.out.print("2: ");
        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        int LIST_2 = list2.remove(0);
        System.out.println(list2);//结果是: [1, 2, 3]
        System.out.println("被删除的元素是: "+ LIST_2);//被删除的元素是: 0

        System.out.println("=========================================================================================");

        //E set(int index, E element)      修改指定位置处的元素，返回被修改的元素。
        System.out.print("3: ");
        List<Integer> list3 = new ArrayList<>();
        list3.add(0);
        list3.add(1);
        list3.add(2);
        list3.add(3);
        int LIST_3 = list3.set(0, 666);
        System.out.println(list3);//[666, 1, 2, 3]
        System.out.println("被修改的原元素是: "+LIST_3);//被修改的原元素是: 0

        System.out.println("=========================================================================================");

        //E get(int index)                 返回指定索引处的元素。
        System.out.print("4: ");
        List<Integer> list4 = new ArrayList<>();
        list4.add(0);
        list4.add(1);
        list4.add(2);
        list4.add(3);
        System.out.print("[");
        for (int i = 0; i < list4.size(); i++) {
            if (i != (list4.size()-1)){
                System.out.print(list4.get(i)+",");
            } else {
                System.out.print(list4.get(i));
            }
        }
        System.out.println("]");

        System.out.println("=========================================================================================");

    }

}
