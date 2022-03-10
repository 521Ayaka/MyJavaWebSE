package 基础知识.考试作业.第一次作业.题目2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Array_Method {

    public static void main(String[] args) {

        String str = "ABCDEFG";
        //先进行转换为数组   img_toCharArray_method.png
        char[] chars = str.toCharArray();

        //进行反转    img_Array_操作_笔记.png

        method1(chars);//方法一
        System.out.println("回归");
        method1(chars);

        System.out.println("==================");

        method2(chars);//方法二

        System.out.println("==================");

        //转换为字符串    String的三种创建方式之 char[]创建。
        String StringNewCharArray = new String(chars);

        System.out.println("新字符串:"+StringNewCharArray);


    }

    //方法一
    public static void method1(char[] chars){
        for (int min = 0 , max = chars.length-1; min < max; min++,max--){
            char ling = chars[min];
            chars[min] = chars[max];
            chars[max] = ling;
        }
        //进行遍历验证
        for (char ch:chars
        ) {
            System.out.println(ch);
        }
    }

    //方法二 刚学的集合，就用集合吧。
    public static void method2(char[] chars){
        List<Character> arrayList = new ArrayList<Character>();
        for (int i = 0; i < chars.length; i++) {
            arrayList.add(chars[i]);
        }
        //反转的方法
        Collections.reverse(arrayList);
        //把list集合重新赋值给chars集合
        for (int i = 0; i < chars.length; i++) {
            chars[i] = arrayList.get(i);
        }

        //使用迭代器进行遍历
        Iterator<Character> itr = arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
