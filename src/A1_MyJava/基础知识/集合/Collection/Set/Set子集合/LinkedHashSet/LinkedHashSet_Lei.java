package A1_MyJava.基础知识.集合.Collection.Set.Set子集合.LinkedHashSet;

/*
LinkedHashSet集合概述和特点:
1. [哈希表]和[链表]实现的Set接口，具有可预测的迭代次序
2. 由[链表]保证元素有序，也就是说元素的存储和取出顺序是一致的
3. 由[哈希表]保证元素唯一，也就是说没有重复的元素。


*/

import java.util.LinkedHashSet;

public class LinkedHashSet_Lei {

    public static void main(String[] args) {

        //创建LinkedHashList集合对象
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        //添加元素
        linkedHashSet.add("尴尬");
        linkedHashSet.add("问君能有几多愁");
        linkedHashSet.add("恰似一江春水向东流");
        linkedHashSet.add("尴尬");//重复元素

        //遍历集合
        for (String str :
                linkedHashSet) {
            System.out.println(str);
        }/*
        尴尬
        问君能有几多愁
        恰似一江春水向东流
        */


    }

}
