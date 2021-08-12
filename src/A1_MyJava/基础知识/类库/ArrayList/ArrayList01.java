package A1_MyJava.基础知识.类库.ArrayList;
/*
使用ArrayMethod，数组的长度不可以发生改变。
但ArrayList集合的长度可以随意发生改变。

1.导包
import java.util.ArrayList;

2.创建
ArrayList<类型> list = new ArrayList<>();

注意：
对于ArrayList来说，都有一对<>代表 ” 泛型 “
泛型 只能引用类型，不能是基本类型。

3.使用


 */
import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        //创建时 右边要带<>内容可以不写，但<>必须要带！

        System.out.println(list);
        //对ArrayListL集合来说，直接打印得到的不是地址值，而是内容。
        System.out.println("==========================");

        list.add("gangajiang");
        System.out.println(list);

        list.add("就是");
        list.add("尴尬酱");
        list.add("二次元");
        list.add("大好");
        System.out.println(list);

        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(2);
        array.add(1);
        System.out.println(array);

    }
}
