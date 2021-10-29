package 基础知识.集合.Collections工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
1:构造方法私有化，不能创建对象
private Collections() {
}

2:成员变量静态化; 成员方法静态化;

所以，Collections是一个工具类。

API描述：
此类完全由在 collection 上进行操作或返回 collection 的静态方法组成。
它包含在 collection 上操作的多态算法，即“包装器”，
包装器返回由指定 collection 支持的新 collection，以及少数其他内容。

说明:【Collections类是针对集合操作的工具类】

常用的方法
--public static <T extends Comparable<? sup T> > void sort(List<T> list): 将指定的列表按升序排列

--public static void reverse(List<?> list):            反转指定的列表中的元素的顺序。

--public static void shuffle(List<?> list):            使用默认的随机源随机排列指定的列表。
*/
public class TestCollection {
    //启动
    public static void main(String[] args) {
        new TestCollection().init();
    }

    public void init(){
        //初始化
        System.out.println("===============================================================");


        //先创建一个List集合
        List<String> list = new ArrayList<>();
        list.add("3问君能有几多愁");
        list.add("4剑圣塔下达不溜");
        list.add("1风萧萧兮易水寒");
        list.add("2壮士一去兮不复还");

        //通过Collections工具类修改数组

        //public static <T extends Comparable<? sup T> > void sort(List<T> list): 将指定的列表按升序排列
        Collections.sort(list);
        System.out.println(list);
        //[1风萧萧兮易水寒, 2壮士一去兮不复还, 3问君能有几多愁, 4剑圣塔下达不溜]

        System.out.println("===============================================================");

        //public static void reverse(List<?> list):            反转指定的列表中的元素的顺序。
        Collections.reverse(list);
        System.out.println(list);
        //[4剑圣塔下达不溜, 3问君能有几多愁, 2壮士一去兮不复还, 1风萧萧兮易水寒]

        System.out.println("===============================================================");

        //public static void shuffle(List<?> list):            使用默认的随机源随机排列指定的列表。
        Collections.shuffle(list);
        System.out.println(list);
        //[2壮士一去兮不复还, 1风萧萧兮易水寒, 3问君能有几多愁, 4剑圣塔下达不溜]

        System.out.println("===============================================================");

        List<String> listE;
        Collections.shuffle(list);
        System.out.println(list);
    }

}
