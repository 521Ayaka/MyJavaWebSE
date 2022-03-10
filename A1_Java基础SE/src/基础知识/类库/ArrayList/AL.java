package 基础知识.类库.ArrayList;

import java.util.ArrayList;

public class AL {
    public static void main(String[] args) {
        ArrayList <Integer> arraylist = new ArrayList<>();

        //Method 1
        arraylist.add(5);
        arraylist.add(2);
        arraylist.add(2);
        boolean v = arraylist.add(1);
        System.out.println("添加最后一号元素是否成功：" + v);
        System.out.println(arraylist);

        //Method 2
        System.out.println("第0号元素为：" + arraylist.get(0));
        System.out.println("第3号元素为：" + arraylist.get(3));

        //Method 3
        int i = arraylist.size();
        System.out.println("数组的长度为A" + i);

        //Method 4
        int n = arraylist.remove(2);
        System.out.println("删除的元素是" + n);
        System.out.println(arraylist);



    }
}
