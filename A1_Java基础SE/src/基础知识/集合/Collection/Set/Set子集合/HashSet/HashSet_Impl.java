package 基础知识.集合.Collection.Set.Set子集合.HashSet;
/*
[HashSet集合特点]:

1. 底层数据结构是哈希表
2. 对集合的迭代顺序不作任何保证, 也就是说不保证存储和取出的元素顺序一致
3. 没有带索引的方法, 所以不能使用普通for循环遍历
4. 由于是Set集合, 所以是不包含重复元素的集合

*/

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Impl {

    public static void main(String[] args) {

        //创建对象
        HashSet<String> hashSet = new HashSet<>();
        //添加元素
        hashSet.add("亚索");
        hashSet.add("哥哥");
        hashSet.add("你好浪");
        hashSet.add("亚索");//重复元素
        hashSet.add("哥哥");//重复元素
        System.out.println("================");
        System.out.println(hashSet.add("亚索"));//重复元素

        //遍历
        Iterator<String> itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("=======");
        for (String name :
                hashSet) {
            System.out.println(name);
        }


    }

}
