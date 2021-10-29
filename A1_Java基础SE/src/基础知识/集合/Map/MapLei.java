package 基础知识.集合.Map;
/*
Map集合概述:

1. interface Map<K,V> K: 键的类型;  V: 值的类型
2. 将键映射到值的对象; 不能包含重复的键; 每个键可以映射到最多一个值;

*/
import java.util.HashMap;
import java.util.Map;

public class MapLei {

    public static void main(String[] args) {

        //用多态的方法创建Map集合对象
        Map<String, String> map = new HashMap<String, String>();

        //添加映射 使用put方法： V put(K key, V value);
        map.put("吟留的诗人","温迪");
        map.put("天动万象","钟离");
        map.put("无想的一刀","巴尔");
        map.put("天动万象","摩拉克斯");//键值是唯一的，当有这个键时，后面的值会替换以前的值

        //输出打印
        System.out.println(map);
        //重写toString后的输出结果 ：{无想的一刀=巴尔, 吟留的诗人=温迪, 天动万象=钟离}
        //结果也是无序的。


    }

}
