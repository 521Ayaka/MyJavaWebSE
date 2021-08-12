package A1_MyJava.基础知识.类量.B接口作为方法的参数;
/*

java.util.List正是ArrayList所实现的接口
public class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable
{......}


*/

import java.util.ArrayList;
import java.util.List;

public class Interface {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        //使用多态写法
        List<String> list = new ArrayList<>();
        //调用addNames() 传入参数空list ， 返回add后的list
        List<String> 卢本伟 = addNames( list);
        //遍历集合
        for (int i = 0; i < 卢本伟.size(); i++) {
            System.out.println(卢本伟.get(i));
        }
    }


    //参数获取list集合，添加元素本返回新list集合
    public static List<String> addNames(List<String> list){
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        list.add("沙扬娜拉");
        return list;
    }



}
